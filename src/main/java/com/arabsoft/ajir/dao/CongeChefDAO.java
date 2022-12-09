package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.arabsoft.ajir.entities.CongeChef;

public interface CongeChefDAO extends JpaRepository<CongeChef, Long>{
//
//	@Query(value="select d.cod_soc, d.mat_pers,(p.nom_pers||' '||p.pren_pers) nom_prenom, num_dcng, annee_cng, code_m,pk_get_lib.GET_MOTIF_J$LIB_MOT(code_m) lib_cng\r\n"
//			+ ", dat_dcng, dat_debut, dat_fin, nbr_jours ouvrable\r\n"
//			+ "  from dem_cng d,personnel p\r\n"
//			+ "  where d.cod_soc = p.cod_soc\r\n"
//			+ "  and d.mat_pers = p.mat_pers\r\n"
//			+ "  and valid='O' and (get_pere_by_pere(d.cod_soc,:x,:x)=:x or d.mat_pers=:y) and :y in(select mat_pers from service where cod_serv=:x) ",nativeQuery = true)
//	
//	public List<CongeChef> GetCongeChef(@Param("x")String codSoc,@Param("y")String mat);
	
	@Query(value="select d.cod_soc, d.mat_pers,(p.nom_pers||' '||p.pren_pers) nom_prenom, num_dcng, annee_cng, code_m,pk_get_lib.GET_MOTIF_J$LIB_MOT(code_m) lib_cng\r\n"
			+ ", dat_dcng, dat_debut, dat_fin, nbr_jours ouvrable\r\n"
			+ "  from dem_cng d,personnel p\r\n"
			+ "  where d.cod_soc = p.cod_soc\r\n"
			+ "  and d.mat_pers = p.mat_pers\r\n"
			+ "  and valid='O' ",nativeQuery=true)
	public List<CongeChef> GetCongeChef();

	
//	@Query(value=" select * from viewm_dem_cng  where (get_pere_by_pere(cod_soc,:x,:x)=:x or mat_pers=:y) and :matricule in(select mat_pers from service"
//			+ " where cod_serv=:code) and cod_soc=:x and mat_pers=:matricule) ",nativeQuery = true)
//
//			public List<CongeChef> GetCongeChef(@Param("x")String code_soc,
//					@Param("y")String mat,@Param("code")String codServ,@Param("matricule")String matricule,@Param("nom")String nom_prenom);
}