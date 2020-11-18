package com.iheb.jeux.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.iheb.jeux.entities.Jeu;
public interface JeuService {
Jeu saveJeu(Jeu j);
Jeu updateJeu(Jeu j);
void deleteJeu(Jeu j);
 void deleteJeuById(Long id);
Jeu getJeu(Long id);
List<Jeu> getAllJeux();
Page<Jeu> getAllJeuxParPage(int page, int size);
List<Jeu> findByGenreIdGen(Long idGen);
}
