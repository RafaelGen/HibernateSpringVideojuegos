/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernateboot.videojuegos.repository;

import com.hibernateboot.videojuegos.model.Empresa;
import com.hibernateboot.videojuegos.model.Videojuegos;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

/**
 *
 * @author rafaelm
 */
public interface IVideoRepository extends JpaRepository<Videojuegos, Integer>{

    List<Videojuegos> findByEmpresa_IdEmpresa(Integer empresaId);

}
