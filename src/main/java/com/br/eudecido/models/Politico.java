package com.br.eudecido.models;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Politico {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id_politico;
	@NotNull
	private Date inicio_mandado;
	@NotNull
	private Date fim_mandato;
	@NotNull
	@OneToOne
	private Usuario usuario;

	public Integer getId_politico() {
		return id_politico;
	}

	public void setId_politico(Integer id_politico) {
		this.id_politico = id_politico;
	}

	public Date getInicio_mandado() {
		return inicio_mandado;
	}

	public void setInicio_mandado(Date inicio_mandado) {
		this.inicio_mandado = inicio_mandado;
	}

	public Date getFim_mandato() {
		return fim_mandato;
	}

	public void setFim_mandato(Date fim_mandato) {
		this.fim_mandato = fim_mandato;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
