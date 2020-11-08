package com.farmaciasperuanas.ecommerce.repository;

import java.util.Optional;

import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Query;
import org.apache.deltaspike.data.api.QueryParam;
import org.apache.deltaspike.data.api.Repository;

import com.farmaciasperuanas.ecommerce.model.Usuario;

@Repository(forEntity = Usuario.class)
public interface UsuarioRepository extends EntityRepository<Usuario, Long> {

	@Query("SELECT u FROM Usuario u WHERE u.correo =:correo and "
			+ " u.tipo =:tipo and u.plataforma =:plataforma "
			)
	Optional<Usuario> login(@QueryParam("correo") String correo,
			@QueryParam("tipo") String tipo,
			@QueryParam("plataforma") String plataforma);

	Optional <Usuario> findByCorreo(String correo);


	@Query("SELECT u FROM Usuario u WHERE u.correo =:correo and "
			+ " u.codigoActivacion =:codigoActivacion"
	)
	Optional<Usuario> validarCodigo(@QueryParam("correo") String correo,
			@QueryParam("codigoActivacion") String codigoActivacion);
}
