package com.literalura.model;

import jakarta.persistence.*;

@Entity
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String idioma;
    private Double descargas;

    @ManyToOne
    private Autor autor;

    public Libro(){}

    public Libro(DatosLibro datos, Autor autor){
        this.titulo = datos.titulo();
        this.idioma = datos.idiomas().get(0);
        this.descargas = datos.descargas();
        this.autor = autor;
    }

    // getters y setters
}