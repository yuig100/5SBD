package com.sbd.xptotec.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Funcionario extends Usuario {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	int matricula;

	public Funcionario(int id, String username, String senha, String nome, String cPF, String cEP, String endereço,
			String telefone, String endereco_email, char sexo, int matricula) {
		super(id, username, senha, nome, cPF, cEP, endereço, telefone, endereco_email, sexo);
		this.matricula = matricula;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	
}
