package com.arabsoft.ajir.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity

public class CongeChef {
	@Id
private String cod_soc;
private String mat_pers;
private String nom_prenom;

private Long num_dcng;
private Long annee_cng;
private String code_m;
private String codeServ;
private String lib_cng;
@JsonFormat(pattern = "dd/MM/yyyy")
private Date dat_dcng;
@JsonFormat(pattern = "dd/MM/yyyy")
private Date dat_debut;
@JsonFormat(pattern = "dd/MM/yyyy")
private Date dat_fin;
private Long ouvrable;
//private Long calandaire;


public String getCod_soc() {
	return cod_soc;
}

public String getCodeServ() {
	return codeServ;
}
public void setCodeServ(String codeServ) {
	this.codeServ = codeServ;
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
public String getNom_prenom() {
	return nom_prenom;
}
public void setNom_prenom(String nom_prenom) {
	this.nom_prenom = nom_prenom;
}
public Long getNum_dcng() {
	return num_dcng;
}
public void setNum_dcng(Long num_dcng) {
	this.num_dcng = num_dcng;
}
public Long getAnnee_cng() {
	return annee_cng;
}
public void setAnnee_cng(Long annee_cng) {
	this.annee_cng = annee_cng;
}
public String getCode_m() {
	return code_m;
}
public void setCode_m(String code_m) {
	this.code_m = code_m;
}
public String getLib_cng() {
	return lib_cng;
}
public void setLib_cng(String lib_cng) {
	this.lib_cng = lib_cng;
}
public Date getDat_dcng() {
	return dat_dcng;
}
public void setDat_dcng(Date dat_dcng) {
	this.dat_dcng = dat_dcng;
}
public Date getDat_debut() {
	return dat_debut;
}
public void setDat_debut(Date dat_debut) {
	this.dat_debut = dat_debut;
}
public Date getDat_fin() {
	return dat_fin;
}
public void setDat_fin(Date dat_fin) {
	this.dat_fin = dat_fin;
}
public Long getOuvrable() {
	return ouvrable;
}
public void setOuvrable(Long ouvrable) {
	this.ouvrable = ouvrable;
}


//public Long getCalandaire() {
//	return calandaire;
//}
//public void setCalandaire(Long calandaire) {
//	this.calandaire = calandaire;
//}
public CongeChef() {
	super();
	// TODO Auto-generated constructor stub
}



}
