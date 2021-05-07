package com.sbd.faculdade.model;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Alunos extends Usuarios{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Turma turma;
	int matricula;
	String nome;
	String turno;
	int creditosComplementares;
	Date dtIngresso;
	
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
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	public int getCreditosComplementares() {
		return creditosComplementares;
	}
	public void setCreditosComplementares(int creditosComplementares) {
		this.creditosComplementares = creditosComplementares;
	}
	public Date getDtIngresso() {
		return dtIngresso;
	}
	public void setDtIngresso(Date dtIngresso) {
		this.dtIngresso = dtIngresso;
	}
	
}
