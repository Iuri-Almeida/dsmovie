package br.com.ialmeida.dsmovie.services;

import br.com.ialmeida.dsmovie.dtos.MovieDTO;
import br.com.ialmeida.dsmovie.dtos.ScoreDTO;
import br.com.ialmeida.dsmovie.entities.Movie;
import br.com.ialmeida.dsmovie.entities.Score;
import br.com.ialmeida.dsmovie.entities.User;
import br.com.ialmeida.dsmovie.repositories.MovieRepository;
import br.com.ialmeida.dsmovie.repositories.ScoreRepository;
import br.com.ialmeida.dsmovie.repositories.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ScoreService {

    public MovieRepository movieRepository;

    public UserRepository userRepository;

    public ScoreRepository scoreRepository;

    public ScoreService(MovieRepository movieRepository, UserRepository userRepository, ScoreRepository scoreRepository) {
        this.movieRepository = movieRepository;
        this.userRepository = userRepository;
        this.scoreRepository = scoreRepository;
    }

    @Transactional
    public MovieDTO saveScore(ScoreDTO scoreDTO) {
        User user = userRepository.findByEmail(scoreDTO.getEmail());
        if (user == null) {
            user = new User();
            user.setEmail(scoreDTO.getEmail());
            user = userRepository.saveAndFlush(user);
        }

        Movie movie = movieRepository.findById(scoreDTO.getMovieId()).get();

        Score score = new Score();
        score.setMovie(movie);
        score.setUser(user);
        score.setValue(scoreDTO.getScore());

        score = scoreRepository.saveAndFlush(score);

        double sum = 0.0;
        for (Score s : movie.getScores()) {
            sum += s.getValue();
        }

        double avg = sum / movie.getScores().size();

        movie.setScore(avg);
        movie.setCount(movie.getScores().size());

        movie = movieRepository.save(movie);

        return new MovieDTO(movie);
    }

}
