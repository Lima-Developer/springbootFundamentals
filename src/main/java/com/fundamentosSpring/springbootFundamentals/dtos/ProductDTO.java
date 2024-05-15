package com.fundamentosSpring.springbootFundamentals.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

//Uma record DTO (Data Transfer Object) inicializa quais atributos serão recebidos pelo usuário

//Como o Id será gerado automaticamente apenas precisamos receber os outros atributos inseridos pelo usuário

//@NotBlank define que a string não pode ser vazia/null/etc
//@NotNull define que o value não pode ser nulo/zero
public record ProductDTO (@NotBlank String name, @NotNull BigDecimal value){
}
