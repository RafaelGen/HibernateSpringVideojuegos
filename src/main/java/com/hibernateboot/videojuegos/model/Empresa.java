/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernateboot.videojuegos.model;

import javax.persistence.*;

/**
 *
 * @author rafaelm
 */
@Entity
@Table(name="empresa")
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEmpresa;
    private String nombre_empresa;

    public Empresa(){}

    public Empresa(Integer idEmpresa, String nombre_empresa){
        this.idEmpresa = idEmpresa;
        this.nombre_empresa = nombre_empresa;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNombre() {
        return nombre_empresa;
    }

    public void setNombre(String nombre) {
        this.nombre_empresa = nombre;
    }
}
