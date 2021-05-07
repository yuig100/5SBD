package com.sbd.faculdade.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alunosturma implements Serializable {

	private static final long serialVersionUID = 1L;

	Alunos alunos;
	Turma turma;
	Notas notas;
	
	@Id
	int idAluno;
	@Id
	int idTurma;
	@Id
	int idNotas;

	public int getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(int idAluno) {
		this.idAluno = idAluno;
	}

	public int getIdTurma() {
		return idTurma;
	}

	public void setIdTurma(int idTurma) {
		this.idTurma = idTurma;
	}

	public int getIdNotas() {
		return idNotas;
	}

	public void setIdNotas(int idNotas) {
		this.idNotas = idNotas;
	}

}
