package com.exemplo.listadetarefas.repository;

import com.exemplo.listadetarefas.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
