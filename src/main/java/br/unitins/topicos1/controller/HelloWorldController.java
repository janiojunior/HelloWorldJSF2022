package br.unitins.topicos1.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class HelloWorldController {
	
	private String nome = "Joao";

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void enviar() {
		System.out.println(nome);
	}
	
}
