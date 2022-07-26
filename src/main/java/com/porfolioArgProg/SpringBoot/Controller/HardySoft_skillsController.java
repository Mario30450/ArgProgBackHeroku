/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfolioArgProg.SpringBoot.Controller;

import com.porfolioArgProg.SpringBoot.Model.HardySoft_skills;
import com.porfolioArgProg.SpringBoot.Model.Proyectos;
import com.porfolioArgProg.SpringBoot.Service.HardySoft_skillsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 *
 * @author kavay
 */

@RestController
public class HardySoft_skillsController {
    @Autowired
    private HardySoft_skillsService hardySoft_skillsService;

    @GetMapping("/hardySoft_skills")
    public List<HardySoft_skills> getHardySoft_skills(){
        return  hardySoft_skillsService.getHardySoft_skills();
    }


    @PostMapping("/hardySoft_skills")
    public void addHardySoft_skills(@RequestBody  HardySoft_skills  hardySoft_skills){
        hardySoft_skillsService.addHardySoft_skills(hardySoft_skills);
    }

    @PutMapping("/hardySoft_skills")
    public void editHardySoft_skills(@RequestBody  HardySoft_skills  hardySoft_skills){
        hardySoft_skillsService.editHardySoft_skills(hardySoft_skills);
    }


}


