package com.apipost.post.DTO;

public record UserDTO( String modelo, String fabricante,String dataFabricacao, int valor, int anoModelo) {
    public UserDTO {
        if (modelo == null || fabricante == null || dataFabricacao == null || valor==0 || anoModelo==0 ) {
            throw new IllegalArgumentException("Os campos modelo, fabricante, valor, anoModelo e dataFabricacao são obrigatórios.");
        }
    }}
