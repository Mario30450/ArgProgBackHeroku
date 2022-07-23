package com.porfolioArgProg.SpringBoot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.porfolioArgProg.SpringBoot.Model.Persona;
import com.porfolioArgProg.SpringBoot.Model.Educacion;
import com.porfolioArgProg.SpringBoot.Model.Proyectos;
import com.porfolioArgProg.SpringBoot.Model.HardySoft_skills;
import com.porfolioArgProg.SpringBoot.Model.Experiencia;

@RestController
public class Controller {

    @GetMapping("/hola")
    public String decirHola() {
        return "Hola mundo";
    }

}
