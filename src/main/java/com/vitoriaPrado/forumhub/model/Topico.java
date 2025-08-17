package com.vitoriaPrado.forumhub.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String mensagem;
    private String curso;
    private LocalDateTime dataCriacao;

    @ManyToOne
    private Usuario autor;

    // Getters and setters
}
