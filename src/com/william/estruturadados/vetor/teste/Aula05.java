package com.william.estruturadados.vetor.teste;

import com.william.estruturadados.vetor.Vetor;

public class Aula05 {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(10);
		
		vetor.adicionar("elemento 1");
		vetor.adicionar("elemento 2");
		vetor.adicionar("elemento 3");
		
		System.out.println(vetor.busca(15));
		
	}

}
