package com.arabsoft.ajir.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Effectif {
	
	@Id
	private String ANNEE;
	private String LIB_CAT;
	private String LIB_GRAD;
	private String LIB_SERV;
	private String SEXE;
	
	private String t;
	private String c;
	private String TAUX_TURN_OVER;
	private String TAUX_EMBAUCHE;
	public String getANNEE() {
		return ANNEE;
	}
	public void setANNEE(String aNNEE) {
		ANNEE = aNNEE;
	}
	public String getLIB_CAT() {
		return LIB_CAT;
	}
	public void setLIB_CAT(String lIB_CAT) {
		LIB_CAT = lIB_CAT;
	}
	public String getLIB_GRAD() {
		return LIB_GRAD;
	}
	public void setLIB_GRAD(String lIB_GRAD) {
		LIB_GRAD = lIB_GRAD;
	}
	public String getLIB_SERV() {
		return LIB_SERV;
	}
	public void setLIB_SERV(String lIB_SERV) {
		LIB_SERV = lIB_SERV;
	}
	public String getSEXE() {
		return SEXE;
	}
	public void setSEXE(String sEXE) {
		SEXE = sEXE;
	}
	
	public String getTAUX_TURN_OVER() {
		return TAUX_TURN_OVER;
	}
	public void setTAUX_TURN_OVER(String tAUX_TURN_OVER) {
		TAUX_TURN_OVER = tAUX_TURN_OVER;
	}
	public String getTAUX_EMBAUCHE() {
		return TAUX_EMBAUCHE;
	}
	public void setTAUX_EMBAUCHE(String tAUX_EMBAUCHE) {
		TAUX_EMBAUCHE = tAUX_EMBAUCHE;
	}
	public String getT() {
		return t;
	}
	public void setT(String t) {
		this.t = t;
	}
	public String getC() {
		return c;
	}
	public void setC(String c) {
		this.c = c;
	}
	public Effectif(String aNNEE, String lIB_CAT, String lIB_GRAD, String lIB_SERV, String sEXE, String t, String c,
			String tAUX_TURN_OVER, String tAUX_EMBAUCHE) {
		super();
		ANNEE = aNNEE;
		LIB_CAT = lIB_CAT;
		LIB_GRAD = lIB_GRAD;
		LIB_SERV = lIB_SERV;
		SEXE = sEXE;
		this.t = t;
		this.c = c;
		TAUX_TURN_OVER = tAUX_TURN_OVER;
		TAUX_EMBAUCHE = tAUX_EMBAUCHE;
	}
	public Effectif() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Effectif {ANNEE=" + ANNEE + ", LIB_CAT=" + LIB_CAT + ", LIB_GRAD=" + LIB_GRAD + ", LIB_SERV=" + LIB_SERV
				+ ", SEXE=" + SEXE + ", t=" + t + ", c=" + c + ", TAUX_TURN_OVER=" + TAUX_TURN_OVER + ", TAUX_EMBAUCHE="
				+ TAUX_EMBAUCHE + "}";
	}
	
	
	
	
	
	
}
