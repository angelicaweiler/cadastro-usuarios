package com.javanauta.cadastrousuario.api;

import com.javanauta.cadastrousuario.api.request.UsuarioRequestDTO;
import com.javanauta.cadastrousuario.api.response.UsuarioResponseDTO;
import com.javanauta.cadastrousuario.business.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService usuarioService;

    @PostMapping()
    public ResponseEntity<UsuarioResponseDTO> gravaDadosUsuario(@RequestBody UsuarioRequestDTO usuarioRequestDTO) {
        return ResponseEntity.ok(usuarioService.gravarUsuarios(usuarioRequestDTO));
    }

    @PutMapping()
    public ResponseEntity<UsuarioResponseDTO> atualizaDadosUsuario(@RequestBody UsuarioRequestDTO usuarioRequestDTO) {
        return ResponseEntity.ok(usuarioService.atualizaCadastro(usuarioRequestDTO));
    }

    @GetMapping()
    public ResponseEntity<UsuarioResponseDTO> buscaUsuarioPorEmail(@RequestParam ("email") String email) {
        return ResponseEntity.ok(usuarioService.buscaDadosUsuario(email));
    }

    @GetMapping("/iniciais")
    public ResponseEntity<List<UsuarioResponseDTO>> buscaUsuarioPorIniciais(@RequestParam ("iniciais") String iniciais) {
        return ResponseEntity.ok(usuarioService.buscaPorIniciais(iniciais));
    }

    @DeleteMapping
    public ResponseEntity<Void> deletaDadosUsuario(@RequestParam ("email") String email) {
        usuarioService.deletaDadosUsuario(email);
        return ResponseEntity.accepted().build();
    }

    @PatchMapping
    public ResponseEntity<Void> updateDeEmail(@RequestParam ("email") String email,
                                              @RequestParam ("documento") String documento) {
        usuarioService.fazUpdateDeEmail(email, documento);
        return ResponseEntity.accepted().build();
    }


}
