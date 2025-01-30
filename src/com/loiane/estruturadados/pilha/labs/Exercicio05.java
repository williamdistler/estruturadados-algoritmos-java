package com.loiane.estruturadados.pilha.labs;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio05 {

    public static void main(String[] args) {
        Stack<Character> pilha = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite letra por letra seu palíndromo, caso queira terminar a palavra digite 0:");
        char caractere;
        
        while (true) {
            String entrada = scanner.next();
            caractere = entrada.charAt(0);
            if (caractere == '0') break;
            pilha.push(caractere);
        }
        
        System.out.println(pilha.toString() + " É palíndromo? " + (verificarPalindromo(pilha) ? "Sim" : "Não"));
    }

    private static boolean verificarPalindromo(Stack<Character> pilhaOriginal) {
        Stack<Character> pilhaCopia = new Stack<>();
        pilhaCopia.addAll(pilhaOriginal);
        Stack<Character> pilhaInvertida = new Stack<>();

        while (!pilhaCopia.isEmpty()) {
            pilhaInvertida.push(pilhaCopia.pop());
        }

        while (!pilhaOriginal.isEmpty()) {
            if (!pilhaOriginal.pop().equals(pilhaInvertida.pop())) {
                return false;
            }
        }

        return true;
    }
}
