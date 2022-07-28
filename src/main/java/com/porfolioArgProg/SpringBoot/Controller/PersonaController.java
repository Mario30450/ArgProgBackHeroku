package com.porfolioArgProg.SpringBoot.Controller;

import com.porfolioArgProg.SpringBoot.Model.Persona;
import com.porfolioArgProg.SpringBoot.Service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonaController {
    @Autowired
    private PersonaService personaService;

    @GetMapping("/get/persona")
    public List<Persona> getPersona(){
        return personaService.getPersona();
    }
    @PostMapping("/post/persona")
    public String addPersona(@RequestBody Persona persona){
        personaService.addPersona(persona);
        return "post";
    }

    @PutMapping("/put/persona")
        public String editPersona(@RequestBody Persona persona){
            personaService.editPersona(persona);
            return "put";
        }


}
