package com.farmaciasperuanas.ecommerce.service;

import com.farmaciasperuanas.ecommerce.dto.BaseResponse;
import com.farmaciasperuanas.ecommerce.dto.VerificacionRequest;
import com.farmaciasperuanas.ecommerce.dto.VerificacionResponse;

public interface VerificacionService {

	BaseResponse<VerificacionResponse> validarCodigo(String correo, VerificacionRequest codigo);

	BaseResponse<VerificacionResponse> generarCodigo(String correo);
}
