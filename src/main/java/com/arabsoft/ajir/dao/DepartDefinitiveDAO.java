package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.arabsoft.ajir.entities.DepartsDefinitive;

public interface DepartDefinitiveDAO extends JpaRepository<DepartsDefinitive, String>{

	@Query(value="select count(*) total,to_char(date_hist ,'yyyy') DATE_HIST, LIB_TYP_DEPART\r\n"
			+ "from personnel_hist p,type_depart t\r\n"
			+ "where p.cod_typ_depart = t.cod_typ_depart\r\n"
			+ "and to_char(date_hist,'dd/mm') = '31/12'"
			+ "and to_char(date_hist ,'yyyy')=:annee\r\n"
			+ "and to_char(dat_depart ,'yyyy')=to_char(date_hist ,'yyyy')\r\n"
			+ "group by to_char(date_hist ,'yyyy'),LIB_TYP_DEPART\r\n"
			+ "order by  date_hist",nativeQuery = true)
	public List<DepartsDefinitive> GetDepartsDefinitive(@Param("annee") String annee);
}
