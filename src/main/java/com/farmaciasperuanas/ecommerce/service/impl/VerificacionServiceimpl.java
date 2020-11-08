package com.farmaciasperuanas.ecommerce.service.impl;

import java.util.Optional;
import java.util.UUID;

import javax.inject.Inject;

import com.farmaciasperuanas.ecommerce.dto.BaseResponse;
import com.farmaciasperuanas.ecommerce.dto.VerificacionRequest;
import com.farmaciasperuanas.ecommerce.dto.VerificacionResponse;
import com.farmaciasperuanas.ecommerce.model.Usuario;
import com.farmaciasperuanas.ecommerce.repository.UsuarioRepository;
import com.farmaciasperuanas.ecommerce.util.Constantes;
import org.modelmapper.ModelMapper;

import com.farmaciasperuanas.ecommerce.service.VerificacionService;


public class VerificacionServiceimpl implements VerificacionService {

	@Inject
	UsuarioRepository usuarioRepository;

	@Inject
	ModelMapper modelMapper;


	@Override
	public BaseResponse<VerificacionResponse> validarCodigo(String correo, VerificacionRequest request) {

		Optional<Usuario> optional = usuarioRepository.validarCodigo(correo, request.getCodigo());
		if (!optional.isPresent()) {
			return new BaseResponse<>(Constantes.MENSAJE_VERIFICACION_ERROR);
		}

		optional.get().setActivado(true);
		usuarioRepository.save(optional.get());

		VerificacionResponse verificacionResponse = new VerificacionResponse();
		verificacionResponse.setCodigo(request.getCodigo());
		return new BaseResponse<>(Constantes.API_ESTADO_EXITO, Constantes.MENSAJE_VERIFICACION_EXITO,
				verificacionResponse);
	}

	@Override
	public BaseResponse<VerificacionResponse> generarCodigo(String correo) {
		String uniqueID = UUID.randomUUID().toString();

		Optional<Usuario> optional = usuarioRepository.findByCorreo(correo);
		if (optional.isPresent()) {
			optional.get().setCodigoActivacion(uniqueID);
			usuarioRepository.save(optional.get());
		}

		//TODO enviar correo

		VerificacionResponse verificacionResponse = new VerificacionResponse();
		verificacionResponse.setCodigo(uniqueID);
		return new BaseResponse<>(Constantes.API_ESTADO_EXITO, Constantes.MENSAJE_CODIGO_GENERADO,
				verificacionResponse);
	}
}
