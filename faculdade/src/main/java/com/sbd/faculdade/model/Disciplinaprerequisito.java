package com.sbd.faculdade.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Disciplinaprerequisito {
	
	@Id
	int idDisciplinaPrincipal;
	@Id
	int idDisciplinaPre;
	
	public int getIdDisciplinaPrincipal() {
		return idDisciplinaPrincipal;
	}
	public void setIdDisciplinaPrincipal(int idDisciplinaPrincipal) {
		this.idDisciplinaPrincipal = idDisciplinaPrincipal;
	}
	public int getIdDisciplinaPre() {
		return idDisciplinaPre;
	}
	public void setIdDisciplinaPre(int idDisciplinaPre) {
		this.idDisciplinaPre = idDisciplinaPre;
	}
	
	
}
