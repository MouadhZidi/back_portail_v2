package com.arabsoft.ajir.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="AUTORISATION_SORT")
public class Autorisation {
	
	@EmbeddedId
	private AutorisationPK id;
	
	@Column(insertable = false,updatable = false)
	private String cod_soc;	
	@Column(insertable = false,updatable = false)
	private String  mat_pers;	
	@Column(insertable = false,updatable = false)
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dat_debut_aut;
	@Column(insertable = false,updatable = false)
	private Long num_aut;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dat_fin_aut;  
	private String  cod_aut;

	private Long   min_s  ;
	private Long   heur_r  ;
	private Long   min_r   ;
	private Long 	  duree   ;
	  private Date   dat_decision ;
	  private String 	  num_decision;
	  private String 	  obs_aut  ;
	  private String 	  cod_ur     ;
	  private String 	  cod_serv   ;
	  private String 	  cod_class   ;
	  private String 	  cod_metier   ;
	  private String 	  poste_trav  ;
	  private String 	  org_serv  ;
	  private Date 	  dat_saisie   ;
	  private Date 	  dat_maj  ;
	  private String   cod_user;
	  private Long 	  duree_m   ;
	  private String 	  typ_aut  ;
	  private Long 	  duree_j  ;
	  private String 	  lun    ;
	  private String 	  mar ;
	  private String 	  mer    ;
	  private String 	  jeu   ;
	  private String 	  ven  ;
	  private String   sam        ;
	  private String   etat_auto  ;
	  private String lib_aut;
	  
	  
	  
	public AutorisationPK getId() {
		return id;
	}
	public void setId(AutorisationPK id) {
		this.id = id;
	}
	public String getLib_aut() {
		return lib_aut;
	}
	public void setLib_aut(String lib_aut) {
		this.lib_aut = lib_aut;
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
	public Date getDat_fin_aut() {
		return dat_fin_aut;
	}
	public void setDat_fin_aut(Date dat_fin_aut) {
		this.dat_fin_aut = dat_fin_aut;
	}
	public String getCod_aut() {
		return cod_aut;
	}
	public void setCod_aut(String cod_aut) {
		this.cod_aut = cod_aut;
	}
	public Long getMin_s() {
		return min_s;
	}
	public void setMin_s(Long min_s) {
		this.min_s = min_s;
	}
	public Long getHeur_r() {
		return heur_r;
	}
	public void setHeur_r(Long heur_r) {
		this.heur_r = heur_r;
	}
	public Long getMin_r() {
		return min_r;
	}
	public void setMin_r(Long min_r) {
		this.min_r = min_r;
	}
	public Long getDuree() {
		return duree;
	}
	public void setDuree(Long duree) {
		this.duree = duree;
	}
	public Date getDat_decision() {
		return dat_decision;
	}
	public void setDat_decision(Date dat_decision) {
		this.dat_decision = dat_decision;
	}
	public String getNum_decision() {
		return num_decision;
	}
	public void setNum_decision(String num_decision) {
		this.num_decision = num_decision;
	}
	public String getObs_aut() {
		return obs_aut;
	}
	public void setObs_aut(String obs_aut) {
		this.obs_aut = obs_aut;
	}
	public String getCod_ur() {
		return cod_ur;
	}
	public void setCod_ur(String cod_ur) {
		this.cod_ur = cod_ur;
	}
	public String getCod_serv() {
		return cod_serv;
	}
	public void setCod_serv(String cod_serv) {
		this.cod_serv = cod_serv;
	}
	public String getCod_class() {
		return cod_class;
	}
	public void setCod_class(String cod_class) {
		this.cod_class = cod_class;
	}
	public String getCod_metier() {
		return cod_metier;
	}
	public void setCod_metier(String cod_metier) {
		this.cod_metier = cod_metier;
	}
	public String getPoste_trav() {
		return poste_trav;
	}
	public void setPoste_trav(String poste_trav) {
		this.poste_trav = poste_trav;
	}
	public String getOrg_serv() {
		return org_serv;
	}
	public void setOrg_serv(String org_serv) {
		this.org_serv = org_serv;
	}
	public Date getDat_saisie() {
		return dat_saisie;
	}
	public void setDat_saisie(Date dat_saisie) {
		this.dat_saisie = dat_saisie;
	}
	public Date getDat_maj() {
		return dat_maj;
	}
	public void setDat_maj(Date dat_maj) {
		this.dat_maj = dat_maj;
	}
	public String getCod_user() {
		return cod_user;
	}
	public void setCod_user(String cod_user) {
		this.cod_user = cod_user;
	}
	public Long getDuree_m() {
		return duree_m;
	}
	public void setDuree_m(Long duree_m) {
		this.duree_m = duree_m;
	}
	public String getTyp_aut() {
		return typ_aut;
	}
	public void setTyp_aut(String typ_aut) {
		this.typ_aut = typ_aut;
	}
	public Long getDuree_j() {
		return duree_j;
	}
	public void setDuree_j(Long duree_j) {
		this.duree_j = duree_j;
	}
	public String getLun() {
		return lun;
	}
	public void setLun(String lun) {
		this.lun = lun;
	}
	public String getMar() {
		return mar;
	}
	public void setMar(String mar) {
		this.mar = mar;
	}
	public String getMer() {
		return mer;
	}
	public void setMer(String mer) {
		this.mer = mer;
	}
	public String getJeu() {
		return jeu;
	}
	public void setJeu(String jeu) {
		this.jeu = jeu;
	}
	public String getVen() {
		return ven;
	}
	public void setVen(String ven) {
		this.ven = ven;
	}
	public String getSam() {
		return sam;
	}
	public void setSam(String sam) {
		this.sam = sam;
	}
	public String getEtat_auto() {
		return etat_auto;
	}
	public void setEtat_auto(String etat_auto) {
		this.etat_auto = etat_auto;
	}
	public Autorisation(AutorisationPK id, String cod_soc, String mat_pers, Date dat_debut_aut, Long num_aut,
			Date dat_fin_aut, String cod_aut, Long min_s, Long heur_r, Long min_r, Long duree, Date dat_decision,
			String num_decision, String obs_aut, String cod_ur, String cod_serv, String cod_class, String cod_metier,
			String poste_trav, String org_serv, Date dat_saisie, Date dat_maj, String cod_user, Long duree_m,
			String typ_aut, Long duree_j, String lun, String mar, String mer, String jeu, String ven, String sam,
			String etat_auto, String lib_aut) {
		super();
		this.id = id;
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.dat_debut_aut = dat_debut_aut;
		this.num_aut = num_aut;
		this.dat_fin_aut = dat_fin_aut;
		this.cod_aut = cod_aut;
		this.min_s = min_s;
		this.heur_r = heur_r;
		this.min_r = min_r;
		this.duree = duree;
		this.dat_decision = dat_decision;
		this.num_decision = num_decision;
		this.obs_aut = obs_aut;
		this.cod_ur = cod_ur;
		this.cod_serv = cod_serv;
		this.cod_class = cod_class;
		this.cod_metier = cod_metier;
		this.poste_trav = poste_trav;
		this.org_serv = org_serv;
		this.dat_saisie = dat_saisie;
		this.dat_maj = dat_maj;
		this.cod_user = cod_user;
		this.duree_m = duree_m;
		this.typ_aut = typ_aut;
		this.duree_j = duree_j;
		this.lun = lun;
		this.mar = mar;
		this.mer = mer;
		this.jeu = jeu;
		this.ven = ven;
		this.sam = sam;
		this.etat_auto = etat_auto;
		this.lib_aut = lib_aut;
	}
	public Autorisation() {
		super();
	}
	  
	  
	  
}
