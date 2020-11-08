package com.farmaciasperuanas.ecommerce.dto;

public class BaseResponse<T> {

	private String apiEstado;
	private String apiMensaje;
	private T response;

	public BaseResponse(String apiEstado, String apiMensaje, T response) {
		super();
		this.apiEstado = apiEstado;
		this.apiMensaje = apiMensaje;
		this.response = response;
	}
	
	public BaseResponse(String apiEstado, String apiMensaje) {
		super();
		this.apiEstado = apiEstado;
		this.apiMensaje = apiMensaje;
	}

	public BaseResponse(String apiMensaje) {
		super();
		this.apiMensaje = apiMensaje;
	}

	public String getApiEstado() {
		return apiEstado;
	}

	public void setApiEstado(String apiEstado) {
		this.apiEstado = apiEstado;
	}

	public String getApiMensaje() {
		return apiMensaje;
	}

	public void setApiMensaje(String apiMensaje) {
		this.apiMensaje = apiMensaje;
	}

	public T getResponse() {
		return response;
	}

	public void setResponse(T response) {
		this.response = response;
	}

}
