package com.javanauta.cadastrousuario.api.request;

import jakarta.persistence.Column;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
public class EnderecoRequestDTO {

    private String rua;

    private Long numero;

    private String bairro;

    private String complemento;

    private String cidade;

    private String cep;
}
