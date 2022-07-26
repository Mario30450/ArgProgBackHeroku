/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package com.porfolioArgProg.SpringBoot.Controller;

        import com.porfolioArgProg.SpringBoot.Model.Experiencia;

        import com.porfolioArgProg.SpringBoot.Service.ExperienciaService;

        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.*;

        import java.util.List;





/**
 *
 * @author kavay
 */

@RestController
public class ExperienciaController {
    @Autowired
    private ExperienciaService experienciaService;

    @GetMapping("/experiencia")
    public List<Experiencia> getExperiencia(){
        return experienciaService.getExperiencia();
    }


    @PostMapping("/experiencia")
    public void addExperiencia(@RequestBody Experiencia experiencia){
        experienciaService.addExperiencia(experiencia);
    }

    @PutMapping("/experiencia")
    public void editExperiencia(@RequestBody Experiencia experiencia){
        experienciaService.editExperiencia(experiencia);
    }


}




