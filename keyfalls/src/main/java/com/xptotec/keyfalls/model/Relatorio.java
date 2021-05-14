package com.xptotec.keyfalls.model;

import java.io.Serializable;
import java.util.List;

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
@Table(name = "Relatorio")
public class Relatorio implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id_relatorio;

	@OneToMany(mappedBy = "relatorio")
	private List<Candidato> candidato;

	@ManyToMany
	@JoinTable(name = "relatorio_prova", joinColumns = @JoinColumn(name = "relatorio_fk"), inverseJoinColumns = @JoinColumn(name = "prova_fk"))
	private List<Prova> prova;

	public Relatorio(int id_relatorio) {
		super();
		this.id_relatorio = id_relatorio;
	}

	public int getId_relatorio() {
		return id_relatorio;
	}

}
