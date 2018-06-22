/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernateboot.videojuegos.controller;

import com.hibernateboot.videojuegos.model.Empresa;
import com.hibernateboot.videojuegos.model.Videojuegos;
import com.hibernateboot.videojuegos.services.EmpresaDao;
import com.hibernateboot.videojuegos.services.VideojuegosDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 * @author rafaelm
 */
@RestController
@RequestMapping("/video")
public class EmpresaController {
    @Autowired
    EmpresaDao empresaDao;
    
    @GetMapping("/empresa")
    public List<Empresa> getAllEmpresas(){
        return empresaDao.findAll();
    }
    
    /*@PostMapping("/video")
    public Videojuegos saveVideo(@RequestBody Videojuegos video){
        return videojuegosDao.save(video);
    }

    @PutMapping("/video/{id}")
    public Videojuegos updateVideo(@RequestBody Videojuegos videojuego,
                                   @PathVariable int id){
        return videojuegosDao.updateVideo(id,videojuego);
    }

    @RequestMapping(value = "/video/{id}",method = RequestMethod.DELETE)
    public void deleteVideo(@PathVariable int id){
        videojuegosDao.deleteVideo(id);
    }
*/


}
