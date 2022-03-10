package br.com.ialmeida.dsmovie.repositories;

import br.com.ialmeida.dsmovie.entities.Score;
import br.com.ialmeida.dsmovie.entities.ScorePK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
}
