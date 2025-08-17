package com.vitoriaPrado.forumhub.controller;

import com.vitoriaPrado.forumhub.dto.TopicoRequest;
import com.vitoriaPrado.forumhub.model.Topico;
import com.vitoriaPrado.forumhub.service.TopicoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    private final TopicoService topicoService;

    public TopicoController(TopicoService topicoService) {
        this.topicoService = topicoService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Topico criarTopico(@RequestBody TopicoRequest topicoRequest) {
        return topicoService.criarTopico(topicoRequest);
    }

    @GetMapping
    public List<Topico> listarTopicos() {
        return topicoService.listarTopicos();
    }

    @GetMapping("/{id}")
    public Topico detalharTopico(@PathVariable Long id) {
        return topicoService.detalharTopico(id);
    }

    @PutMapping("/{id}")
    public Topico atualizarTopico(@PathVariable Long id, @RequestBody TopicoRequest topicoRequest) {
        return topicoService.atualizarTopico(id, topicoRequest);
    }

    @DeleteMapping("/{id}")
    public void excluirTopico(@PathVariable Long id) {
        topicoService.excluirTopico(id);
    }
}
