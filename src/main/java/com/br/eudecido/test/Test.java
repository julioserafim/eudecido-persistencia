package com.br.eudecido.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.br.eudecido.models.Endereco;
import com.br.eudecido.models.Usuario;
import com.br.eudecido.repository.UsuarioRepository;
import com.br.eudecido.service.UsuarioService;

@SpringBootApplication
public class Test{
	public static void main(String[] args) {
		
		UsuarioService usuarioService = new UsuarioService();
		
		Usuario usuario = new Usuario();
		usuario.setNome("Julio");
		usuario.setCpf("06129767340");
		usuario.setEmail("serafimjuliom583@gmail.com");
		usuario.setSenha("asasa");
		usuario.setTitulo("I");
		usuario.setId_usuario(1);
		
		
		usuarioService.salvar(usuario);
		
		
		
	}
	
}
