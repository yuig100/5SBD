package com.sbd.faculdade.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Salas implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int idSalas;

	public int getIdSalas() {
		return idSalas;
	}

	public void setIdSalas(int idSalas) {
		this.idSalas = idSalas;
	}
	
	
}
