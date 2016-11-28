package com.br.eudecido.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.eudecido.models.Usuario;
import java.lang.String;
import java.util.List;
import java.lang.Integer;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
	List<Usuario> findByCpf(String cpf);
	List<Usuario> findByEmail(String email);
}
