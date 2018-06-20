/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernateboot.videojuegos.services;

import java.util.List;
import com.hibernateboot.videojuegos.model.Videojuegos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hibernateboot.videojuegos.repository.IVideoRepository;

/**
 *
 * @author rafaelm
 */
@Service
public class VideojuegosDao {
    
    @Autowired
    IVideoRepository iVideoRepository;

    public List<Videojuegos> findAll() {
        return iVideoRepository.findAll();
    }
    
    public Videojuegos save(Videojuegos video){
        return iVideoRepository.save(video);
    }
    
}
