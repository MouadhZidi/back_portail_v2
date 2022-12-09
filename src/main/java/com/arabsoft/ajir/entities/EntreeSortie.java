package com.arabsoft.ajir.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity	
public class EntreeSortie {

	private String DATE_HIST;
	private Integer ENTREE;
	@Id
	private Integer SORTIE;
	public String getDATE_HIST() {
		return DATE_HIST;
	}
	public void setDATE_HIST(String dATE_HIST) {
		DATE_HIST = dATE_HIST;
	}
	public Integer getENTREE() {
		return ENTREE;
	}
	public void setENTREE(Integer eNTREE) {
		ENTREE = eNTREE;
	}
	public Integer getSORTIE() {
		return SORTIE;
	}
	public void setSORTIE(Integer sORTIE) {
		SORTIE = sORTIE;
	}
	public EntreeSortie(String dATE_HIST, Integer eNTREE, Integer sORTIE) {
		super();
		DATE_HIST = dATE_HIST;
		ENTREE = eNTREE;
		SORTIE = sORTIE;
	}
	public EntreeSortie() {
		super();
	}
	
	
}

