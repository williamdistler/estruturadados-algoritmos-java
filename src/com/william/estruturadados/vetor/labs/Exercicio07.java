package com.william.estruturadados.vetor.labs;

import java.util.ArrayList;
import java.util.Scanner;

import com.william.estruturadados.vetor.teste.Contato;

public class Exercicio07 extends Exercicio06 {

	public static void main(String[] args) {

		// criacao das variaveis
		Scanner scan = new Scanner(System.in);

		// criar vetor com 30 de capacidade
		ArrayList<Contato> lista = new ArrayList<Contato>(30);

		// criar e adicionar 30 contatos
		criarContatosDinamicamente(30, lista);

		// criar um menu para que o usuario escolha a opcao
		int opcao = 1;

		while (opcao != 0) {

			opcao = obterOpcaoMenu(scan);

			switch (opcao) {
			case 1:
				adicionarContatoFinal(scan, lista);
				break;
			case 2:
				adicionarContatoPosicao(scan, lista);
				break;
			case 3:
				obterContatoPosicao(scan, lista);
				break;
			case 4:
				obterContato(scan, lista);
				break;
			case 5:
				pesquisarUltimoIndice(scan, lista);
				break;
			case 6:
				pesquisarSeContatoExiste(scan, lista);
				break;
			case 7:
				excluirPorPosicao(scan, lista);
				break;
			case 8:
				excluirContato(scan, lista);
				break;
			case 9:
				imprimirTamanhoVetor(lista);
				break;
			case 10:
				limparVetor(lista);
				break;
			case 11:
				imprimirVetor(lista);
				break;
			default:
				break;
			}
		}

		System.out.println("Usuário digitou 0, programa encerrado!");

	}
	
	private static void imprimirVetor(ArrayList<Contato> lista) {
		System.out.println(lista);
	}
	
	private static void limparVetor(ArrayList<Contato> lista) {
		lista.clear();
		
		System.out.println("Todos os contatos do vetor foram excluídos");
	}
	
	private static void imprimirTamanhoVetor(ArrayList<Contato> lista) {
		System.out.println("Tamanho do vetor é de: " + lista.size());
	}
	
	private static void excluirContato(Scanner scan, ArrayList<Contato> lista) {
		int posicao = lerInformacaoInt("Entre com a posicao a ser removida", scan);

		try {
			Contato contato = lista.get(posicao);
			
			lista.remove(contato);
			
			System.out.println("Contato excluído");
		} catch (Exception e) {
			System.out.println("Posicao inválida, contato não adicionado");
		}
	}
	
	private static void excluirPorPosicao(Scanner scan, ArrayList<Contato> lista) {
		int posicao = lerInformacaoInt("Entre com a posicao a ser removida", scan);

		try {
			lista.remove(posicao);
			
			System.out.println("Contato excluído");
		} catch (Exception e) {
			System.out.println("Posicao inválida, contato não adicionado");
		}
	}
	
	private static void pesquisarSeContatoExiste(Scanner scan, ArrayList<Contato> lista) {
		int posicao = lerInformacaoInt("Entre com a posicao a ser pesquisada", scan);

		try {
			Contato contato = lista.get(posicao);
			
			boolean existe = lista.contains(contato);
			
			if (existe) {
				System.out.println("Contato existe, seguem dados: ");
				System.out.println(contato);
			} else {
				System.out.println("Contato não existe.");
			}
		} catch (Exception e) {
			System.out.println("Posicao inválida");
		}
	}
	
	private static void pesquisarUltimoIndice(Scanner scan, ArrayList<Contato> lista) {
		int posicao = lerInformacaoInt("Entre com a posicao a ser pesquisada", scan);

		try {
			Contato contato = lista.get(posicao);

			System.out.println("Contato existe, seguem dados: ");
			System.out.println(contato);

			System.out.println("Fazendo pesquisa do último índice encontrado:");
			posicao = lista.lastIndexOf(contato);

			System.out.println("Contato encontrado na posição " + posicao);
		} catch (Exception e) {
			System.out.println("Posicao inválida");
		}
	}

	private static void obterContato(Scanner scan, ArrayList<Contato> lista) {
		int posicao = lerInformacaoInt("Entre com a posicao a ser pesquisada", scan);

		try {
			Contato contato = lista.get(posicao);

			System.out.println("Contato existe, seguem dados: ");
			System.out.println(contato);

			System.out.println("Fazendo pesquisa do contato encontrado:");
			posicao = lista.indexOf(contato);

			System.out.println("Contato encontrado na posição " + posicao);
		} catch (Exception e) {
			System.out.println("Posicao inválida");
		}
	}

	private static void obterContatoPosicao(Scanner scan, ArrayList<Contato> lista) {
		int posicao = lerInformacaoInt("Entre com a posicao a ser pesquisada", scan);

		try {
			Contato contato = lista.get(posicao);

			System.out.println("Contato existe, seguem dados: ");
			System.out.println(contato);

		} catch (Exception e) {
			System.out.println("Posicao inválida");
		}
	}

	private static void adicionarContatoFinal(Scanner scan, ArrayList<Contato> lista) {
		System.out.println("Criando um contato, entre com as informações:");
		String nome = lerInformacao("Entre com o nome", scan);
		String telefone = lerInformacao("Entre como telefone", scan);
		String email = lerInformacao("Entre com o email", scan);

		Contato contato = new Contato(nome, telefone, email);

		lista.add(contato);

		System.out.println("Contato adicionado com sucesso");
		System.out.println(contato);
	}

	private static void adicionarContatoPosicao(Scanner scan, ArrayList<Contato> lista) {
		System.out.println("Criando um contato, entre com as informações:");
		String nome = lerInformacao("Entre com o nome", scan);
		String telefone = lerInformacao("Entre como telefone", scan);
		String email = lerInformacao("Entre com o email", scan);

		Contato contato = new Contato(nome, telefone, email);

		int posicao = lerInformacaoInt("Entre com a posicao para adicionar o contato", scan);

		try {
			lista.add(posicao, contato);

			System.out.println("Contato adicionado com sucesso");
			System.out.println(contato);
		} catch (Exception e) {
			System.out.println("Posicao inválida, contato não adicionado");
		}

	}

	private static void criarContatosDinamicamente(int quantidade, ArrayList<Contato> lista) {
		Contato contato;

		for (int i = 1; i <= quantidade; i++) {
			contato = new Contato();
			contato.setNome("Contato " + i);
			contato.setTelefone("0000000" + i);
			contato.setEmail("contato" + i + "@email.com");
			lista.add(contato);
		}

	}

}
