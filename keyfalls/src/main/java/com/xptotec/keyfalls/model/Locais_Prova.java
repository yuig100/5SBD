package com.xptotec.keyfalls.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "Locais_Prova")
public class Locais_Prova implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id_locais_prova;

	@Column(name = "quantidade_candidatos")
	int quantidade_candidatos;

	@OneToMany(mappedBy = "locais_prova")
	private List<Candidato> candidato;

	@OneToMany(mappedBy = "locais_prova")
	private List<Salas> salas;

	@ManyToMany
	@JoinTable(name = "locais_prova_prova", joinColumns = @JoinColumn(name = "locais_prova_fk"), inverseJoinColumns = @JoinColumn(name = "prova_fk"))
	private List<Prova> prova;

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
