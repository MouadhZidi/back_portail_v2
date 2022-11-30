package com.arabsoft.ajir.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arabsoft.ajir.dao.AbsanteismeDAO;
import com.arabsoft.ajir.entities.Absanteisme;
import com.arabsoft.ajir.entities.BulletinH;
import com.arabsoft.ajir.entities.DemCng;
import com.arabsoft.ajir.entities.PossedeVh;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/Absanteisme")
public class AbsanteismeController {

	@Autowired
	AbsanteismeDAO absanteismeDAO;
	
	@GetMapping("/Absanteisme")
	public List<Absanteisme> GetAbsanteisme(){
		return this.absanteismeDAO.getAbsanteisme();
	
	}
}
