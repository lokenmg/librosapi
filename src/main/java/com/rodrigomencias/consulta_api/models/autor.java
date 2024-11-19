package com.rodrigomencias.consulta_api.models;

import com.fasterxml.jackson.annotation.JsonAlias;

public class autor {
    @JsonAlias("name")
    private String nombre;
    @JsonAlias("birth_year")
    private int anioNacimiento;
    @JsonAlias("death_year")
    private int anioDefuncion;
    
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getAnioNacimiento() {
        return anioNacimiento;
    }
    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }
    public int getAnioDefuncion() {
        return anioDefuncion;
    }
    public void setAnioDefuncion(int anioDefuncion) {
        this.anioDefuncion = anioDefuncion;
    }
    @Override
    public String toString() {
        return "nombre: " + nombre + ", anioNacimiento: " + anioNacimiento + ", anioDefuncion: " + anioDefuncion
                + "\n";
    }
    

    
}
