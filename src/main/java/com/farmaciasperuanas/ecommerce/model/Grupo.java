package com.farmaciasperuanas.ecommerce.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuario_role")
public class Grupo implements Serializable {

	private static final long serialVersionUID = 1528447384986169065L;

	@Id
	@Column(name="correo", nullable=false)
	private String correo;

	@Column(name="role_id", nullable=false)
	private String roleName;

	public Grupo() {}
	public Grupo(String correo, String roleName) {
		this.correo = correo;
		this.roleName = roleName;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
}
