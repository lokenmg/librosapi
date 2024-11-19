package com.rodrigomencias.consulta_api;

import java.util.Scanner;

import com.rodrigomencias.consulta_api.models.ApiModel;
import com.rodrigomencias.consulta_api.services.ConsumoAPI;
import com.rodrigomencias.consulta_api.services.ConvertirDatos;

public class ConexionApi {
    private Scanner sc = new Scanner(System.in);
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private final String URL_BASE = "https://gutendex.com/books/?search=";
    private ConvertirDatos conversor = new ConvertirDatos();

    public void menu(){
        System.out.println("********************Buscador de libros********************");
        var nombreLibro = sc.nextLine();
        var json = consumoAPI.obtenerDatos(URL_BASE+ nombreLibro.replace(" ", "+"));
        //System.out.println(json);
        var datos = conversor.obtenerDatos(json, ApiModel.class);
        datos.resultados().stream().limit(2);
        System.out.println(datos);
    }
}
