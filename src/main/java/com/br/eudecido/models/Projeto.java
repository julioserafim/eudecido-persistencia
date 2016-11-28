package com.br.eudecido.models;


import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Projeto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id_projeto;
	@NotNull
	private String nome;
	@NotNull
	private String descricao;
	@NotNull
	private Date inicio;
	@NotNull
	private Date fim;
	@NotNull
	private boolean conclusao;
	@NotNull
	@OneToOne
	private Usuario usuario;
	@NotNull
	@OneToMany
	private Comentario comentario;
	@NotNull
	@OneToMany
	private Reacao reacao;

	public Reacao getReacao() {
		return reacao;
	}

	public void setReacao(Reacao reacao) {
		this.reacao = reacao;
	}

	public Comentario getComentario() {
		return comentario;
	}

	public void setComentario(Comentario comentario) {
		this.comentario = comentario;
	}

	public Integer getId_projeto() {
		return id_projeto;
	}

	public void setId_projeto(Integer id_projeto) {
		this.id_projeto = id_projeto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getInicio() {
		return inicio;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	public Date getFim() {
		return fim;
	}

	public void setFim(Date fim) {
		this.fim = fim;
	}

	public boolean isConclusao() {
		return conclusao;
	}

	public void setConclusao(boolean conclusao) {
		this.conclusao = conclusao;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
