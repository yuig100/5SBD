package com.sbd.xptotec.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Locais_Prova implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	int id;
	
	Prova[] prova;
	Salas[] salas;
	int quantidade_candidatos;
	
	//funções
	
	//Função que permite obter a quantidade de candidatos em uma determinada localidade
	public void estabelecer_locais() {
		
	}
	
	//Função que escolhe o local de prova mais proximo da residencia do candidato
	public void candidado_local() {
		
	}
	
	
	//
	
	public Locais_Prova(int id, Prova[] prova, Salas[] salas, int quantidade_candidatos) {
		super();
		this.id = id;
		this.prova = prova;
		this.salas = salas;
		this.quantidade_candidatos = quantidade_candidatos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Prova[] getProva() {
		return prova;
	}

	public void setProva(Prova[] prova) {
		this.prova = prova;
	}

	public Salas[] getSalas() {
		return salas;
	}

	public void setSalas(Salas[] salas) {
		this.salas = salas;
	}

	public int getQuantidade_candidatos() {
		return quantidade_candidatos;
	}

	public void setQuantidade_candidatos(int quantidade_candidatos) {
		this.quantidade_candidatos = quantidade_candidatos;
	}
	
}
