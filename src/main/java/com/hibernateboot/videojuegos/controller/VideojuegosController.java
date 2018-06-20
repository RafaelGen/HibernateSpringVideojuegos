/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernateboot.videojuegos.controller;

import java.util.List;
import com.hibernateboot.videojuegos.model.Videojuegos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hibernateboot.videojuegos.services.VideojuegosDao;

/**
 *
 * @author rafaelm
 */
@RestController
//@RequestMapping("/juego")
public class VideojuegosController {
    @Autowired
    VideojuegosDao videojuegosDao;
    
    @GetMapping("/video")
    public List<Videojuegos> getAllVideo(){
        return videojuegosDao.findAll();
    }
    
    @PostMapping("/video")
    public Videojuegos saveVideo(@RequestBody Videojuegos video){
        return videojuegosDao.save(video);
    }
    
    
}
