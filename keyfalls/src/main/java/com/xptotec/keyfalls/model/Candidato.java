package com.xptotec.keyfalls.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Candidato")
public class Candidato extends Usuario {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	int inscricao;
	
	@Column(name = "data_de_inscricao")
	Date data_de_inscricao;
	
	@Column(name = "data_nascimento")
	Date data_nascimento;
	
	@Column(name = "renda")
	double renda;
	
	@Column(name = "insento")
	boolean insento;
	
	@Column(name = "nota")
	double nota;
	
	/*
	Locais_Prova locais_prova;
	Salas[] salas;
	Cargo cargo;
	Prova[] prova;
	*/
	
	public Candidato(int id, String username, String senha, String nome, String cPF, String cEP, String endereco,
			String telefone, String endereco_email, char sexo, int inscricao, Date data_de_inscricao,
			Date data_nascimento, double renda, boolean insento, double nota) {
		super(id, username, senha, nome, cPF, cEP, endereco, telefone, endereco_email, sexo);
		this.inscricao = inscricao;
		this.data_de_inscricao = data_de_inscricao;
		this.data_nascimento = data_nascimento;
		this.renda = renda;
		this.insento = insento;
		this.nota = nota;
	}

	public int getInscricao() {
		return inscricao;
	}

	public void setInscricao(int inscricao) {
		this.inscricao = inscricao;
	}

	public Date getData_de_inscricao() {
		return data_de_inscricao;
	}

	public void setData_de_inscricao(Date data_de_inscricao) {
		this.data_de_inscricao = data_de_inscricao;
	}

	public Date getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public double getRenda() {
		return renda;
	}

	public void setRenda(double renda) {
		this.renda = renda;
	}

	public boolean isInsento() {
		return insento;
	}

	public void setInsento(boolean insento) {
		this.insento = insento;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	
}
