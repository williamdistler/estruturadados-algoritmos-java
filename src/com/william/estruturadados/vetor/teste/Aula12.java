package com.william.estruturadados.vetor.teste;

import java.util.ArrayList;

public class Aula12 {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		
		// add é a funcao adicionar criada anteriormente caraio
		arrayList.add("A");
		arrayList.add("C");
		
		System.out.println(arrayList);
		
		arrayList.add(1, "B");
		
		System.out.println(arrayList);
		
		// contains é o finder e é VF booleano
		boolean existe = arrayList.contains("A");
		if (existe) {
			System.out.println("Elemento existe no Array ");
		} else {
			System.out.println("Elemento não existe no Array");
		}
		
		// Procura a posicao de determinado elemento: indexOf
		int pos = arrayList.indexOf("D");
		if (pos > -1) {
			System.out.println("Elemento existe no array " + pos);
		} else {
			System.out.println("Elemento não existe no array " + pos);
		}
		
		// Busca por posicao
		System.out.println(arrayList.get(2));
		
		// posicao ou elemento
		arrayList.remove(0);
		arrayList.remove("B");
		
		System.out.println(arrayList);
		
		// tamanho
		System.out.println(arrayList.size());
		
		System.out.println();

	}

}
