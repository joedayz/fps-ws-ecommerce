package com.farmaciasperuanas.ecommerce.service.impl;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Optional;

import javax.inject.Inject;

import com.farmaciasperuanas.ecommerce.model.Grupo;
import com.farmaciasperuanas.ecommerce.repository.GrupoRepository;
import com.farmaciasperuanas.ecommerce.util.RolesEnum.Constants;
import com.farmaciasperuanas.ecommerce.util.Util;
import org.modelmapper.ModelMapper;

import com.farmaciasperuanas.ecommerce.dto.BaseResponse;
import com.farmaciasperuanas.ecommerce.dto.LoginRequest;
import com.farmaciasperuanas.ecommerce.dto.LoginResponse;
import com.farmaciasperuanas.ecommerce.dto.UsuarioRequest;
import com.farmaciasperuanas.ecommerce.dto.UsuarioResponse;
import com.farmaciasperuanas.ecommerce.model.Usuario;
import com.farmaciasperuanas.ecommerce.repository.UsuarioRepository;
import com.farmaciasperuanas.ecommerce.service.UsuarioService;
import com.farmaciasperuanas.ecommerce.util.Constantes;


public class UsuarioServiceImpl implements UsuarioService {

	@Inject
	UsuarioRepository usuarioRepository;

	@Inject
	GrupoRepository grupoRepository;

	@Inject
	ModelMapper modelMapper;

	@Override
	public BaseResponse<UsuarioResponse> save(UsuarioRequest request) {
		Usuario usuario = modelMapper.map(request, Usuario.class);
		Optional<Usuario> opt = usuarioRepository.findByCorreo(usuario.getCorreo());
		if (!opt.isPresent()) {
			try {
				usuario.setContrasenia(Util.encodeSHA256(usuario.getContrasenia()));
			}
			catch (Exception e) {
				return new BaseResponse<>(Constantes.API_ESTADO_ERROR, Constantes.API_MENSAJE_SAVE_ERROR);
			}
			usuarioRepository.save(usuario);

			Grupo grupo = new Grupo(usuario.getCorreo(), Constants.USUARIO_VALUE);
			grupoRepository.save(grupo);

			return new BaseResponse<>(Constantes.API_ESTADO_EXITO, Constantes.MENSAJE_ACCESO_EXITO,
					modelMapper.map(usuario, UsuarioResponse.class));
		}
		return new BaseResponse<>("El Correo ya se encuentra registrado.");
	}

	@Override
	public List<Usuario> findAll() {
		return usuarioRepository.findAll();
	}

	@Override
	public BaseResponse<LoginResponse> login(LoginRequest request) {
		Optional<Usuario> usu = usuarioRepository.login(request.getUsuario(),
				request.getTipo(), request.getPlataforma());
		if (!usu.isPresent()) {
			return new BaseResponse<>(Constantes.API_MENSAJE_LOGIN_ERROR);
		}
		return new BaseResponse<>(Constantes.API_ESTADO_EXITO, Constantes.MENSAJE_ACCESO_EXITO,
				modelMapper.map(usu.get(), LoginResponse.class));
	}

}
