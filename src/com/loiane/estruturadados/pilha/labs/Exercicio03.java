package com.loiane.estruturadados.pilha.labs;
	
import com.loiane.estruturadados.pilha.Pilha;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Pilha<Livro> pilhaDeLivros = new Pilha<Livro>(6);
		
		Livro livro = new Livro("01", "Henrique de Ferraz", 2002, "The Book is on The Table");
		Livro livro1 = new Livro("02", "Naielly Menezes", 2010, "The Table is On The Book");
		Livro livro2 = new Livro("04", "Dj Wizard - O Bruxo das Américas", 1995, "Oh Nanana");
		Livro livro3 = new Livro("05", "Mosé Mosé Mosheh", 2007, "Tu se liga hein se liga");
		Livro livro4 = new Livro("06", "Nhaaaaaa", 2020, "Harry Potta");
		Livro livro5 = new Livro("03", "Nhaaaaaa2", 2022, "Harry Potta Nao Pode");
		
		pilhaDeLivros.empilha(livro);
		pilhaDeLivros.empilha(livro1);
		pilhaDeLivros.empilha(livro2);
		pilhaDeLivros.empilha(livro3);
		pilhaDeLivros.empilha(livro4);
		pilhaDeLivros.empilha(livro5);
		
		System.out.println(pilhaDeLivros.topo());
		
		while (!pilhaDeLivros.estaVazia()) {
			Livro l = pilhaDeLivros.desempilha();
			System.out.println(l.toString());
		}
		
		
	}

}
