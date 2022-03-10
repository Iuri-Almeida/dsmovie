package br.com.ialmeida.dsmovie.services;

import br.com.ialmeida.dsmovie.dtos.MovieDTO;
import br.com.ialmeida.dsmovie.entities.Movie;
import br.com.ialmeida.dsmovie.repositories.MovieRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class MovieService {

    public MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Transactional(readOnly = true)
    public Page<MovieDTO> findAll(Pageable pageable) {
        Page<Movie> result = movieRepository.findAll(pageable);
        return result.map(MovieDTO::new);
    }

    @Transactional(readOnly = true)
    public MovieDTO findById(Long id) {
        Optional<Movie> result = movieRepository.findById(id);
        if (result.isEmpty()) {
            throw new RuntimeException("Could not find movie with id = " + id);
        }
        return new MovieDTO(result.get());
    }
}
