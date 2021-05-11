package com.sbd.xptotec.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cargo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Prova[] Provas;
	Salas[] salas;
	
	@Id
	int id;

	public Cargo(Prova[] provas, Salas[] salas, int id) {
		super();
		Provas = provas;
		this.salas = salas;
		this.id = id;
	}

	public Prova[] getProvas() {
		return Provas;
	}

	public void setProvas(Prova[] provas) {
		Provas = provas;
	}

	public Salas[] getSalas() {
		return salas;
	}

	public void setSalas(Salas[] salas) {
		this.salas = salas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
