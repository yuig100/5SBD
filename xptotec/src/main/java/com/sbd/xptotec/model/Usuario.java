package com.sbd.xptotec.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;

	String username;
	String senha;

	String nome;
	String CPF;
	String CEP;
	String endereço;
	String telefone;
	String endereco_email;
	char sexo;

	// funções

	// Função que permite ao usuario se cadastrar
	public void cadastrar() {

	}

	// Função que permite ao usuario entar no sistema
	public void logar() {

	}

	//

	public Usuario(int id, String username, String senha, String nome, String cPF, String cEP, String endereço,
			String telefone, String endereco_email, char sexo) {
		super();
		this.id = id;
		this.username = username;
		this.senha = senha;
		this.nome = nome;
		CPF = cPF;
		CEP = cEP;
		this.endereço = endereço;
		this.telefone = telefone;
		this.endereco_email = endereco_email;
		this.sexo = sexo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco_email() {
		return endereco_email;
	}

	public void setEndereco_email(String endereco_email) {
		this.endereco_email = endereco_email;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

}
