/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfolioArgProg.SpringBoot.Controller;

import com.porfolioArgProg.SpringBoot.Model.Proyectos;
import com.porfolioArgProg.SpringBoot.Service.ProyectosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;





/**
 *
 * @author kavay
 */

@RestController
public class ProyectosController {
    @Autowired
    private ProyectosService proyectosService;

    @GetMapping("/proyectos")
    public List<Proyectos> getProyectos(){
        return proyectosService.getProyectos();
    }


    @PostMapping("/proyectos")
    public void addProyectos(@RequestBody Proyectos proyectos){
        proyectosService.addProyectos(proyectos);
    }

    @PutMapping("/proyectos")
    public void editProyectos(@RequestBody Proyectos proyectos){
        proyectosService.editProyectos(proyectos);
    }


}


