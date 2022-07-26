package com.porfolioArgProg.SpringBoot.Controller;

import org.springframework.web.bind.annotation.*;
import com.porfolioArgProg.SpringBoot.Model.Persona;
import com.porfolioArgProg.SpringBoot.Model.Educacion;
import com.porfolioArgProg.SpringBoot.Model.Proyectos;
import com.porfolioArgProg.SpringBoot.Model.HardySoft_skills;
import com.porfolioArgProg.SpringBoot.Model.Experiencia;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

    
    List<Persona> listaPersonas = new ArrayList();
    @GetMapping("/hola/{nombre}/{apellido}/{edad}")
    public String decirHola (@PathVariable String nombre,
                             @PathVariable String apellido,
                             @PathVariable int edad) {
        return "Hola mundo " + nombre + "apellido: " + apellido + "edad: " + edad;
    }

    @GetMapping("/chau")
    public String decirChau (@RequestParam String nombre,
                             @RequestParam String apellido,
                             @RequestParam int edad) {
        return "Hola mundo " + nombre + "apellido: " + apellido + "edad: " + edad;
    }

    @PostMapping("/new/persona")
public void agregarPersona (@RequestBody Persona pers) {
    listaPersonas.add(pers);}

    @GetMapping ("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas() {
        return listaPersonas;
    }
}


