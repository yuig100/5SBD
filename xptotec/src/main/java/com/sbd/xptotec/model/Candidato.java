package com.sbd.xptotec.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Candidato extends Usuario{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Locais_Prova locais_prova;
	Salas[] salas;
	Cargo cargo;
	Prova[] prova;
	
	@Id
	int inscricao;
	
	Date data_de_inscricao;
	Date data_nascimento;
	double renda;
	boolean insento;
	double nota;
	
	//funções
	
	//Função que permite ao usuario inscrever-se no concurso
	public void inscrever(int numero_inscricao) {
		
		this.inscricao = numero_inscricao;
		
	}
	
	//Função que permite ao usuario obter o boleto de pagamento
	public void obter_boleto() {
		
	}
	
	//Função que permite ao usuario pedir a insenção de custo
	public void pedir_insencao() {
		
	}
	
	//Função que permite ao candidato ver sua quantidade de erros e acertos
	public void erros_e_acertos() {
		
	}

	//
	
	
	public Candidato(int id, String username, String senha, String nome, String cPF, String cEP, String endereço,
			String telefone, String endereco_email, char sexo, Locais_Prova locais_prova, Salas[] salas, Cargo cargo,
			Prova[] prova, int inscricao, Date data_de_inscricao, Date data_nascimento, double renda, boolean insento,
			double nota) {
		super(id, username, senha, nome, cPF, cEP, endereço, telefone, endereco_email, sexo);
		this.locais_prova = locais_prova;
		this.salas = salas;
		this.cargo = cargo;
		this.prova = prova;
		this.inscricao = inscricao;
		this.data_de_inscricao = data_de_inscricao;
		this.data_nascimento = data_nascimento;
		this.renda = renda;
		this.insento = insento;
		this.nota = nota;
	}

	public Locais_Prova getLocais_prova() {
		return locais_prova;
	}

	public void setLocais_prova(Locais_Prova locais_prova) {
		this.locais_prova = locais_prova;
	}

	public Salas[] getSalas() {
		return salas;
	}

	public void setSalas(Salas[] salas) {
		this.salas = salas;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public Prova[] getProva() {
		return prova;
	}

	public void setProva(Prova[] prova) {
		this.prova = prova;
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
