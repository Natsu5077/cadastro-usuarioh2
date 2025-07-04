package com.javarafael.cadastro.usuario.infrstruture.repository;
import com.javarafael.cadastro.usuario.infrstruture.entitys.Usuario;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Optional<Usuario> findByEmail(String email);
    @Transactional
    void deleteByEmail(String email);

    List<Usuario> id(int id);
}
