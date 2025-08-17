package com.vitoriaPrado.forumhub.security;

import com.vitoriaPrado.forumhub.service.TokenService;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

public class JwtRequestFilter extends OncePerRequestFilter {

    private final TokenService tokenService;

    public JwtRequestFilter(TokenService tokenService) {
        this.tokenService = tokenService;
    }

    @Override
    protected void doFilterInternal(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, FilterChain chain)
            throws ServletException, IOException {
        // Lógica para validar o token JWT
    }
}
