package com.loiane.estruturadados.pilha.labs;
	
import java.util.Stack;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Stack<Livro> pilhaDeLivros = new Stack<Livro>();
		
		Livro livro = new Livro("01", "Henrique de Ferraz", 2002, "The Book is on The Table");
		Livro livro1 = new Livro("02", "Naielly Menezes", 2010, "The Table is On The Book");
		Livro livro2 = new Livro("04", "Dj Wizard - O Bruxo das Américas", 1995, "Oh Nanana");
		Livro livro3 = new Livro("05", "Mosé Mosé Mosheh", 2007, "Tu se liga hein se liga");
		Livro livro4 = new Livro("06", "Nhaaaaaa", 2020, "Harry Potta");
		Livro livro5 = new Livro("03", "Nhaaaaaa2", 2022, "Harry Potta Nao Pode");
		
		pilhaDeLivros.add(livro);
		pilhaDeLivros.add(livro1);
		pilhaDeLivros.add(livro2);
		pilhaDeLivros.add(livro3);
		pilhaDeLivros.add(livro4);
		pilhaDeLivros.add(livro5);
		
		System.out.println(pilhaDeLivros.peek());
		
		while (!pilhaDeLivros.isEmpty()) {
			Livro l = pilhaDeLivros.pop();
			System.out.println(l.toString());
		}
		
		
	}

}
