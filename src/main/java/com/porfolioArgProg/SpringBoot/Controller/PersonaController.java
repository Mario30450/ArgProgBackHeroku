/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfolioArgProg.SpringBoot.Controller;

import com.porfolioArgProg.SpringBoot.Model.Persona;
import com.porfolioArgProg.SpringBoot.Service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
/**
 *
 * @author kavay
 */

@RestController
public class PersonaController {
    @Autowired
    private PersonaService personaService;

    @GetMapping("/persona")
    public List<Persona> getPersona(){
        return personaService.getPersona();
    }
    @PostMapping("/persona")
    public String addPersona(@RequestBody Persona persona){
        personaService.addPersona(persona);
        return "";
    }

    @PutMapping("/persona")
    public String editPersona(@RequestBody Persona persona){
        personaService.editPersona(persona);
        return "";
    }


}