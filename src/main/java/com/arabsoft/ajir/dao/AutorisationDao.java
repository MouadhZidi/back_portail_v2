package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.arabsoft.ajir.entities.Autorisation;
import com.arabsoft.ajir.entities.AutorisationPK;


public interface AutorisationDao extends JpaRepository<Autorisation, AutorisationPK>{
	
	@Query("select r from Autorisation r where r.id.cod_soc=:x and r.id.mat_pers=:y")
	public List<Autorisation> getAutorisstion(@Param("x")String codSoc,@Param("y")String mat);

}
