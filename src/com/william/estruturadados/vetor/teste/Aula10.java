package com.william.estruturadados.vetor.teste;

import com.william.estruturadados.vetor.VetorObjetos;

public class Aula10 {

	public static void main(String[] args) {
		VetorObjetos vetor = new VetorObjetos(3);
		
		Contato c1 = new Contato("William Neves", "(11)98750-0056", "william.distler@icloud.com");
		Contato c2 = new Contato("William ", "(11)98750-0056", "william.distler@outlook.com");
		Contato c3 = new Contato("William Distler", "(11)98750-0056", "will.distlerneves@gmail.com");
		
		Contato c4 = new Contato("William Neves", "(11)98750-0056", "william.distler@icloud.com");
		
		vetor.adicionar(c1);
		vetor.adicionar(c2);
		vetor.adicionar(c3);
		

		System.out.println("Tamanho = " + vetor.tamanho());
	
		
		int posicao = vetor.busca(c4);
		if (posicao > -1) {
			System.out.println("Elemento existe no vetor");
		} else {
			System.out.println("Elemento não existe no vetor");
		}
		
		

	}

}
