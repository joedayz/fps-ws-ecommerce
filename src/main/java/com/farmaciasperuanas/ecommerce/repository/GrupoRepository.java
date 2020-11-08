package com.farmaciasperuanas.ecommerce.repository;


import com.farmaciasperuanas.ecommerce.model.Grupo;
import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Repository;

@Repository(forEntity = Grupo.class)
public interface GrupoRepository extends EntityRepository<Grupo, String> {
}
