package com.arabsoft.ajir.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Demo {

    private String cod_soc;
    @Id
    private String mat_pers;
    private String nom_prenom;
    private String num_dcng;
    private String annee_cng;
    private String code_m;
    private String lib_cng;
    private String dat_dcng;
    private String dat_debut;
    private String dat_fin;
    private String ouvrable;
    private String code_serve;
    
	public String getCode_serve() {
		return code_serve;
	}
	public void setCode_serve(String code_serve) {
		this.code_serve = code_serve;
	}
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
	public String getNom_prenom() {
		return nom_prenom;
	}
	public void setNom_prenom(String nom_prenom) {
		this.nom_prenom = nom_prenom;
	}
	public String getNum_dcng() {
		return num_dcng;
	}
	public void setNum_dcng(String num_dcng) {
		this.num_dcng = num_dcng;
	}
	public String getAnnee_cng() {
		return annee_cng;
	}
	public void setAnnee_cng(String annee_cng) {
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
	public String getDat_dcng() {
		return dat_dcng;
	}
	public void setDat_dcng(String dat_dcng) {
		this.dat_dcng = dat_dcng;
	}
	public String getDat_debut() {
		return dat_debut;
	}
	public void setDat_debut(String dat_debut) {
		this.dat_debut = dat_debut;
	}
	public String getDat_fin() {
		return dat_fin;
	}
	public void setDat_fin(String dat_fin) {
		this.dat_fin = dat_fin;
	}
	public String getOuvrable() {
		return ouvrable;
	}
	public void setOuvrable(String ouvrable) {
		this.ouvrable = ouvrable;
	}
	public Demo(String cod_soc, String mat_pers, String nom_prenom, String num_dcng, String annee_cng, String code_m,
			String lib_cng, String dat_dcng, String dat_debut, String dat_fin, String ouvrable, String code_serve) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.nom_prenom = nom_prenom;
		this.num_dcng = num_dcng;
		this.annee_cng = annee_cng;
		this.code_m = code_m;
		this.lib_cng = lib_cng;
		this.dat_dcng = dat_dcng;
		this.dat_debut = dat_debut;
		this.dat_fin = dat_fin;
		this.ouvrable = ouvrable;
		this.code_serve = code_serve;
	}
	public Demo() {
		super();
	}
	@Override
	public String toString() {
		return "Demo [cod_soc=" + cod_soc + ", mat_pers=" + mat_pers + ", nom_prenom=" + nom_prenom + ", num_dcng="
				+ num_dcng + ", annee_cng=" + annee_cng + ", code_m=" + code_m + ", lib_cng=" + lib_cng + ", dat_dcng="
				+ dat_dcng + ", dat_debut=" + dat_debut + ", dat_fin=" + dat_fin + ", ouvrable=" + ouvrable
				+ ", code_serve=" + code_serve + "]";
	}

    
}
