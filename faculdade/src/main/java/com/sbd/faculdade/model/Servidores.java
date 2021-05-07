package com.sbd.faculdade.model;

import javax.persistence.Entity;

@Entity
public class Servidores extends Usuarios{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int matricula;
	String nome;
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
