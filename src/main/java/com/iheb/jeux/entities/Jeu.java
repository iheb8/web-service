package com.iheb.jeux.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Jeu {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idJeu;
private String nomJeu;
private Double prixJeu;
private Date dateCreation;

@ManyToOne
private Genre genre;

public Jeu() {
super();
}
public Jeu(String nomJeu, Double prixJeu, Date dateCreation) {
super();
this.nomJeu = nomJeu;
this.prixJeu = prixJeu;
this.dateCreation = dateCreation;
}


public Long getIdJeu() {
	return idJeu;
}
public void setIdJeu(Long idJeu) {
	this.idJeu = idJeu;
}
public String getNomJeu() {
	return nomJeu;
}
public void setNomJeu(String nomJeu) {
	this.nomJeu = nomJeu;
}
public Double getPrixJeu() {
	return prixJeu;
}
public void setPrixJeu(Double prixJeu) {
	this.prixJeu = prixJeu;
}
public Date getDateCreation() {
	return dateCreation;
}
public void setDateCreation(Date dateCreation) {
	this.dateCreation = dateCreation;
}
@Override
public String toString() {
return "Jeu [idJeu=" + idJeu + ", nomJeu=" +
nomJeu + ", prixJeu=" + prixJeu
+ ", dateCreation=" + dateCreation + "]";
}
public Genre getGenre() {
	return genre;
}
public void setGenre(Genre genre) {
	this.genre = genre;
}
}
