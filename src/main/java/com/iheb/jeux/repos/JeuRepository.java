package com.iheb.jeux.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.iheb.jeux.entities.Jeu;

@RepositoryRestResource(path = "rest")
public interface JeuRepository extends JpaRepository <Jeu, Long> {
}