package com.exemplo.listadetarefas.repository;

import com.exemplo.listadetarefas.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}
