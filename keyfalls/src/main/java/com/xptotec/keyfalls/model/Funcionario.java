package com.xptotec.keyfalls.model;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class Funcionario extends Usuario {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

   
    int matricula;
    
	@OneToOne
	@JoinColumn(name = "id_salas",referencedColumnName = "id_salas")
    Salas sala;


	public Funcionario(int id, String username, String senha, String nome, String cPF, String cEP, String endereco,
			String telefone, String endereco_email, char sexo, int matricula) {
		super(id, username, senha, nome, cPF, cEP, endereco, telefone, endereco_email, sexo);
		this.matricula = matricula;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
}
