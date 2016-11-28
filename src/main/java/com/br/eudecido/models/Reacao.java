package com.br.eudecido.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Reacao {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id_reacao;
	@NotNull
	private boolean gostei;
	@NotNull
	@OneToOne
	private Usuario usuario;
	@NotNull
	@OneToOne
	private Projeto projeto;

	public Integer getId_reacao() {
		return id_reacao;
	}

	public void setId_reacao(Integer id_reacao) {
		this.id_reacao = id_reacao;
	}

	public boolean isGostei() {
		return gostei;
	}

	public void setGostei(boolean gostei) {
		this.gostei = gostei;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}

}
