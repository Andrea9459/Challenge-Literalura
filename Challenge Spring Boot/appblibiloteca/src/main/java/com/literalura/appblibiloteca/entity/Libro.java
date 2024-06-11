package com.literalura.appblibiloteca.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(
        name ="tbl_libros"
)

public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idLibro;
    private String titulo;
    private String autor;
    private String isbn;
    private String idioma;
    private String numDesc;


    public long getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(long idLibro) {
        this.idLibro = idLibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNumDesc() {
        return numDesc;
    }

    public void setNumDesc(String numDesc) {
        this.numDesc = numDesc;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idiomas) {
        this.idioma = idiomas;
    }



}
