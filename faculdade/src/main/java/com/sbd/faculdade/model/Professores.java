package com.sbd.faculdade.model;

import javax.persistence.Entity;

@Entity
public class Professores extends Usuarios{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int matricula;
	String Nome;
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	
	
}
