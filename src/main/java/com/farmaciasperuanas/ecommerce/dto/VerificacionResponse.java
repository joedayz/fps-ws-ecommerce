package com.farmaciasperuanas.ecommerce.dto;

public class VerificacionResponse {

	private String codigo;
	
	public  VerificacionResponse() {}

	public VerificacionResponse(String codigo) {
		super();
		this.codigo = codigo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
}
