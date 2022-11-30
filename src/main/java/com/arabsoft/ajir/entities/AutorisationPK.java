package com.arabsoft.ajir.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonFormat;

public class AutorisationPK implements Serializable {

	@Column(insertable = false,updatable = false)
	private String cod_soc;	
	
	@Column(insertable = false,updatable = false)
	private String  mat_pers;
	
	@Column(insertable = false, updatable= false )
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dat_debut_aut;	
	
	@Column(insertable = false,updatable = false)
	private Long num_aut;

	public String getCod_soc() {
		return cod_soc;
	}

	public void setCod_soc(String cod_soc) {
		this.cod_soc = cod_soc;
	}

	public String getMat_pers() {
		return mat_pers;
	}

	public void setMat_pers(String mat_pers) {
		this.mat_pers = mat_pers;
	}

	public Date getDat_debut_aut() {
		return dat_debut_aut;
	}

	public void setDat_debut_aut(Date dat_debut_aut) {
		this.dat_debut_aut = dat_debut_aut;
	}

	public Long getNum_aut() {
		return num_aut;
	}

	public void setNum_aut(Long num_aut) {
		this.num_aut = num_aut;
	}

	@Override
	public String toString() {
		return "AutorisationPK [cod_soc=" + cod_soc + ", mat_pers=" + mat_pers + ", dat_debut_aut=" + dat_debut_aut
				+ ", num_aut=" + num_aut + "]";
	}

	public AutorisationPK(String cod_soc, String mat_pers, Date dat_debut_aut, Long num_aut) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.dat_debut_aut = dat_debut_aut;
		this.num_aut = num_aut;
	}

	public AutorisationPK() {
		super();
	}
	
	
	
	
}
