package com.arabsoft.ajir.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.arabsoft.ajir.entities.Demo;

public interface DemoDAO extends JpaRepository<Demo, String>{

	@Query(value="select d.cod_soc, d.mat_pers,(p.nom_pers||' '||p.pren_pers) nom_prenom, num_dcng, annee_cng, code_m,pk_get_lib.GET_MOTIF_J$LIB_MOT(code_m) lib_cng\r\n"
			+ ", dat_dcng, dat_debut, dat_fin, nbr_jours ouvrable\r\n"
			+ "  from dem_cng d,personnel p\r\n"
			+ "  where d.cod_soc = p.codSoc\r\n"
			+ "  and d.mat_pers = p.matChef\r\n"
			+ "  and valid='O' and (get_pere_by_pere(d.cod_soc,p.cod_serv,'1F0')='1F0' or p.mat_pers='10326') \r\n"
			+ "    and p.cod_soc='01' and  p.mat_pers=nvl( '09650',p.mat_pers)",nativeQuery = true)
	public Demo getDemo(@Param("matChef") String matChef,@Param("cod_serv") String codServ,
			  @Param("codSoc") String codSoc,@Param("mat") String mat,@Param("nom") String nom);
}
