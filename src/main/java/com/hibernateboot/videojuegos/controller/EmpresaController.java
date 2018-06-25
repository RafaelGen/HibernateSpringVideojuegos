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

    @PostMapping("/empresa")
    public void saveEmpresa(@RequestBody Empresa empresa){
        empresaDao.saveEmpresa(empresa);
    }

    @PutMapping("/empresa/{id_emp}")
    public void putEmpresa(@PathVariable Integer id_emp,
                           @RequestBody Empresa empresa){
        empresaDao.putEmpresa(id_emp, empresa);
        }

        @DeleteMapping("/empresa/{id_emp}")
    public void deleteEmpresa(@PathVariable Integer id_emp){
        empresaDao.deleteEmpresa(id_emp);
        }
}
