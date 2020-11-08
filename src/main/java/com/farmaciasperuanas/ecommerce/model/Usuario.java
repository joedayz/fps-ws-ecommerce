package com.farmaciasperuanas.ecommerce.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario")
	private Long idEcomerceUsuario;
	
	@Column(name="nombre")
	private String nombre;
	 
	@Column(name="apellido")
	private String apellido;
	
	@Column(name="genero")
	private String genero;
	 
	@Column(name="tipo_documento")
	private String tipoDocumento;
	
	@Column(name="numero_documento")
	private String numeroDocumento;
	 
	@Column(name="correo")
	private String correo;
	
	@Column(name="contrasenia")
	private String contrasenia;
	 
	@Column(name="tipo")
	private String tipo;
	
	@Column(name="plataforma")
	private String plataforma;
	
	@Column(name="fecha_nacimiento")
	private String fechaNacimiento;
	
	@Column(name="celular")
	private String celular;


	@Column(name="foto")
	private String foto;


	@Column(name = "activado")
	private boolean activado ;

	@Column(name="codigo_activacion")
	private String codigoActivacion;

	public Long getIdEcomerceUsuario() {
		return idEcomerceUsuario;
	}

	public void setIdEcomerceUsuario(Long idEcomerceUsuario) {
		this.idEcomerceUsuario = idEcomerceUsuario;
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

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
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

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}


	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public boolean isActivado() {
		return activado;
	}

	public void setActivado(boolean activado) {
		this.activado = activado;
	}

	public String getCodigoActivacion() {
		return codigoActivacion;
	}

	public void setCodigoActivacion(String codigoActivacion) {
		this.codigoActivacion = codigoActivacion;
	}
}
