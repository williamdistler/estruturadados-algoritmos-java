package com.loiane.estruturadados.pilha.labs;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio07 {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Digite o numero decimal: ");
        Integer numeroDecimal = scanner.nextInt();
        decimalBinario(numeroDecimal);
        
	}
	
	public static String decimalBinario(int numeroDecimal) {
        Stack<Integer> pilhaBinariaInvertida = new Stack<>();
        String binario = "";
		
        while (numeroDecimal > 0) {
        	pilhaBinariaInvertida.add(numeroDecimal % 2);
        	numeroDecimal /= 2;
        }
        
        while (!pilhaBinariaInvertida.isEmpty()) {
        	binario += String.valueOf(pilhaBinariaInvertida.pop());
        }
        
        System.out.println("O número binário é: " + binario);

		return binario;
	}

}
