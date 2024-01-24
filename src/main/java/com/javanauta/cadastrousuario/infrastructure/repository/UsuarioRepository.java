package com.javanauta.cadastrousuario.infrastructure.repository;

import com.javanauta.cadastrousuario.infrastructure.entities.UsuarioEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {

    UsuarioEntity findByEmail(String email);

    @Query("SELECT a FROM UsuarioEntity a WHERE (LOWER(a.nome) LIKE LOWER(concat(:letras, '%')) OR LOWER(a.email) LIKE LOWER(concat('%', :letras, '%')))")
    List<UsuarioEntity> findByNomeOrEmailStartingWith(@Param("letras") String letras);

    @Query(nativeQuery = true, value = "select a.nome, a.email, a.documento, a.data_cadastro, a.endereco_id, e.id, e.rua, e.numero, e.bairro, " +
            " e.complemento, e.cidade, e.cep from usuario a left join eendereco e on e.id = a.endereco_id where email = :email")
    UsuarioEntity selectFromEmail(@Param("email") String email);

    @Transactional
    @Modifying
    @Query("update UsuarioEntity usuario set usuario.email = :email where usuario.documento = :documento")
    void updateEmail(@Param("documento") String documento,
                     @Param("email") String email);

    @Transactional
    void deleteByEmail(String email);


}
