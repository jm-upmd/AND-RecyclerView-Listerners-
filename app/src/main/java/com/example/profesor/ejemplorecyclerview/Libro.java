package com.example.profesor.ejemplorecyclerview;

public class Libro {
    private String titulo;
    private String autor;
    private int imagen;

    public Libro(String titulo, String autor, int imagen) {
        this.titulo = titulo;
        this.autor = autor;
        this.imagen = imagen;
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

    public int getImagen() {
        return imagen;
    }
}
