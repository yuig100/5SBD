package com.sbd.xptotec.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Relatorio implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Candidato[] candidato;
	Prova[] prova;
	
	@Id
	int id;
	
	//Funções
	
	//Função que permite gerar um relatorio dos candidatos classificados
	public void gerar_relatorio(String nome,int numero_inscricao,double nota) {
		
		
		
	}

	
	//
	
	
	public Relatorio(Candidato[] candidato, Prova[] prova, int id) {
		super();
		this.candidato = candidato;
		this.prova = prova;
		this.id = id;
	}


	public Candidato[] getCandidato() {
		return candidato;
	}


	public void setCandidato(Candidato[] candidato) {
		this.candidato = candidato;
	}


	public Prova[] getProva() {
		return prova;
	}


	public void setProva(Prova[] prova) {
		this.prova = prova;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	

}
