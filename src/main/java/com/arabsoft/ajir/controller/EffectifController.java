package com.arabsoft.ajir.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arabsoft.ajir.dao.EffectifDAO;
import com.arabsoft.ajir.entities.Effectif;
@CrossOrigin(origins="*")
@RestController
@RequestMapping("/Effectif")
public class EffectifController {

	@Autowired
	EffectifDAO effectifDAO;
	
	@GetMapping("/Effectif")
	public List<Effectif> GetEffectif(){
		return this.effectifDAO.GetEffectif();
	
	}
	
}
