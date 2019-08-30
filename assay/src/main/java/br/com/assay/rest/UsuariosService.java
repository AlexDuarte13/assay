package br.com.assay.rest;

import java.io.Serializable;

import javax.websocket.server.PathParam;

import org.springframework.data.repository.query.Param;

public class UsuariosService implements Serializable{
	
	@PathParam("/usuarios")
	public void buscarUsuario(@Param(value = "nome") String nome) {
		
	}
	

}
