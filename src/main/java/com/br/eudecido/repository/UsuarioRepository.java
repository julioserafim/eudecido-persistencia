package com.br.eudecido.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.br.eudecido.models.Usuario;
import java.lang.String;
import java.util.List;
import java.lang.Integer;

public interface UsuarioRepository extends MongoRepository<Usuario, Integer>{
	List<Usuario> findByCpf(String cpf);
	List<Usuario> findByEmail(String email);
}
