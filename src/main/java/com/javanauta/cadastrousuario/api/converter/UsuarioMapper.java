package com.javanauta.cadastrousuario.api.converter;

import com.javanauta.cadastrousuario.api.request.UsuarioRequestDTO;
import com.javanauta.cadastrousuario.api.response.UsuarioResponseDTO;
import com.javanauta.cadastrousuario.infrastructure.entities.UsuarioEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

    UsuarioResponseDTO paraUsuarioResponseDTO(UsuarioEntity usuario);

    UsuarioResponseDTO paraUsuarioResponseDTO(UsuarioRequestDTO usuario);

    List<UsuarioResponseDTO> paraListaUsuarioResponseDTO(List<UsuarioEntity> usuarios);


}
