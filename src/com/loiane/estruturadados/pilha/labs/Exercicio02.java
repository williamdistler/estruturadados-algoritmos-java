package com.loiane.estruturadados.pilha.labs;

import java.util.Scanner;
import com.loiane.estruturadados.pilha.Pilha;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Pilha<Integer> par = new Pilha<Integer>();
		Pilha<Integer> impar = new Pilha<Integer>();
		
		for (int i = 0; i <= 10; i++) {
			System.out.println("Entre com um número: ");
			int numero = scanner.nextInt();
			if (numero == 0) {
				System.out.println("0 - Desempilhando 1 elemento de cada pilha.");
				if (par.estaVazia() || impar.estaVazia()) {
					System.out.println("ERRO, ALGUMA PILHA ESTÁ VAZIA");
				} else {
					par.desempilha();
					impar.desempilha();
				}
			} else if (numero % 2 == 0) {
				System.out.println("Empilhando o número " + numero + " na pilha par.");
				par.empilha(numero);
			} else {
				System.out.println("Empilhando o número " + numero + " na pilha impar.");
				impar.empilha(numero);
			}
		}
		
		System.out.println("Todos números foram lidos, desempilhando números das pilhas...");
		while (!par.estaVazia()) {
			System.out.println("Desempilhando um elemento da pilha par: " + par.desempilha());
		}
		while (!impar.estaVazia()) {
			System.out.println("Desempilhando um elemento da pilha impar: " + impar.desempilha());
		}
		
	}

}
