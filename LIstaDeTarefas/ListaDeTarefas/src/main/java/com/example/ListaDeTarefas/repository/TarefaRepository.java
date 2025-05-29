package com.example.ListaDeTarefas.repository;

import com.example.ListaDeTarefas.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {}

