package com.practica.Practica01.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name="estado")
public class Estado implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEstado;
    private String idpais;
    private String nombreEstado;
    private String capital;
    private String poblacion;
    private String costas;

    public Estado() {
    }

    public Estado(String idpais, String nombreEstado, String capital, String poblacion, String costas) {
        this.idpais = idpais;
        this.nombreEstado = nombreEstado;
        this.capital = capital;
        this.poblacion = poblacion;
        this.costas = costas;
    }   
}