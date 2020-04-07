package com.uca.capas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.uca.capas.domain.usuario;

@Controller
public class Maincontroller {
	@GetMapping("/login")
	public String enviarForm(usuario usuario) {
		return "login";
	}
	@PostMapping("/validacion")
	public String procesarForm(usuario usuario) {
		if(usuario.getPassword().equals("1234") && usuario.getNombre().equals("bryanceren")) {
			return "mostrarmensajev";
		}else {
			return "mostrarmensajef";
		}
		
	}
}
