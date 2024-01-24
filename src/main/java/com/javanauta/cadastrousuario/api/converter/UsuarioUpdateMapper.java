package com.javanauta.cadastrousuario.api.converter;

import com.javanauta.cadastrousuario.api.request.UsuarioRequestDTO;
import com.javanauta.cadastrousuario.infrastructure.entities.UsuarioEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface UsuarioUpdateMapper {

    UsuarioUpdateMapper INSTANCE = Mappers.getMapper(UsuarioUpdateMapper.class);

    void updateUsuarioFromDTO(UsuarioRequestDTO usuarioDTO, @MappingTarget UsuarioEntity usuarioEntity);
}