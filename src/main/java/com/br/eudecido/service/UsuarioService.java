package com.br.eudecido.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.eudecido.models.Usuario;
import com.br.eudecido.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repository;
	
	public void salvar(Usuario usuario){
		repository.save(usuario);
	}	
	
	public void excluir(Integer id){
		repository.delete(id);
	}
	
	public List<Usuario> listar(){
		return repository.findAll();
	}
	
	public List<Usuario> buscarPorCPF(String cpf){
		return repository.findByCpf(cpf);
	}
	
	public List<Usuario> buscarPorEmail(String email){
		return repository.findByEmail(email);
	}
	
	
	
}
