package com.xptotec.keyfalls.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Candidato")
public class Candidato extends Usuario {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	int inscricao;

	@Column(name = "data_de_inscricao")
	Date data_de_inscricao;

	@Column(name = "data_nascimento")
	Date data_nascimento;

	@Column(name = "renda")
	double renda;

	@Column(name = "insento")
	boolean insento;

	@Column(name = "nota")
	double nota;

	@ManyToOne
	@JoinColumn(name = "id_locais_prova", nullable = true)
	private Locais_Prova locais_prova;

	@ManyToOne
	@JoinColumn(name = "id_cargo", nullable = true)
	Cargo cargo;

	@OneToMany(mappedBy = "candidato")
	private List<Prova> prova;

	@ManyToMany
	@JoinTable(name = "candidato_sala", joinColumns = @JoinColumn(name = "candidato_fk"), inverseJoinColumns = @JoinColumn(name = "sala_fk"))
	private List<Salas> salas;
	
	@ManyToOne
	@JoinColumn(name="id_relatorio",nullable = true)
	Relatorio relatorio;
	
	
	public Candidato(int id, String username, String senha, String nome, String cPF, String cEP, String endereco,
			String telefone, String endereco_email, char sexo, int inscricao, Date data_de_inscricao,
			Date data_nascimento, double renda, boolean insento, double nota) {
		super(id, username, senha, nome, cPF, cEP, endereco, telefone, endereco_email, sexo);
		this.inscricao = inscricao;
		this.data_de_inscricao = data_de_inscricao;
		this.data_nascimento = data_nascimento;
		this.renda = renda;
		this.insento = insento;
		this.nota = nota;
	}

	public int getInscricao() {
		return inscricao;
	}

	public void setInscricao(int inscricao) {
		this.inscricao = inscricao;
	}

	public Date getData_de_inscricao() {
		return data_de_inscricao;
	}

	public void setData_de_inscricao(Date data_de_inscricao) {
		this.data_de_inscricao = data_de_inscricao;
	}

	public Date getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public double getRenda() {
		return renda;
	}

	public void setRenda(double renda) {
		this.renda = renda;
	}

	public boolean isInsento() {
		return insento;
	}

	public void setInsento(boolean insento) {
		this.insento = insento;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

}
