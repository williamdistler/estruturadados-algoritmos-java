package com.william.estruturadados.vetor.teste;

import com.william.estruturadados.vetor.Lista;

public class Aula11 {

	public static void main(String[] args) {
		
		Lista<Contato> vetor = new Lista<Contato>(2);
		
		Contato c1 = new Contato("William Neves", "(11)98750-0056", "william.distler@icloud.com");
		Contato c2 = new Contato("William ", "(11)98750-0056", "william.distler@outlook.com");
		Contato c3 = new Contato("William Distler", "(11)98750-0056", "will.distlerneves@gmail.com");
		
		vetor.adicionar(c1);
		vetor.adicionar(c2);
		vetor.adicionar(c3);
		
		System.out.println(vetor.toString());
		
	}

}
