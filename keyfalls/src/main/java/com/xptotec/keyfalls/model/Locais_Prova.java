package com.xptotec.keyfalls.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Locais_Prova")
public class Locais_Prova implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id_locais_prova;

    @Column(name="quantidade_candidatos")
    int quantidade_candidatos;
    
    /*
	Prova[] prova;
	Salas[] salas;
	Candidato[] candidato;
	*/
    
	public Locais_Prova(int id_locais_prova, int quantidade_candidatos) {
		super();
		this.id_locais_prova = id_locais_prova;
		this.quantidade_candidatos = quantidade_candidatos;
	}

	public int getId_locais_prova() {
		return id_locais_prova;
	}

	public int getQuantidade_candidatos() {
		return quantidade_candidatos;
	}

	public void setQuantidade_candidatos(int quantidade_candidatos) {
		this.quantidade_candidatos = quantidade_candidatos;
	}
	
	
	
}
