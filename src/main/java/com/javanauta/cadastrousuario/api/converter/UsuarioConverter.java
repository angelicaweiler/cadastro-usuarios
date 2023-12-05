package com.javanauta.cadastrousuario.api.converter;

import com.javanauta.cadastrousuario.api.request.EnderecoRequestDTO;
import com.javanauta.cadastrousuario.api.request.UsuarioRequestDTO;
import com.javanauta.cadastrousuario.api.response.EnderecoResponseDTO;
import com.javanauta.cadastrousuario.api.response.UsuarioResponseDTO;
import com.javanauta.cadastrousuario.infrastructure.entities.EnderecoEntity;
import com.javanauta.cadastrousuario.infrastructure.entities.UsuarioEntity;
import org.springframework.stereotype.Component;

@Component
public class UsuarioConverter {


    public UsuarioEntity paraUsuarioEntity(UsuarioRequestDTO usuarioDTO) {
       return UsuarioEntity.builder()
                .nome(usuarioDTO.getNome())
                .documento(usuarioDTO.getDocumento())
                .email(usuarioDTO.getEmail())
                .endereco(paraEnderecoEntity(usuarioDTO.getEndereco()))
               .build();

    }


    private EnderecoEntity paraEnderecoEntity(EnderecoRequestDTO enderecoDTO) {
       return EnderecoEntity.builder()
                .rua(enderecoDTO.getRua())
                .bairro(enderecoDTO.getBairro())
                .cep(enderecoDTO.getCep())
                .cidade(enderecoDTO.getCidade())
                .numero(enderecoDTO.getNumero())
                .complemento(enderecoDTO.getComplemento())
                .build();
    }

    public UsuarioResponseDTO paraUsuarioResponseDTO(UsuarioEntity entity) {
        return UsuarioResponseDTO.builder()
                .id(entity.getId())
                .nome(entity.getNome())
                .documento(entity.getDocumento())
                .email(entity.getEmail())
                .endereco(paraEnderecoResponseDTO(entity.getEndereco()))
                .build();

    }


    private EnderecoResponseDTO paraEnderecoResponseDTO(EnderecoEntity entity) {
        return EnderecoResponseDTO.builder()
                .rua(entity.getRua())
                .bairro(entity.getBairro())
                .cep(entity.getCep())
                .cidade(entity.getCidade())
                .numero(entity.getNumero())
                .complemento(entity.getComplemento())
                .build();
    }
}
