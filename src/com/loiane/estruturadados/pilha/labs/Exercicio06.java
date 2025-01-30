package com.loiane.estruturadados.pilha.labs;

import com.loiane.estruturadados.pilha.Pilha;

public class Exercicio06 {

    public static void main(String[] args) {
        imprimeResultado("A + B");
        imprimeResultado("A + B + (C - D)");
        imprimeResultado("(A + B) + (C - D))"); // Não balanceado
        imprimeResultado("((A + B) + (C - D))"); // Balanceado
    }

    public static void imprimeResultado(String expressao) {
        System.out.println(expressao + " está balanceado? " + 
                verificaSimbolosBalanceados(expressao));
    }

    public static boolean verificaSimbolosBalanceados(String expressao) {
        Pilha<Character> pilha = new Pilha<>();

        for (int i = 0; i < expressao.length(); i++) {
            char simbolo = expressao.charAt(i);

            if (simbolo == '(') {
                pilha.empilha(simbolo);
            }

            else if (simbolo == ')') {
                if (pilha.estaVazia()) {
                    return false; // Não há parêntese aberto correspondente
                }
                pilha.desempilha(); // Remove o correspondente parêntese aberto
            }
        }

        // Se a pilha estiver vazia, a expressão está balanceada
        return pilha.estaVazia();
    }
}
