package com.farmaciasperuanas.ecommerce.service;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import com.farmaciasperuanas.ecommerce.dto.BaseResponse;
import com.farmaciasperuanas.ecommerce.dto.LoginRequest;
import com.farmaciasperuanas.ecommerce.dto.LoginResponse;
import com.farmaciasperuanas.ecommerce.dto.UsuarioRequest;
import com.farmaciasperuanas.ecommerce.dto.UsuarioResponse;
import com.farmaciasperuanas.ecommerce.model.Usuario;

public interface UsuarioService {

	BaseResponse<UsuarioResponse> save(UsuarioRequest request);
	BaseResponse<LoginResponse> login(LoginRequest request);
	List<Usuario> findAll();
}
