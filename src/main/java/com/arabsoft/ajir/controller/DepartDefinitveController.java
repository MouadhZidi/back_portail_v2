package com.arabsoft.ajir.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arabsoft.ajir.dao.DepartDefinitiveDAO;

import com.arabsoft.ajir.entities.DepartsDefinitive;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/DepartDefinitve")
public class DepartDefinitveController {
	
	@Autowired
	DepartDefinitiveDAO departDefinitiveDAO;
	
	
	@GetMapping("/DepartDefinitve/{annee}")
	public List<DepartsDefinitive> GetDepartsDefinitive(@PathVariable("annee") String annee){
		return this.departDefinitiveDAO.GetDepartsDefinitive(annee);
	
	}

}
