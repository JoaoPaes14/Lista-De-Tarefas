package com.example.ListaDeTarefas.repository;

import com.example.ListaDeTarefa.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {}
