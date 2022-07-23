
package com.porfolioArgProg.SpringBoot.Model;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;


@Getter @Setter
@Entity
public class Persona implements Serializable {
    
     @Id
     @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_Perfil;
    private String nombre; 
    private String apellido; 
    private String username;
    private String password;
    private String puesto;
    private String url_foto_perfil; 
    private String url_banner; 
    private String descripcion;
    private String cita; 
    
    
    public Persona() {
    }
    
    public Persona (long id_Perfil, String nombre, String apellido, String username, String password,
    String puesto, String url_foto_perfil, String url_banner, String descripcion, String cita){
    this.id_Perfil = id_Perfil;
    this.nombre = nombre;
    this.apellido = apellido;
    this.password = password;
    this.username = username;
    this.descripcion = descripcion;
    this.cita = cita;
    this.url_banner = url_banner;
    this.url_foto_perfil = url_foto_perfil;
    }
    }
        
    

