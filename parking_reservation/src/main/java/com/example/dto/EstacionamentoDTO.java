	package com.example.dto;

import javax.validation.constraints.NotBlank;

public class EstacionamentoDTO {
	@NotBlank
	private String modelodoVeiculo;
	@NotBlank
	private String placadoVeiculo;
	@NotBlank
	private String cordoVeiculo;
	@NotBlank
	private String proprietario;
	

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
	
	
}
