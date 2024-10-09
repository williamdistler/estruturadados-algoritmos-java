package com.william.estruturadados.vetor.labs;

import com.william.estruturadados.vetor.Lista;

public class Exercicio03 {

	public static void main(String[] args) {
		Lista<String> lista = new Lista<String>(5);
		
		lista.adicionar("A");
		lista.adicionar("B");
		lista.adicionar("C");
		lista.adicionar("A");
		
		lista.remover("B");
		
		System.out.println(lista.toString());
	}

}
