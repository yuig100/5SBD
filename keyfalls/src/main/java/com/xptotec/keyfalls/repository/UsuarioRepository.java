package com.xptotec.keyfalls.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.xptotec.keyfalls.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer>{
	
	// Função que permite ao usuario se cadastrar
	<UserMod extends Usuario>UserMod save(UserMod usuario);
	
	// Função que permite ao usuario entar no sistema
	
	
	//Função que lista todos os usuarios
	List <Usuario> findAll();
	
	//Pesquisar por id
	Usuario findById(int id);
	
	//remover usuario
	void delete(Usuario usuario);
}
