package com.xptotec.keyfalls.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UsuarioController {
	
	//Inicio
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String inicio() {
		
		return "Seja Bem Vindo!!";
		
	}
	
	//Status
	@RequestMapping(value="/status", method=RequestMethod.GET)
	public String status() {
		
		return "Você esta On!!";
		
	}
}
