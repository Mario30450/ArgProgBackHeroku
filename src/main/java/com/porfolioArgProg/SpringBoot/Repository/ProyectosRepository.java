
package com.porfolioArgProg.SpringBoot.Repository;

import com.porfolioArgProg.SpringBoot.Model.Persona;
import com.porfolioArgProg.SpringBoot.Model.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository.*;








public interface ProyectosRepository extends JpaRepository<Proyectos, Long> {

}
