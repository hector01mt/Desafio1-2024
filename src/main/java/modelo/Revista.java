/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Hector Marquez
 */
public class Revista {
    
    String titulo;
    String editorial;
    String perioicidad;
    String fechaPublicacion;
    String unidadesDisponibles;

    public Revista() {
    }

    public Revista(String titulo, String editorial, String perioicidad, String fechaPublicacion, String unidadesDisponibles) {
        this.titulo = titulo;
        this.editorial = editorial;
        this.perioicidad = perioicidad;
        this.fechaPublicacion = fechaPublicacion;
        this.unidadesDisponibles = unidadesDisponibles;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getPerioicidad() {
        return perioicidad;
    }

    public void setPerioicidad(String perioicidad) {
        this.perioicidad = perioicidad;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getUnidadesDisponibles() {
        return unidadesDisponibles;
    }

    public void setUnidadesDisponibles(String unidadesDisponibles) {
        this.unidadesDisponibles = unidadesDisponibles;
    }
    
    
}
