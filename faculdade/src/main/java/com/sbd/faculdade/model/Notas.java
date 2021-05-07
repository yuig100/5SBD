package com.sbd.faculdade.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Notas  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int idNotas;

	public int getIdNotas() {
		return idNotas;
	}

	public void setIdNotas(int idNotas) {
		this.idNotas = idNotas;
	}
	
	
}
