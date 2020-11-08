package com.farmaciasperuanas.ecommerce.dto;

public class UsuarioResponse {

	private String nombre;
	private String apellido;
	private String correo;
	private String foto;
	private String celular;
	private String token;
	
	public UsuarioResponse() {}
	
	public UsuarioResponse(String nombre, String apellido, String correo, String foto, String celular, String token) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.foto = foto;
		this.celular = celular;
		this.token = token;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
}
