package com.iheb.jeux.entities;

@Projection(name = "nomJ", types = { Jeu.class })
public interface JeuProjection {
	public String getNomJeu();
	}


