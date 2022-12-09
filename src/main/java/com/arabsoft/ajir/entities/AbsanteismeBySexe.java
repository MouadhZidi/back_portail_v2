package com.arabsoft.ajir.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class AbsanteismeBySexe {
	private String sexe;
	@Id
	private String d;
	private String DATE_HIST;
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public String getD() {
		return d;
	}
	public void setD(String d) {
		this.d = d;
	}
	
	public String getDATE_HIST() {
		return DATE_HIST;
	}
	public void setDATE_HIST(String dATE_HIST) {
		DATE_HIST = dATE_HIST;
	}
	public AbsanteismeBySexe(String sexe, String d) {
		super();
		this.sexe = sexe;
		this.d = d;
	}
	public AbsanteismeBySexe() {
		super();
	}
	
	
	
}
