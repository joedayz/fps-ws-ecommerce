package com.farmaciasperuanas.ecommerce.controller;

import javax.annotation.security.RolesAllowed;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.farmaciasperuanas.ecommerce.dto.BaseResponse;
import com.farmaciasperuanas.ecommerce.dto.LoginRequest;
import com.farmaciasperuanas.ecommerce.dto.LoginResponse;
import com.farmaciasperuanas.ecommerce.service.UsuarioService;
import com.farmaciasperuanas.ecommerce.util.RolesEnum;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@RequestScoped
@Path("/login")
@Produces("application/json")
@Consumes("application/json")
@Tag(name = "Login de Usuario", description = "Retorna al usuario registrado")
public class LoginController {

	@Inject
	UsuarioService usuarioService;
	
	@POST
	@RolesAllowed({ RolesEnum.Constants.ADMIN_VALUE,
			RolesEnum.Constants.USUARIO_VALUE})
	public BaseResponse<LoginResponse> login(LoginRequest request) {
		return usuarioService.login(request);
	}
}
