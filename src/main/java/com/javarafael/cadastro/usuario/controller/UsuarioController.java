package com.javarafael.cadastro.usuario.controller;

import com.javarafael.cadastro.usuario.infrstruture.entitys.Usuario;
import com.javarafael.cadastro.usuario.infrstruture.repository.UsuarioRepository;
import com.javarafael.cadastro.usuario.nusiness.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UsuarioController {
    private final UsuarioService usuarioService;
    @PostMapping
    public ResponseEntity < Void> salvarUsuario(@RequestBody Usuario usuario) {
        usuarioService.salvarUsuario(usuario);
        return ResponseEntity.ok().build();
    }
    @GetMapping
    public ResponseEntity<Usuario> buscarUsuarioPorEmail(@RequestParam String email) {
        return ResponseEntity.ok(usuarioService.buscarUsuarioPorEmail(email));
    }
    @DeleteMapping
    public ResponseEntity<Void> deletarUsuarioporEmail(@RequestParam String email) {
        usuarioService.deletarUsuario(email);
        return ResponseEntity.ok().build();
    }
    @PutMapping
    public ResponseEntity <Void> atualizarUsuarioporId(@RequestParam Integer id, @RequestBody Usuario usuario) {
        usuarioService.atualizarUsuarioporEmail(id, usuario);
        return ResponseEntity.ok().build();
    }

}
