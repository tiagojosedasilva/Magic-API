package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Cards {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long idcard;
	private String nome;
	private String edicao;
	private String idioma;
	private String tipo;
	private double preco;
	private Long quant;
	
	
	public Long getIdcard() {
		return idcard;
	}
	public void setIdcard(Long idcard) {
		this.idcard = idcard;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEdicao() {
		return edicao;
	}
	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public Long getQuant() {
		return quant;
	}
	public void setQuant(Long quant) {
		this.quant = quant;
	}	
}