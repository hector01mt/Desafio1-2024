/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Hector Marquez
 */
public class Cd {
    
    String titulo;
    String artista;
    String genero;
    String duracion;
    String numeroCanciones;
    String unidadesDisponibles;

    public Cd() {
    }

    public Cd(String titulo, String artista, String genero, String duracion, String numeroCanciones, String unidadesDisponibles) {
        this.titulo = titulo;
        this.artista = artista;
        this.genero = genero;
        this.duracion = duracion;
        this.numeroCanciones = numeroCanciones;
        this.unidadesDisponibles = unidadesDisponibles;
    }
    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getNumeroCanciones() {
        return numeroCanciones;
    }

    public void setNumeroCanciones(String numeroCanciones) {
        this.numeroCanciones = numeroCanciones;
    }

    public String getUnidadesDisponibles() {
        return unidadesDisponibles;
    }

    public void setUnidadesDisponibles(String unidadesDisponibles) {
        this.unidadesDisponibles = unidadesDisponibles;
    }
    
    
    
}
