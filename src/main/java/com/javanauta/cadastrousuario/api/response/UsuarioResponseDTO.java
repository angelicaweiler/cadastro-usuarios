package com.javanauta.cadastrousuario.api.response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsuarioResponseDTO {

    private Long id;

    private String nome;

    private String email;

    private String documento;

    private EnderecoResponseDTO endereco;


}
