package com.example.controller;

import javax.validation.Valid;

import com.example.dto.EstacionamentoDTO;
import com.example.model.Estacionamento;
import com.example.service.EstacionamentoService;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/Estacionamento")
public class EstacionamentoController {

	final EstacionamentoService estacionamentoservice;

	public EstacionamentoController(EstacionamentoService estacionamentoservice) {
		
		this.estacionamentoservice = estacionamentoservice;
	}
	@GetMapping()
	public String home() {
		System.out.println("Acessando home");
		return "hello";
	}
	@PostMapping("/Save") 
	@ResponseBody
	public ResponseEntity<Object> saveEstacionamento(@RequestBody @Valid EstacionamentoDTO estacionamentoDTO){
		System.out.println("acessou save");
		var estacionamento = new Estacionamento();
		BeanUtils.copyProperties(estacionamentoDTO, estacionamento);
		return ResponseEntity.status(HttpStatus.CREATED).body(estacionamentoservice.save(estacionamento));
	}
}
