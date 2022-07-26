/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfolioArgProg.SpringBoot.Controller;

import com.porfolioArgProg.SpringBoot.Model.Educacion;
import com.porfolioArgProg.SpringBoot.Model.Proyectos;
import com.porfolioArgProg.SpringBoot.Service.EducacionService;
import com.porfolioArgProg.SpringBoot.Service.ProyectosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 * @author kavay
 */
@RestController
public class EducacionController {
    @Autowired
    private EducacionService educacionService;

    @GetMapping("/educacion")
    public List<Educacion> getEducacion(){
        return educacionService.getEducacion();
    }


    @PostMapping("/educacion")
    public void addEducacion(@RequestBody Educacion educacion){
        educacionService.addEducacion(educacion);
    }

    @PutMapping("/educacion")
    public void editEducacion(@RequestBody Educacion educacion){
        educacionService.editEducacion(educacion);
    }


}


