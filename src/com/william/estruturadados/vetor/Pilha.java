package com.william.estruturadados.vetor;

public class Pilha<T> extends EstruturaEstatica<T> {

	private T[] elementos;
	private int tamanho;
	
	public Pilha(int capacidade) {
		super(capacidade);
	}
	
	public Pilha() {
		super();
	}
	
	public int tamanho() {
		return this.tamanho;
	}
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");
		
		for (int i = 0; i < this.tamanho - 1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}
		
		if (this.tamanho > 0) {
			s.append(this.elementos[this.tamanho - 1]);
		}
		
		s.append("]");
		 
		return s.toString(); 
	}
  	
}
