package com.farmaciasperuanas.ecommerce.dto;

import java.io.Serializable;

public class LoginRequest implements Serializable{

	private static final long serialVersionUID = 1L;
	private String usuario;
	private String tipo;
	private String plataforma;


	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getPlataforma() {
		return plataforma;
	}
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
}
