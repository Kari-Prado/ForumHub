package com.vitoriaPrado.forumhub.dto;

import javax.validation.constraints.NotBlank;

public class TopicoRequest {

    @NotBlank
    private String titulo;

    @NotBlank
    private String mensagem;

    private String curso;

    // Getters and setters
}
