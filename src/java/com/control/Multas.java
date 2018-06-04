/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.control;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Fdieg
 */
@Entity
@Table(name = "MULTAS")
@NamedQuery(name = "Multas.findAll", query = "SELECT m FROM Multas m")
public class Multas implements Serializable {
    
    @Id
    @Column(name = "ID")
    private Integer id;
    @Size(max = 25)
    @Column(name = "NOMBRE")
    private String nombre;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALORMULTA")
    private Double valormulta;
    @Size(max = 8)
    @Column(name = "ESTADO")
    private String estado;
    @Size(max = 10)
    @Column(name = "FECHA")
    private String fecha;
    
     public Multas(Integer id, String nombre, Double valormulta, String estado, String fecha) {
        this.id = id;
        this.nombre = nombre;
        this.valormulta = valormulta;
        this.estado = estado;
        this.fecha = fecha;
    }
    

    public Multas() {
    }

    public Multas(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getValormulta() {
        return valormulta;
    }

    public void setValormulta(Double valormulta) {
        this.valormulta = valormulta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    } 
    
}
