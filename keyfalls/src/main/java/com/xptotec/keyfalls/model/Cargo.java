package com.xptotec.keyfalls.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Cargo")
public class Cargo implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id_cargo;
    
    /*
	Prova[] Provas;
	Salas[] salas;
     */

	public Cargo(int id_cargo) {
		super();
		this.id_cargo = id_cargo;
	}

	public int getId_cargo() {
		return id_cargo;
	}
	
}
