/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.control;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Fdieg
 */
@Stateless
public class MultasDao implements MultasDaoLocal {

    @PersistenceContext(unitName = "pruebaPU")
    private EntityManager em;
    
    @Override
    public void addMulta(Multas multa) {
    }   

    @Override
    public void editMultas(Multas multa) {
    }

    @Override
    public void deleteMultas(int id) {
    }

    @Override
    public Multas getMulta(int id) {
        return em.find(Multas.class, id);
    }

    @Override
    public List<Multas> getAllMultas() {
        return em.createNamedQuery("Multas.findAll").getResultList();
    }
    
}
