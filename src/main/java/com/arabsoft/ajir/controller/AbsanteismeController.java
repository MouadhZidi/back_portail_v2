package com.arabsoft.ajir.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arabsoft.ajir.dao.AbsanteismeByLibelleDAO;
import com.arabsoft.ajir.dao.AbsanteismeBySexeDAO;
import com.arabsoft.ajir.dao.AbsanteismeDAO;
import com.arabsoft.ajir.entities.Absanteisme;
import com.arabsoft.ajir.entities.AbsanteismeByLibelle;
import com.arabsoft.ajir.entities.AbsanteismeBySexe;


@CrossOrigin(origins="*")
@RestController
@RequestMapping("/Absanteisme")
public class AbsanteismeController {

	@Autowired
	AbsanteismeDAO absanteismeDAO;
	@Autowired
	AbsanteismeBySexeDAO absanteismeBySexeDAO;
	@Autowired
	AbsanteismeByLibelleDAO absanteismeByLibelleDAO;
	
	@GetMapping("/Absanteisme")
	public List<Absanteisme> GetAbsanteisme(){
		return this.absanteismeDAO.getAbsanteisme();
	
	}
	@CrossOrigin
	@GetMapping("/AbsanteismeBySexe/{annee}")
	public List<AbsanteismeBySexe> GetAbsanteismeBySexe(@PathVariable("annee") String annee){
		return this.absanteismeBySexeDAO.getAbsanteismeBySexe(annee);
	
	}
	
	@CrossOrigin
	@GetMapping("/AbsanteismeByLibelle/{annee}")
	public List<AbsanteismeByLibelle> GetAbsanteismeByLibelle(@PathVariable("annee") String annee){
		return this.absanteismeByLibelleDAO.GetAbsanteismeByLibelle(annee);
	
	}
}
