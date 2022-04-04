/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

import java.util.Date;

/**
 *
 * @author SHIRLEY
 */
public class Persona {
    private String ci,nombre,apellido,telefono,genero;
         Date fechanaciemiento;

    public Persona() {
    }

    public Persona(String ci, String nombre, String apellido, String telefono, String genero, Date fechanaciemiento) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.genero = genero;
        this.fechanaciemiento = fechanaciemiento;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getFechanaciemiento() {
        return fechanaciemiento;
    }

    public void setFechanaciemiento(Date fechanaciemiento) {
        this.fechanaciemiento = fechanaciemiento;
    }

    @Override
    public String toString() {
        return getCi()+" "+getNombre()+getApellido();
        
                }
         
    
    
}
