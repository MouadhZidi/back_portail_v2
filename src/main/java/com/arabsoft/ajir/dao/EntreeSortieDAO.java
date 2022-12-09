package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.arabsoft.ajir.entities.EntreeSortie;

@Repository
public interface EntreeSortieDAO extends JpaRepository<EntreeSortie, Integer>{
	
	@Query(value="select to_char(date_hist ,'yyyy') DATE_HIST\r\n"
			+ ",sum(decode(to_char(dat_emb ,'yyyy'),to_char(date_hist ,'yyyy'),1,0)  ) ENTREE,\r\n"
			+ "sum(decode(to_char(dat_depart ,'yyyy'),to_char(date_hist ,'yyyy'),1,0)  ) SORTIE\r\n"
			+ "from personnel_hist\r\n"
			+ "where to_char(date_hist,'dd/mm') = '31/12'\r\n"
			+ "and (to_char(dat_emb ,'yyyy')=to_char(date_hist ,'yyyy')\r\n"
			+ "or to_char(dat_depart ,'yyyy')=to_char(date_hist ,'yyyy'))\r\n"
			+ "group by to_char(date_hist ,'yyyy')\r\n"
			+ "order by date_hist",nativeQuery = true)
	public List<EntreeSortie> getEntreeSortie();

}
