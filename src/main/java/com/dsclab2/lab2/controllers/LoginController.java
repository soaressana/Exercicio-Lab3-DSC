package com.dsclab2.lab2.controllers;

import javax.servlet.ServletException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dsclab2.lab2.dtos.RespostaLoginDTO;
import com.dsclab2.lab2.entities.Usuario;
import com.dsclab2.lab2.services.JWTService;

@RestController
@RequestMapping("/auth")
public class LoginController {
	
	@Autowired
	private JWTService jwtService;
	
	@PostMapping("/login")
	public ResponseEntity<RespostaLoginDTO> autentica(@RequestBody Usuario usuario) throws ServletException{
		return new ResponseEntity<RespostaLoginDTO>(jwtService.autheticate(usuario), HttpStatus.OK);
		
	}
	
}
