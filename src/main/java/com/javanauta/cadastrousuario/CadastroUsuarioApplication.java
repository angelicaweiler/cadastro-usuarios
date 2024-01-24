package com.javanauta.cadastrousuario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.javanauta.cadastrousuario.api.converter")
public class CadastroUsuarioApplication {

    public static void main(String[] args) {
        SpringApplication.run(CadastroUsuarioApplication.class, args);
    }

}
