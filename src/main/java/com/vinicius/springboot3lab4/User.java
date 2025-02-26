package com.vinicius.springboot3lab4;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
	String nome;
	int idade;

	public User(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}

}
