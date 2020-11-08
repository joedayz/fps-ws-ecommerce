package com.farmaciasperuanas.ecommerce.util;

public enum RolesEnum {

	ADMIN(Constants.ADMIN_VALUE),
	USUARIO(Constants.USUARIO_VALUE);

	private String rol;

	public String getRol() {
		return this.rol;
	}

	RolesEnum(String rol) {
		this.rol = rol;
	}

	public static class Constants {
		public static final String ADMIN_VALUE = "admin";
		public static final String USUARIO_VALUE = "usuario";

	}
}
