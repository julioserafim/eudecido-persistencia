package com.br.eudecido.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.br.eudecido.models.Usuario;
import com.br.eudecido.service.UsuarioService;


@Controller
@RestController
@RequestMapping(value = "/usuarioController")
public class UsuarioController {

	private final UsuarioService uService;

	@Autowired
	public UsuarioController(UsuarioService uService) {
		this.uService = uService; 
	}


	@RequestMapping(value = "/buscarTodos", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<List<Usuario>> getAllUsuarios(){
		return new ResponseEntity<List<Usuario>>(uService.listar(), HttpStatus.OK);
	}

	@RequestMapping(value = "/salvar", method = RequestMethod.POST, 
			produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<String> salvar(@RequestBody Usuario usuario){
		if(uService.buscarPorCPF(usuario.getCpf()) != null)
			return new ResponseEntity<String>("CPF já está em uso", HttpStatus.NOT_ACCEPTABLE);
		if(uService.buscarPorEmail(usuario.getEmail()) != null)
			return new ResponseEntity<String>("Email já está em uso", HttpStatus.NOT_ACCEPTABLE);
		uService.salvar(usuario);
		return new ResponseEntity<String>("Usuario cadastrado!", HttpStatus.OK);
	}

}
