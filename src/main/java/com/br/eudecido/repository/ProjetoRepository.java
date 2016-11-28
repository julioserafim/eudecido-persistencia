package com.br.eudecido.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.br.eudecido.models.Projeto;
import java.lang.String;
import java.util.List;
import com.br.eudecido.models.Usuario;

public interface ProjetoRepository extends MongoRepository<Projeto, Integer>{
	
	List<Projeto> findByNome(String nome);
	List<Projeto> findByUsuario(Usuario usuario);
}
