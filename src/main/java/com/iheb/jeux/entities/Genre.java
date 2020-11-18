package com.iheb.jeux.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Genre {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idGen;
	private String nomGen;
	private String descriptionGen;
	
	@OneToMany (mappedBy = "genre")
	private List<Jeu> jeux;
	
	public Genre() {
		super();

	}
	
	
	
	public long getIdGen() {
		return idGen;
	}
	public void setIdGen(long idGen) {
		this.idGen = idGen;
	}
	public String getNomGen() {
		return nomGen;
	}
	public void setNomGen(String nomGen) {
		this.nomGen = nomGen;
	}
	public String getDescriptionGen() {
		return descriptionGen;
	}
	public void setDescriptionGen(String descriptionGen) {
		this.descriptionGen = descriptionGen;
	}



	public List<Jeu> getJeux() {
		return jeux;
	}



	public void setJeux(List<Jeu> jeux) {
		this.jeux = jeux;
	}
	
	

}
