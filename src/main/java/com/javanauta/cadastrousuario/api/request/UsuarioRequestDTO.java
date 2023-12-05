package com.javanauta.cadastrousuario.api.request;

import com.javanauta.cadastrousuario.api.request.EnderecoRequestDTO;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsuarioRequestDTO {

    private String nome;

    private String email;

    private String documento;

    private EnderecoRequestDTO endereco;


}
