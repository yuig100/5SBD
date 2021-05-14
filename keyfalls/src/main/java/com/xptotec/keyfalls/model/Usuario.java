package com.xptotec.keyfalls.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name="Usuario")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Usuario implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id_usuario;
    @Column(name="username")
    String username;
    @Column(name="senha")
    String senha;
    @Column(name="nome")
    String nome;
    @Column(name="cpf")
    String CPF;
    @Column(name="cep")
    String CEP;
    @Column(name="endereco")
    String endereco;
    @Column(name="telefone")
    String telefone;
    @Column(name="endereco_email")
    String endereco_email;
    @Column(name="sexo")
    char sexo;

    // funções

    public Usuario(int id, String username, String senha, String nome, String cPF, String cEP, String endereco,
                   String telefone, String endereco_email, char sexo) {
        super();
        this.id_usuario = id;
        this.username = username;
        this.senha = senha;
        this.nome = nome;
        CPF = cPF;
        CEP = cEP;
        this.endereco = endereco;
        this.telefone = telefone;
        this.endereco_email = endereco_email;
        this.sexo = sexo;
    }

    public int getId() {
        return id_usuario;
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
        return endereco;
    }

    public void setEndereço(String endereco) {
        this.endereco = endereco;
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

