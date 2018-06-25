/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernateboot.videojuegos.controller;

import java.util.List;

import com.hibernateboot.videojuegos.model.Empresa;
import com.hibernateboot.videojuegos.model.Videojuegos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.hibernateboot.videojuegos.services.VideojuegosDao;
import org.springframework.http.ResponseEntity;

/**
 *
 * @author rafaelm
 */
@RestController
@RequestMapping("/video/empresa")
public class VideojuegosController {
    @Autowired
    VideojuegosDao videojuegosDao;
    
    @GetMapping("/{id_emp}/juegos")
    public List<Videojuegos> getAllVideo(@PathVariable Integer id_emp)
    {
        return videojuegosDao.findAll(id_emp);
    }

    @PostMapping("/{id_emp}/juegos")
    public void saveVideojuego(@PathVariable Integer id_emp,
                               @RequestBody Videojuegos videojuegos){
        videojuegos.setEmpresa(new Empresa(id_emp,""));
        videojuegosDao.saveVideojuego(videojuegos);
    }

}
