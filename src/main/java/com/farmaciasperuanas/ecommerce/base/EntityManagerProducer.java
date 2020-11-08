package com.farmaciasperuanas.ecommerce.base;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.modelmapper.ModelMapper;

@ApplicationScoped
public class EntityManagerProducer {

    @PersistenceContext(unitName = "concentrador_pu")
    private EntityManager em;
    
    @ApplicationScoped
    @Produces
    public EntityManager getEntityManager() {
        return em;
    }

    @ApplicationScoped
    @Produces
    public ModelMapper modelMapper() {
    	return new ModelMapper();
    }
}
