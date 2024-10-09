package com.william.estruturadados.vetor.labs;

import com.william.estruturadados.vetor.Lista;

public class Exercicio05 {

	public static void main(String[] args) {
		Lista<String> lista = new Lista<String>(5);		
		
		lista.adicionar("A");
		lista.adicionar("B");
		lista.adicionar("C");
		lista.adicionar("D");
		lista.adicionar("E");
		
		System.out.println("Tamanho: " + lista.tamanho());
		System.out.println("Lista: " + lista.toString());
		
		lista.limpar();
		
		System.out.println("Tamanho: " + lista.tamanho());
		System.out.println("Lista: " + lista.toString());

	}

}
