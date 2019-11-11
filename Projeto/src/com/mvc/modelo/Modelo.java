package com.mvc.modelo;

public class Modelo {
	private String usuario = "dellead";
	private String senha = "123456";
	
	public boolean validarLogin(String ususario, String senha) {
		return this.usuario.equalsIgnoreCase(ususario) && this.senha.equalsIgnoreCase(senha)? true : false;
 	}

	

}
