package com.netflix.projeto.usuario.controller;

import com.netflix.projeto.usuario.entity.Usuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/usuario")
// Api Rest, consumir ou salvar informação de usuario nesse contexto
// Configurar a URL para fazer isso, para disponibilizar serviço
public class UsuarioController {

    // Quando quero salvar uma informação em uma api rest uso post
    @PostMapping
    // Requesbuddy permite pegar conteudo do corpo na api rest, pega o objeto do cliente
    public Usuario salvar(@RequestBody Usuario usuario) {
        // Validar o usuario
        System.out.println(usuario);

        // Retorna usuario
        return usuario;
    }

    @GetMapping
    public List<Usuario> listar() {
        Usuario u = new Usuario();
        u.setId(1);

        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(u);
        return usuarios;
    }

}
