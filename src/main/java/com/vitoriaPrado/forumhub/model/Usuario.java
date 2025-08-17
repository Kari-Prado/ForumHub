package com.vitoriaPrado.forumhub.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String senha;

    @ManyToMany
    private List<Perfil> perfis;

    // Getters and setters
}
