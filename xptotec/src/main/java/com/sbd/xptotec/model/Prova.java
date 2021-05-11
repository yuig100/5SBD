package com.sbd.xptotec.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Prova implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Cargo cargo;
	Locais_Prova[] locais_prova;
	Candidato candidato;
	
	@Id
	int id;
	
	String localidade;
	int acertos;
	int erros;
	
	//Funções
	
	//Função que calcula a nota de cada candidato 
	public void calcular_nota(double nota_prova) {
		
		
		
		candidato.nota = nota_prova;
		
	}
	
	//Função que permite a anulação de uma questão
	public void anular_questão() {
		
		double nota_atual = 0;
		
		calcular_nota(nota_atual);
	}
	
	//Função que libera o gabarito da prova
	public void liberar_gabarito() {
		
		
	}
	
	
	//Função que libera a lista de classificados com sua respectiva pontuação
	public void liberar_lista_classificados(){
		
	}
	
	//

	public Prova(Cargo cargo, Locais_Prova[] locais_prova, Candidato candidato, int id, String localidade, int acertos,
			int erros) {
		super();
		this.cargo = cargo;
		this.locais_prova = locais_prova;
		this.candidato = candidato;
		this.id = id;
		this.localidade = localidade;
		this.acertos = acertos;
		this.erros = erros;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public Locais_Prova[] getLocais_prova() {
		return locais_prova;
	}

	public void setLocais_prova(Locais_Prova[] locais_prova) {
		this.locais_prova = locais_prova;
	}

	public Candidato getCandidato() {
		return candidato;
	}

	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	public int getAcertos() {
		return acertos;
	}

	public void setAcertos(int acertos) {
		this.acertos = acertos;
	}

	public int getErros() {
		return erros;
	}

	public void setErros(int erros) {
		this.erros = erros;
	}
	
	
	
}
