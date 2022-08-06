package com.example.model;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Estacionamento implements Serializable{
	private static final long serialVersionUID = 1L; 
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private UUID id;
	@Column(nullable=false)
	private String modelodoVeiculo;
	@Column(nullable=false, unique=true)
	private String placadoVeiculo;
	@Column(nullable=false)
	private String cordoVeiculo;
	@Column(nullable=false)
	private String proprietario;
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getModelodoVeiculo() {
		return modelodoVeiculo;
	}
	public void setModelodoVeiculo(String modelodoVeiculo) {
		this.modelodoVeiculo = modelodoVeiculo;
	}
	public String getPlacadoVeiculo() {
		return placadoVeiculo;
	}
	public void setPlacadoVeiculo(String placadoVeiculo) {
		this.placadoVeiculo = placadoVeiculo;
	}
	public String getCordoVeiculo() {
		return cordoVeiculo;
	}
	public void setCordoVeiculo(String cordoVeiculo) {
		this.cordoVeiculo = cordoVeiculo;
	}
	public String getProprietario() {
		return proprietario;
	}
	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
