package com.literalura.model;

import jakarta.persistence.*;

@Entity
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private Integer nacimiento;
    private Integer fallecimiento;

    public Autor(){}

    public Autor(DatosAutor datos){
        this.nombre = datos.nombre();
        this.nacimiento = datos.nacimiento();
        this.fallecimiento = datos.fallecimiento();
    }

    // getters y setters
}