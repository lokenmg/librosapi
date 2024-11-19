package com.rodrigomencias.consulta_api.services;

public interface IConvertirDatos {
    <T> T obtenerDatos(String json, Class<T> clase);
}
