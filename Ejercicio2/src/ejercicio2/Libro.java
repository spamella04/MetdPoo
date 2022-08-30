/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author Synthia Pamella
 */
public class Libro {
    
    private int codigo;
    private String titulo;
    private String autor;
    private String descripcion;
    private double precio;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Libro() {
    }

    public Libro(int codigo, String titulo, String autor, String descripcion, double precio) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    
    

    @Override
    public String toString() {
        return "| " + "Codigo:" + codigo + "| | titulo:" + titulo + "| |autor: " + autor + "| |descripcion: " + descripcion + "| |precio: " + precio + "| \n";
    }
    
    
}
