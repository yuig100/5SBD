package com.xptotec.keyfalls.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
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
    
	@ManyToOne
	@JoinColumn(name="id_cargo",nullable = true)
	Cargo cargo;
    
	@ManyToOne
	@JoinColumn(name="id_locais_prova",nullable = true)
	Locais_Prova locais_prova;

	@ManyToMany(mappedBy = "prova")
	private List<Candidato> candidato;
	
    /*
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
