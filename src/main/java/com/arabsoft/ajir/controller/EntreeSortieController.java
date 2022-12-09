package com.arabsoft.ajir.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arabsoft.ajir.dao.EntreeSortieDAO;
import com.arabsoft.ajir.entities.DepartsDefinitive;
import com.arabsoft.ajir.entities.EntreeSortie;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/EntreeSortie")
public class EntreeSortieController {

	@Autowired
	EntreeSortieDAO entreeSortieDAO;
	
	@GetMapping("/EntreeSortie")
	public List<EntreeSortie> GetEntreeSortie(){
		return this.entreeSortieDAO.getEntreeSortie();
	
	}
}
