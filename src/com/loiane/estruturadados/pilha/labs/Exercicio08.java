package com.loiane.estruturadados.pilha.labs;

import java.util.Stack;

public class Exercicio08 {

	public static void main(String[] args) {
		// Torre de Hanoi
		Stack<Integer> origem = new Stack<>();
		Stack<Integer> destino = new Stack<>();
		Stack<Integer> auxiliar = new Stack<>();

		origem.push(3);
		origem.push(2);
		origem.push(1);
		
		torreDeHanoi(origem.size(), origem, destino, auxiliar);

	}

	public static void torreDeHanoi(int n, Stack<Integer> origem, Stack<Integer> destino, 
			Stack<Integer> auxiliar) {
		if (n > 0) {
			torreDeHanoi(n-1, origem, auxiliar, destino);
			destino.push(origem.pop());
			System.out.println("-------------------------");
			System.out.println("Origem: " + origem);
			System.out.println("Destino: " + destino);
			System.out.println("Auxiliar: " + auxiliar);
			torreDeHanoi(n-1, auxiliar, destino, origem);
		}
	}

}
