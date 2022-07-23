
package com.porfolioArgProg.SpringBoot.Model;


import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@Entity

public class Proyectos implements Serializable {
    
 @Id
 @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id_Proyectos;
    private String nombre; 
     private String Fechas; 
    private String url_foto; 
     
    private String descripcion;
  
    
    
    public Proyectos () {
    }
    
    public Proyectos (long Id_Proyectos, String nombre, String Fechas, String url_foto, String descripcion){
    this.Id_Proyectos = Id_Proyectos;
    this.nombre = nombre;
    this.Fechas = Fechas;
    this.url_foto = url_foto;
    this.descripcion = descripcion;
    }
    
}
