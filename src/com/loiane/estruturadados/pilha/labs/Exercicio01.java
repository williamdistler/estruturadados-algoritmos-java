package com.loiane.estruturadados.pilha.labs;

import java.util.Scanner;
import com.loiane.estruturadados.pilha.Pilha;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Pilha<Integer> pilha = new Pilha<Integer>();
		
		for (int i = 0; i <= 10; i++) {
			System.out.println("Entre com um número: ");
			int numero = scanner.nextInt();
			if (numero % 2 == 0) {
				System.out.println("Empilhando o número " + numero);
				pilha.empilha(numero);
			} else {
				if (pilha.estaVazia()) {
					System.out.println("A pilha ESTÁ VAZIA");
				} else {
					System.out.println("Número ímpar, desempilhando um elemento da pilha: " + pilha.desempilha());
				}
			}
		}
		
		if (!pilha.estaVazia()) {
			System.out.println("Todos números foram lidos, desempilhando números da pilha...");
			for (int i = 0; i <= pilha.tamanho(); i++) {
				System.out.println("Desempilhando um elemento da pilha: " + pilha.desempilha());
			}
		}
		
	}

}
