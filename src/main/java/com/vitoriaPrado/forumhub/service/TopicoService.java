package com.vitoriaPrado.forumhub.service;

import com.vitoriaPrado.forumhub.dto.TopicoRequest;
import com.vitoriaPrado.forumhub.model.Topico;
import com.vitoriaPrado.forumhub.repository.TopicoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicoService {

    private final TopicoRepository topicoRepository;

    public TopicoService(TopicoRepository topicoRepository) {
        this.topicoRepository = topicoRepository;
    }

    public Topico criarTopico(TopicoRequest topicoRequest) {
        // Lógica de criação de tópico
        Topico topico = new Topico(topicoRequest);
        return topicoRepository.save(topico);
    }

    public List<Topico> listarTopicos() {
        return topicoRepository.findAll();
    }

    public Topico detalharTopico(Long id) {
        return topicoRepository.findById(id).orElseThrow(() -> new RuntimeException("Tópico não encontrado"));
    }

    public Topico atualizarTopico(Long id, TopicoRequest topicoRequest) {
        Topico topico = detalharTopico(id);
        topico.setTitulo(topicoRequest.getTitulo());
        topico.setMensagem(topicoRequest.getMensagem());
        return topicoRepository.save(topico);
    }

    public void excluirTopico(Long id) {
        topicoRepository.deleteById(id);
    }
}
