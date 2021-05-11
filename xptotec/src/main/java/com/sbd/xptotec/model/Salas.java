package com.sbd.xptotec.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Salas  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Cargo cargo;
	Locais_Prova locais_prova;
	Candidato[] candidato;
	Funcionario funcionario;
	
	@Id
	int id;

	public Salas(Cargo cargo, Locais_Prova locais_prova, Candidato[] candidato, Funcionario funcionario, int id) {
		super();
		this.cargo = cargo;
		this.locais_prova = locais_prova;
		this.candidato = candidato;
		this.funcionario = funcionario;
		this.id = id;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public Locais_Prova getLocais_prova() {
		return locais_prova;
	}

	public void setLocais_prova(Locais_Prova locais_prova) {
		this.locais_prova = locais_prova;
	}

	public Candidato[] getCandidato() {
		return candidato;
	}

	public void setCandidato(Candidato[] candidato) {
		this.candidato = candidato;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	//Funções		
		
	
	
	//
	
	
	
}
