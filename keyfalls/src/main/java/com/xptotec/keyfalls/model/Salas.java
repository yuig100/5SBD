package com.xptotec.keyfalls.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Salas")
public class Salas implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id_salas;
    
    @Column(name="numeracao")
    String numeracao;
    
    /*
	Cargo cargo;
	Locais_Prova locais_prova;
	Candidato[] candidato;
	Funcionario funcionario;
	*/

	public Salas(int id_salas, String numeracao) {
		super();
		this.id_salas = id_salas;
		this.numeracao = numeracao;
	}

	public int getId_salas() {
		return id_salas;
	}

	public String getNumeracao() {
		return numeracao;
	}

	public void setNumeracao(String numeracao) {
		this.numeracao = numeracao;
	}
    
    
}
