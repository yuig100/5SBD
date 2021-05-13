package com.xptotec.keyfalls.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Relatorio")
public class Relatorio implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id_relatorio;
    	
    /*
	Candidato[] candidato;
	Prova[] prova;
    */
    
	public Relatorio(int id_relatorio) {
		super();
		this.id_relatorio = id_relatorio;
	}

	public int getId_relatorio() {
		return id_relatorio;
	}

}

