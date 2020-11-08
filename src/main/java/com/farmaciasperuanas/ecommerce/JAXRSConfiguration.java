package com.farmaciasperuanas.ecommerce;

import javax.annotation.security.DeclareRoles;
import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.farmaciasperuanas.ecommerce.util.RolesEnum;
import org.eclipse.microprofile.auth.LoginConfig;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.info.License;
import org.eclipse.microprofile.openapi.annotations.servers.Server;


@OpenAPIDefinition(
		info = @Info(title = "Servicios Ecommerce", version = "1.00",
		description= "Aplicacion realizada con Microprofile, Payara y Jakarta EE",
		license = @License(name = "Eclipse Public License - v 1.0")),
		servers = {
        @Server(url = "fps-ws-ecomerce",description = "Ecommerce")
    })
@ApplicationPath("/api")
@ApplicationScoped
@LoginConfig(authMethod = "MP-JWT")
@DeclareRoles({ RolesEnum.Constants.ADMIN_VALUE,
		RolesEnum.Constants.USUARIO_VALUE})
public class JAXRSConfiguration extends Application {

}
