package com.farmaciasperuanas.ecommerce.dto;

import java.io.Serializable;

public class VerificacionRequest implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String codigo;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
}
