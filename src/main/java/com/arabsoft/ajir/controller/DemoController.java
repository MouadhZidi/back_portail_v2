package com.arabsoft.ajir.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arabsoft.ajir.dao.DemoDAO;

import com.arabsoft.ajir.entities.Demo;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/demo")
public class DemoController {
	
	
	@Autowired
	DemoDAO demoDAO;
	
	@CrossOrigin
	@PostMapping("/demo")
	public Demo getDemo(@RequestBody Demo solde){
		String codeServ= solde.getCode_serve();
		String mat_pers= solde.getMat_pers();
		String matChef= solde.getMat_pers();
		String cod_soc= solde.getCod_soc();
		String nom = solde.getNom_prenom();

		return demoDAO.getDemo(matChef, mat_pers, cod_soc, codeServ, nom);
	}
	
}
