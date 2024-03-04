package com.example.examendi_2ev;


public class Book {

    private final int id;
    private final int imagen;
    private final String titulo;

    private final String autor;
    private final float precio;


    public Book(int id, int imagen, String titulo, String autor, float precio) {
        this.id = id;
        this.imagen = imagen;
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    public int getImagen() {
        return imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public float getPrecio() {
        return precio;
    }
}
