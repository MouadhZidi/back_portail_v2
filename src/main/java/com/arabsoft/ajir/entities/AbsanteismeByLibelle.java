package com.arabsoft.ajir.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AbsanteismeByLibelle {

	private String DATE_HIST;
	private String lib_mot;
	@Id
	private String nombre;
	public AbsanteismeByLibelle(String dATE_HIST, String lib_mot, String nombre) {
		super();
		DATE_HIST = dATE_HIST;
		this.lib_mot = lib_mot;
		this.nombre = nombre;
	}
	public String getDATE_HIST() {
		return DATE_HIST;
	}
	public void setDATE_HIST(String dATE_HIST) {
		DATE_HIST = dATE_HIST;
	}
	public String getLib_mot() {
		return lib_mot;
	}
	public void setLib_mot(String lib_mot) {
		this.lib_mot = lib_mot;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public AbsanteismeByLibelle() {
		super();
	}

	
	
	
}
