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
@Table(name="Prova")
public class Prova implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id_prova;
        
    @Column(name="localidade")
    String localidade;
    @Column(name="acertos")
    int acertos;
    @Column(name="erros")
    int erros;
    
	@ManyToOne
	@JoinColumn(name="id_candidato",nullable = true)
    Candidato candidato;
    
	@ManyToOne
	@JoinColumn(name="id_cargo",nullable = true)
	Cargo cargo;
	
	@ManyToMany(mappedBy = "prova")
	private List<Relatorio> relatorio;
	
    @ManyToMany(mappedBy = "prova")
    private List<Locais_Prova> locais_prova;
    
	public Prova(int id_prova, String localidade, int acertos, int erros) {
		super();
		this.id_prova = id_prova;
		this.localidade = localidade;
		this.acertos = acertos;
		this.erros = erros;
	}

	public int getId_prova() {
		return id_prova;
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	public int getAcertos() {
		return acertos;
	}

	public void setAcertos(int acertos) {
		this.acertos = acertos;
	}

	public int getErros() {
		return erros;
	}

	public void setErros(int erros) {
		this.erros = erros;
	}
	
	
    
}

