package br.com.ialmeida.dsmovie.controllers;

import br.com.ialmeida.dsmovie.dtos.MovieDTO;
import br.com.ialmeida.dsmovie.dtos.ScoreDTO;
import br.com.ialmeida.dsmovie.services.ScoreService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {

    private ScoreService scoreService;

    public ScoreController(ScoreService scoreService) {
        this.scoreService = scoreService;
    }

    @PutMapping
    public MovieDTO findById(@RequestBody ScoreDTO scoreDTO) {
        return scoreService.saveScore(scoreDTO);
    }
}
