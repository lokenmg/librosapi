package com.rodrigomencias.consulta_api.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record ApiModel(
    @JsonAlias("results")
    List<LibroModel> resultados
) {
}