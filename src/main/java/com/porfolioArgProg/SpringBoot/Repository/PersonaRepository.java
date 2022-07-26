/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfolioArgProg.SpringBoot.Repository;

import com.porfolioArgProg.SpringBoot.Model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository.*;

/**
 *
 * @author kavay
 */


public interface PersonaRepository extends JpaRepository <Persona, Long>{

}
