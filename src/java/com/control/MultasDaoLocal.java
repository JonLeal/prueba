/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.control;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Fdieg
 */
@Local
public interface MultasDaoLocal {

   

    void addMulta(Multas multa);

    void editMultas(Multas multa);

    void deleteMultas(int id);

    Multas getMulta(int id);

    List<Multas> getAllMultas();
    
}
