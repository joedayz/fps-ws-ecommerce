package com.farmaciasperuanas.ecommerce.controller;

import java.util.List;

import javax.annotation.security.RolesAllowed;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.farmaciasperuanas.ecommerce.dto.BaseResponse;
import com.farmaciasperuanas.ecommerce.dto.UsuarioRequest;
import com.farmaciasperuanas.ecommerce.dto.UsuarioResponse;
import com.farmaciasperuanas.ecommerce.model.Usuario;
import com.farmaciasperuanas.ecommerce.service.UsuarioService;
import com.farmaciasperuanas.ecommerce.util.RolesEnum;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@RequestScoped
@Path("/registro-usuario")
@Produces("application/json")
@Consumes("application/json")
@Tag(name = "Mantenimiento de usuarios", description = "Registro de credenciales de usuario")
public class UsuarioController {
	
	@Inject
	UsuarioService usuarioService;
	
	@POST
    @Operation(description = "Registro de Usuario")
	public BaseResponse<UsuarioResponse> save(UsuarioRequest request){
		return usuarioService.save(request);
	}
	
	@POST
	@Path("/listar")
	@RolesAllowed({ RolesEnum.Constants.ADMIN_VALUE})
    @Operation(description = "Obtiene la lista de usuarios registrados")
	public List<Usuario> finAll(){
		return usuarioService.findAll();
	}
	

}
