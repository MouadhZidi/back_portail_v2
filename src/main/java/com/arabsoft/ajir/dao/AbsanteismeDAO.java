package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.arabsoft.ajir.entities.Absanteisme;
import com.arabsoft.ajir.entities.BulletinH;

@Repository
public interface AbsanteismeDAO extends JpaRepository<Absanteisme, String> {
	@Query(value="select to_char(d.dat_debut,'yyyy') DATE_HIST,j.lib_mot,s.lib_serv,nvl(p.sexe,'M') sexe,SUM(D.NBR_JOURS)d\r\n"
			+ "from dem_cng d,service s,motif_j j,personnel p\r\n"
			+ "where d.cod_soc = p.cod_soc\r\n"
			+ "and d.mat_pers = p.mat_pers\r\n"
			+ "and d.valid ='O'\r\n"
			+ "and d.cod_serv = s.cod_serv\r\n"
			+ "and d.code_m = j.cod_m and s.lib_serv ='Agence  Laghouat'\r\n"
			+ "and to_char(d.dat_debut,'yyyy') > 2010\r\n"
			+ "group by to_char(d.dat_debut,'yyyy') ,j.lib_mot,s.lib_serv,p.sexe\r\n"
			+ "order by to_char(d.dat_debut,'yyyy') ",nativeQuery = true)
	public List<Absanteisme> getAbsanteisme();

}