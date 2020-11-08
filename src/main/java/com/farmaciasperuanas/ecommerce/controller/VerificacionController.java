package com.farmaciasperuanas.ecommerce.controller;

import javax.annotation.security.RolesAllowed;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.farmaciasperuanas.ecommerce.dto.BaseResponse;
import com.farmaciasperuanas.ecommerce.dto.VerificacionRequest;
import com.farmaciasperuanas.ecommerce.dto.VerificacionResponse;
import com.farmaciasperuanas.ecommerce.service.VerificacionService;
import com.farmaciasperuanas.ecommerce.util.RolesEnum;
import org.eclipse.microprofile.jwt.JsonWebToken;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;


@RequestScoped
@Path("/verificacion")
@Produces("application/json")
@Consumes("application/json")
@Tag(name = "Verificacion de Codigo")
public class VerificacionController {


	@Inject
	private JsonWebToken jwtPrincipal;
	
	@Inject
	VerificacionService verificacionService;
	
	@POST
	@Path("/validarCodigo")
	@RolesAllowed({ RolesEnum.Constants.ADMIN_VALUE,
			RolesEnum.Constants.USUARIO_VALUE})
	public BaseResponse<VerificacionResponse> validarCodigo(VerificacionRequest codigo){
		return verificacionService.validarCodigo(jwtPrincipal.getName(), codigo);
	}

	@POST
	@Path("/generarCodigo")
	@RolesAllowed({ RolesEnum.Constants.ADMIN_VALUE,
			RolesEnum.Constants.USUARIO_VALUE})
	public BaseResponse<VerificacionResponse> generarCodigo(){

		return verificacionService.generarCodigo(jwtPrincipal.getName());
	}

}
