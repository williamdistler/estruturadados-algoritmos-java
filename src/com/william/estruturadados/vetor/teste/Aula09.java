package com.william.estruturadados.vetor.teste;

import com.william.estruturadados.vetor.Vetor;

public class Aula09 {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(3);
		
		vetor.adicionar("B");
		vetor.adicionar("C");
		vetor.adicionar("E");
		vetor.adicionar("F");
		vetor.adicionar("G");

		System.out.println(vetor);
		
		vetor.remover("W");
		
		System.out.println(vetor);

	}

}
