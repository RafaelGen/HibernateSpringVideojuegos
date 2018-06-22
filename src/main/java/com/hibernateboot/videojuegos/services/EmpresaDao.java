/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernateboot.videojuegos.services;

import com.hibernateboot.videojuegos.model.Empresa;
import com.hibernateboot.videojuegos.model.Videojuegos;
import com.hibernateboot.videojuegos.repository.IEmpresaRepository;
import com.hibernateboot.videojuegos.repository.IVideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author rafaelm
 */
@Service
public class EmpresaDao {
    
    @Autowired
    IEmpresaRepository iEmpresaRepository;

    public List<Empresa> findAll() {
        return iEmpresaRepository.findAll();
    }
    /*
    public Videojuegos save(Videojuegos video){
        return iVideoRepository.save(video);
    }
    
    public Videojuegos updateVideo(int id,Videojuegos video){
        return iVideoRepository.save(video);
    }


    public void deleteVideo(int id) {
        iVideoRepository.deleteById(id);
    }*/
}
