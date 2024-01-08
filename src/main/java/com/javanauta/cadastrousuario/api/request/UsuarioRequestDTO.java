package com.javanauta.cadastrousuario.api.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.javanauta.cadastrousuario.api.request.EnderecoRequestDTO;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class UsuarioRequestDTO {

    private String nome;

    @JsonProperty(required = true)
    private String email;

    private String documento;

    private EnderecoRequestDTO endereco;


}
