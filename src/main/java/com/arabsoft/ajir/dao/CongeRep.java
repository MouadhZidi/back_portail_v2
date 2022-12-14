package com.arabsoft.ajir.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.arabsoft.ajir.entities.CleDemCng;
import com.arabsoft.ajir.entities.DemCng;


@Repository
public interface CongeRep extends JpaRepository<DemCng,CleDemCng> {

	@Query("select c from DemCng c where c.id.cod_soc=:x and c.id.mat_pers=:y ")
	public List<DemCng> getbycodesocandmatpers(@Param("x")String codSoc,@Param("y")String mat);
	
	
	
	 @Query(value = "select pk_get_lib.GET_MOTIF_J$LIB_MOT(code_m) lib_cng\r\n"
	 		+ ", dat_debut, dat_fin, nbr_jours ouvrable,d.cod_soc,\r\n"
	 		+ "d.mat_pers,\r\n"
	 		+ "d.num_dcng,\r\n"
	 		+ "d.annee_cng,\r\n"
	 		+ "d.code_m,\r\n"
	 		+ "d.dat_dcng,\r\n"
	 		+ "d.dat_debut,\r\n"
	 		+ "d.dat_fin,\r\n"
	 		+ "d.nbr_jours,\r\n"
	 		+ "d.nbr_jours_cal,\r\n"
	 		+ "d.bonus_cng,\r\n"
	 		+ "d.motif_cng,\r\n"
	 		+ "d.residence,\r\n"
	 		+ "d.tel,\r\n"
	 		+ "d.valid,\r\n"
	 		+ "d.etat_cng,\r\n"
	 		+ "d.edit_titre,\r\n"
	 		+ "d.nbo,\r\n"
	 		+ "d.dat_nbo,\r\n"
	 		+ "d.dat_prev_ret,\r\n"
	 		+ "d.dat_retour,\r\n"
	 		+ "d.nbo_ret,\r\n"
	 		+ "d.dat_nbo_ret,\r\n"
	 		+ "d.cng_prol,\r\n"
	 		+ "d.num_dcng_prol,\r\n"
	 		+ "d.nbr_jour_prol,\r\n"
	 		+ "d.planifier,\r\n"
	 		+ "d.nat_cng,\r\n"
	 		+ "d.cng_temps,\r\n"
	 		+ "d.cng_temps_debut,\r\n"
	 		+ "d.cng_temps_fin,\r\n"
	 		+ "d.nbr_jours_demi,\r\n"
	 		+ "d.nbr_jours_sold,\r\n"
	 		+ "d.dat_jours_demi,\r\n"
	 		+ "d.dat_jours_sold,\r\n"
	 		+ "d.cod_ur,\r\n"
	 		+ "d.cod_serv,\r\n"
	 		+ "d.cod_motif,\r\n"
	 		+ "d.cod_affect,\r\n"
	 		+ "d.cod_class,\r\n"
	 		+ "d.regime_trav,\r\n"
	 		+ "d.reg_cng,\r\n"
	 		+ "d.cod_cycl,\r\n"
	 		+ "d.residence_a,\r\n"
	 		+ "d.motif_a,\r\n"
	 		+ "d.num_sanc,\r\n"
	 		+ "d.num_acc,\r\n"
	 		+ "d.num_mal,\r\n"
	 		+ "d.num_sais,\r\n"
	 		+ "d.dat_sais_sys,\r\n"
	 		+ "d.cod_user,\r\n"
	 		+ "d.cod_alert,\r\n"
	 		+ "d.seq_alert,\r\n"
	 		+ "d.sold_cng,\r\n"
	 		+ "d.cng_visit,\r\n"
	 		+ "d.dat_contre_visit,\r\n"
	 		+ "d.cng_init,\r\n"
	 		+ "d.avance_cng,\r\n"
	 		+ "d.nbr_heure,\r\n"
	 		+ "d.nom_medcin,\r\n"
	 		+ "d.cum_retenue,\r\n"
	 		+ "d.retenue_mois,\r\n"
	 		+ "d.cum_rappel,\r\n"
	 		+ "d.cod_categ,\r\n"
	 		+ "d.cod_cat,\r\n"
	 		+ "d.cod_grad,\r\n"
	 		+ "d.sign_cng,\r\n"
	 		+ "d.specialite,\r\n"
	 		+ "d.cng_sal,\r\n"
	 		+ "d.cng_doc,\r\n"
	 		+ "d.ord_cand,\r\n"
	 		+ "d.cloture,\r\n"
	 		+ "d.inject,\r\n"
	 		+ "d.cod_user_conf,\r\n"
	 		+ "d.dat_user_conf,\r\n"
	 		+ "d.id_dem_cng"
	 		+ "  from dem_cng d,personnel p\r\n"
	 		+ "  where d.cod_soc = p.cod_soc\r\n"
	 		+ "  and d.mat_pers = p.mat_pers\r\n"
	 		+ "  and valid='O' and (get_pere_by_pere(d.cod_soc,p.cod_serv,:codServ)=:codServ or p.mat_pers=:matChef) \r\n"
	 		+ "  and p.cod_soc=:codSoc and  p.mat_pers=nvl(:mat,p.mat_pers) and (p.nom_pers||' '||p.pren_pers)= nvl(:nom,(p.nom_pers||' '||p.pren_pers))", nativeQuery = true)
	  public List<DemCng>   getCng(@Param("matChef") String matChef,@Param("codServ") String codServ,
			  @Param("codSoc") String codSoc,@Param("mat") String mat,@Param("nom") String nom);
	
	 @Query(value = "select pk_get_lib.GET_MOTIF_J$LIB_MOT(code_m) lib_cng\r\n"
		 		+ ", dat_debut, dat_fin, nbr_jours ouvrable,d.cod_soc,\r\n"
		 		+ "d.mat_pers,\r\n"
		 		+ "d.num_dcng,\r\n"
		 		+ "d.annee_cng,\r\n"
		 		+ "d.code_m,\r\n"
		 		+ "d.dat_dcng,\r\n"
		 		+ "d.dat_debut,\r\n"
		 		+ "d.dat_fin,\r\n"
		 		+ "d.nbr_jours,\r\n"
		 		+ "d.nbr_jours_cal,\r\n"
		 		+ "d.bonus_cng,\r\n"
		 		+ "d.motif_cng,\r\n"
		 		+ "d.residence,\r\n"
		 		+ "d.tel,\r\n"
		 		+ "d.valid,\r\n"
		 		+ "d.etat_cng,\r\n"
		 		+ "d.edit_titre,\r\n"
		 		+ "d.nbo,\r\n"
		 		+ "d.dat_nbo,\r\n"
		 		+ "d.dat_prev_ret,\r\n"
		 		+ "d.dat_retour,\r\n"
		 		+ "d.nbo_ret,\r\n"
		 		+ "d.dat_nbo_ret,\r\n"
		 		+ "d.cng_prol,\r\n"
		 		+ "d.num_dcng_prol,\r\n"
		 		+ "d.nbr_jour_prol,\r\n"
		 		+ "d.planifier,\r\n"
		 		+ "d.nat_cng,\r\n"
		 		+ "d.cng_temps,\r\n"
		 		+ "d.cng_temps_debut,\r\n"
		 		+ "d.cng_temps_fin,\r\n"
		 		+ "d.nbr_jours_demi,\r\n"
		 		+ "d.nbr_jours_sold,\r\n"
		 		+ "d.dat_jours_demi,\r\n"
		 		+ "d.dat_jours_sold,\r\n"
		 		+ "d.cod_ur,\r\n"
		 		+ "d.cod_serv,\r\n"
		 		+ "d.cod_motif,\r\n"
		 		+ "d.cod_affect,\r\n"
		 		+ "d.cod_class,\r\n"
		 		+ "d.regime_trav,\r\n"
		 		+ "d.reg_cng,\r\n"
		 		+ "d.cod_cycl,\r\n"
		 		+ "d.residence_a,\r\n"
		 		+ "d.motif_a,\r\n"
		 		+ "d.num_sanc,\r\n"
		 		+ "d.num_acc,\r\n"
		 		+ "d.num_mal,\r\n"
		 		+ "d.num_sais,\r\n"
		 		+ "d.dat_sais_sys,\r\n"
		 		+ "d.cod_user,\r\n"
		 		+ "d.cod_alert,\r\n"
		 		+ "d.seq_alert,\r\n"
		 		+ "d.sold_cng,\r\n"
		 		+ "d.cng_visit,\r\n"
		 		+ "d.dat_contre_visit,\r\n"
		 		+ "d.cng_init,\r\n"
		 		+ "d.avance_cng,\r\n"
		 		+ "d.nbr_heure,\r\n"
		 		+ "d.nom_medcin,\r\n"
		 		+ "d.cum_retenue,\r\n"
		 		+ "d.retenue_mois,\r\n"
		 		+ "d.cum_rappel,\r\n"
		 		+ "d.cod_categ,\r\n"
		 		+ "d.cod_cat,\r\n"
		 		+ "d.cod_grad,\r\n"
		 		+ "d.sign_cng,\r\n"
		 		+ "d.specialite,\r\n"
		 		+ "d.cng_sal,\r\n"
		 		+ "d.cng_doc,\r\n"
		 		+ "d.ord_cand,\r\n"
		 		+ "d.cloture,\r\n"
		 		+ "d.inject,\r\n"
		 		+ "d.cod_user_conf,\r\n"
		 		+ "d.dat_user_conf,\r\n"
		 		+ "d.id_dem_cng"
		 		+ "  from dem_cng d,personnel p\r\n"
		 		+ "  where d.cod_soc = p.cod_soc\r\n"
		 		+ "  and d.mat_pers = p.mat_pers\r\n"
		 		+ "  and valid='O'  \r\n"
		 		+ "  and p.cod_soc=:codSoc and  p.mat_pers=:mat", nativeQuery = true)
		  public List<DemCng>   getCngPers(@Param("codSoc") String codSoc,@Param("mat") String mat);
	 @Query(value = "select \r\n"
				
				+" p.nom_pers        \r\n"
				+ "from PERSONNEL p\r\n"
				+"where p.cod_soc=:x \r\n"
				+"and p.mat_pers=:y \r\n", nativeQuery = true)
	  public Optional<String>   getnom(@Param("x") String x,@Param("y")String y);

@Query(value = "select \r\n"

				+" p.pren_pers        \r\n"
				+ "from PERSONNEL p\r\n"
				+"where p.cod_soc=:x \r\n"
				+"and p.mat_pers=:y \r\n", nativeQuery = true)
	  public Optional<String>   getprenom(@Param("x") String x,@Param("y")String y);}







