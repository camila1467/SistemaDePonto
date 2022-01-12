package com.camila.domain;

import java.io.Serializable;

public class Cliente extends Pessoa implements Serializable {
private static long serialVersonUID=1L;
	public Cliente() {
		super();
	}

	public Cliente(Integer id, String nome, String cpf, String telefone) {
		super(id, nome, cpf, telefone);
	}

	
	
	
	
}
