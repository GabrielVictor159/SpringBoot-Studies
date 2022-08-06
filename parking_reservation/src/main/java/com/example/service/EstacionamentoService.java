package com.example.service;

import javax.transaction.Transactional;

import com.example.model.Estacionamento;
import com.example.repositorie.EstacionamentoRepository;

import org.springframework.stereotype.Service;

@Service
public class EstacionamentoService {
	
	final EstacionamentoRepository estacionamentorepository;
	

	public EstacionamentoService(EstacionamentoRepository estacionamentorepository) {

		this.estacionamentorepository = estacionamentorepository;
	}


	@Transactional
	public Estacionamento save(Estacionamento estacionamento) {
		// TODO Auto-generated method stub
		return estacionamentorepository.save(estacionamento);
	}
}
