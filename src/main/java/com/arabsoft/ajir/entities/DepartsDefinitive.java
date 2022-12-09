package com.arabsoft.ajir.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DepartsDefinitive {

	@Column(insertable = false, updatable = false)
	@Id
	private String total;
	private String DATE_HIST;
	private String LIB_TYP_DEPART;

	
	
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public String getDATE_HIST() {
		return DATE_HIST;
	}
	public void setDATE_HIST(String dATE_HIST) {
		DATE_HIST = dATE_HIST;
	}
	public String getLIB_TYP_DEPART() {
		return LIB_TYP_DEPART;
	}
	public void setLIB_TYP_DEPART(String lIB_TYP_DEPART) {
		LIB_TYP_DEPART = lIB_TYP_DEPART;
	}
	public DepartsDefinitive(String total, String dATE_HIST, String lIB_TYP_DEPART) {
		super();
		this.total = total;
		DATE_HIST = dATE_HIST;
		LIB_TYP_DEPART = lIB_TYP_DEPART;
	}
	public DepartsDefinitive() {
		super();
	}
	
	
}
