package com.rodrigomencias.consulta_api.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LibroModel {
    @JsonAlias("title")
    private String nombre;
    @JsonAlias("languages")
    private List<String> idiomas;
    @JsonAlias("download_count")
    private int descargas;
    @JsonAlias("authors")
    private List<autor> autores;
    
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public List<String> getIdiomas() {
        return idiomas;
    }
    
    public void setIdiomas(List<String> idiomas) {
        this.idiomas = idiomas;
    }
    
    public int getDescargas() {
        return descargas;
    }
    
    public void setDescargas(int descargas) {
        this.descargas = descargas;
    }
    
    public List<autor> getAutores() {
        return autores;
    }
    
    public void setAutores(List<autor> autores) {
        this.autores = autores;
    }

    @Override
    public String toString() {
        return "LibroModel: \n"
                + "nombre: " + nombre + ", idiomas: " + idiomas + ", descargas: " + descargas + ", autores: "
                + autores + "\n";
    }

    
}
