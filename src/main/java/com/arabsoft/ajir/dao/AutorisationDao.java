package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.arabsoft.ajir.entities.Autorisation;
import com.arabsoft.ajir.entities.AutorisationPK;


public interface AutorisationDao extends JpaRepository<Autorisation, AutorisationPK>{
	
	@Query(value="select cod_soc,mat_pers, num_aut, dat_debut_aut, dat_fin_aut, cod_aut,pk_get_lib.GET_TYP_AUTORI$LIB_TYP_AUT(cod_aut) lib_aut, \r\n"
			+ "etat_aut, heur_s, min_s, \r\n"
			+ "heur_r, min_r, duree, dat_decision, num_decision, obs_aut, cod_ur, cod_serv, cod_class, cod_metier, poste_trav, org_serv, \r\n"
			+ "dat_saisie, dat_maj, cod_user, duree_m, typ_aut, duree_j, lun, mar, mer, jeu, ven, sam, etat_auto\r\n"
			+ "from autorisation_sort where (get_pere_by_pere(cod_soc,:x,:x)=:x or mat_pers=:y)\r\n"
			+ "and :y in(select mat_pers from service where cod_serv=:x)", nativeQuery=true)
	public List<Autorisation> getAutorisstion(@Param("x")String codSoc,@Param("y")String mat);

}
