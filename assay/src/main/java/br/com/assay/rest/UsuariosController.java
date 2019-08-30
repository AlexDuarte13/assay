package br.com.assay.rest;

import java.io.Serializable;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.assay.document.Usuario;

@RestController
public class UsuariosController implements Serializable{
	private static final long serialVersionUID = -4736537395696804447L;

	@RequestMapping("/usuarios/{nome}/{idade}")
	public Usuario buscarUsuario(@PathVariable String nome, @PathVariable Integer idade) {
		return new Usuario(nome, idade);
	}
	

}
