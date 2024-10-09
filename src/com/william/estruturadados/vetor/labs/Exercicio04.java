package com.william.estruturadados.vetor.labs;

import com.william.estruturadados.vetor.Lista;

public class Exercicio04 {

	public static void main(String[] args) {
		Lista<String> lista = new Lista<String>(5);
		
		lista.adicionar("A");
		lista.adicionar("B");
		lista.adicionar("C");
		
		System.out.println(lista.obter(7));
	}

}
