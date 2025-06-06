package com.exemplo.listadetarefas.controller;

import com.exemplo.listadetarefas.model.Tarefa;
import com.exemplo.listadetarefas.repository.TarefaRepository;
import com.exemplo.listadetarefas.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/tarefas")
public class TarefaController {

    @Autowired
    private TarefaRepository tarefaRepo;

    @Autowired
    private UsuarioRepository usuarioRepo;

    @GetMapping
    public String listarTarefas(Model model) {
        model.addAttribute("tarefas", tarefaRepo.findAll());
        return "tarefas";  // nome do template tarefas.html
    }

    @GetMapping("/nova")
    public String novaTarefaForm(Model model) {
        model.addAttribute("tarefa", new Tarefa());
        model.addAttribute("usuarios", usuarioRepo.findAll());
        return "nova-tarefa";  // nome do template nova-tarefa.html
    }

    @PostMapping
    public String salvarTarefa(@ModelAttribute Tarefa tarefa) {
        tarefaRepo.save(tarefa);
        return "redirect:/tarefas";
    }
}
