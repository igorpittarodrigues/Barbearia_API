package one.digitalinnovation.Barbearia.controller;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Endereco {

    private String rua;
    private  String bairro;
    private String cep;
    private  String complemento ;
    private String cidade;
}
