package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.arabsoft.ajir.entities.Effectif;

@Repository
public interface EffectifDAO extends JpaRepository<Effectif, String> {
	
	
	@Query(value="SELECT  to_char(date_hist,'yyyy') Annee,t.lib_cat,c.lib_grad, s.lib_serv,p.sexe,get_tranche_age(p.dat_nais,p.date_hist)t,count(*)c,\r\n"
			+ "trunc((select count(*)/2  from personnel where ( to_char(dat_emb,'yyyy')= to_char(p.date_hist,'yyyy')) or(to_char(dat_depart,'yyyy') = to_char(p.date_hist,'yyyy')))/\r\n"
			+ "(select count(*) from personnel_hist where\r\n"
			+ "    to_char(date_hist,'yyyy')=  to_char(p.date_hist,'yyyy') and etat_act in('0','1') ) ,4)*100 TAUX_TURN_OVER,\r\n"
			+ "   trunc((select count(*)  from personnel where to_char(dat_emb,'yyyy')= to_char(p.date_hist,'yyyy'))/(select count(*) from personnel_hist where\r\n"
			+ "    to_char(date_hist,'yyyy')=  to_char(p.date_hist,'yyyy') and etat_act in('0','1') ),4)*100 TAUX_EMBAUCHE\r\n"
			+ "                    FROM PERSONNEL_HIST P, SERVICE S, grade c  ,categorie t\r\n"
			+ "                    WHERE P.COD_SOC = '01'\r\n"
			+ "                     AND P.ETAT_ACT IN ('0', '1') \r\n"
			+ "                     AND P.COD_SOC = S.COD_SOC\r\n"
			+ "                     AND P.COD_SERV = S.COD_SERV          \r\n"
			+ "                     and p.cod_categ = c.cod_categ\r\n"
			+ "                     and p.cod_cat = c.cod_cat\r\n"
			+ "                     and p.cod_grad = c.cod_grad\r\n"
			+ "                      and p.cod_categ = t.cod_categ\r\n"
			+ "                     and p.cod_cat = t.cod_cat  \r\n"
			+ "                     group by  to_char(date_hist,'mm/yyyy'),t.lib_cat,c.lib_grad, s.lib_serv,p.sexe,get_tranche_age(p.dat_nais,p.date_hist),to_char(p.date_hist,'yyyy')",nativeQuery = true)
	public List<Effectif> GetEffectif();
}
