package com.william.estruturadados.vetor.labs;

import java.util.Scanner;

import com.william.estruturadados.vetor.Lista;
import com.william.estruturadados.vetor.teste.Contato;

public class Exercicio06 {

	public static void main(String[] args) {

		// criacao das variaveis
		Scanner scan = new Scanner(System.in);

		// criar vetor com 30 de capacidade
		Lista<Contato> lista = new Lista<Contato>(30);

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
	
	private static void imprimirVetor(Lista<Contato> lista) {
		System.out.println(lista);
	}
	
	private static void limparVetor(Lista<Contato> lista) {
		lista.limpar();
		
		System.out.println("Todos os contatos do vetor foram excluídos");
	}
	
	private static void imprimirTamanhoVetor(Lista<Contato> lista) {
		System.out.println("Tamanho do vetor é de: " + lista.tamanho());
	}
	
	private static void excluirContato(Scanner scan, Lista<Contato> lista) {
		int posicao = lerInformacaoInt("Entre com a posicao a ser removida", scan);

		try {
			Contato contato = lista.busca(posicao);
			
			lista.remover(contato);
			
			System.out.println("Contato excluído");
		} catch (Exception e) {
			System.out.println("Posicao inválida, contato não adicionado");
		}
	}
	
	private static void excluirPorPosicao(Scanner scan, Lista<Contato> lista) {
		int posicao = lerInformacaoInt("Entre com a posicao a ser removida", scan);

		try {
			lista.remover(posicao);
			
			System.out.println("Contato excluído");
		} catch (Exception e) {
			System.out.println("Posicao inválida, contato não adicionado");
		}
	}
	
	private static void pesquisarSeContatoExiste(Scanner scan, Lista<Contato> lista) {
		int posicao = lerInformacaoInt("Entre com a posicao a ser pesquisada", scan);

		try {
			Contato contato = lista.busca(posicao);
			
			boolean existe = lista.contem(contato);
			
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
	
	private static void pesquisarUltimoIndice(Scanner scan, Lista<Contato> lista) {
		int posicao = lerInformacaoInt("Entre com a posicao a ser pesquisada", scan);

		try {
			Contato contato = lista.busca(posicao);

			System.out.println("Contato existe, seguem dados: ");
			System.out.println(contato);

			System.out.println("Fazendo pesquisa do último índice encontrado:");
			posicao = lista.ultimoIndiceDe(contato);

			System.out.println("Contato encontrado na posição " + posicao);
		} catch (Exception e) {
			System.out.println("Posicao inválida");
		}
	}

	private static void obterContato(Scanner scan, Lista<Contato> lista) {
		int posicao = lerInformacaoInt("Entre com a posicao a ser pesquisada", scan);

		try {
			Contato contato = lista.busca(posicao);

			System.out.println("Contato existe, seguem dados: ");
			System.out.println(contato);

			System.out.println("Fazendo pesquisa do contato encontrado:");
			posicao = lista.busca(contato);

			System.out.println("Contato encontrado na posição " + posicao);
		} catch (Exception e) {
			System.out.println("Posicao inválida");
		}
	}

	private static void obterContatoPosicao(Scanner scan, Lista<Contato> lista) {
		int posicao = lerInformacaoInt("Entre com a posicao a ser pesquisada", scan);

		try {
			Contato contato = lista.busca(posicao);

			System.out.println("Contato existe, seguem dados: ");
			System.out.println(contato);

		} catch (Exception e) {
			System.out.println("Posicao inválida");
		}
	}

	private static void adicionarContatoFinal(Scanner scan, Lista<Contato> lista) {
		System.out.println("Criando um contato, entre com as informações:");
		String nome = lerInformacao("Entre com o nome", scan);
		String telefone = lerInformacao("Entre como telefone", scan);
		String email = lerInformacao("Entre com o email", scan);

		Contato contato = new Contato(nome, telefone, email);

		lista.adicionar(contato);

		System.out.println("Contato adicionado com sucesso");
		System.out.println(contato);
	}

	private static void adicionarContatoPosicao(Scanner scan, Lista<Contato> lista) {
		System.out.println("Criando um contato, entre com as informações:");
		String nome = lerInformacao("Entre com o nome", scan);
		String telefone = lerInformacao("Entre como telefone", scan);
		String email = lerInformacao("Entre com o email", scan);

		Contato contato = new Contato(nome, telefone, email);

		int posicao = lerInformacaoInt("Entre com a posicao para adicionar o contato", scan);

		try {
			lista.adicionar(posicao, contato);

			System.out.println("Contato adicionado com sucesso");
			System.out.println(contato);
		} catch (Exception e) {
			System.out.println("Posicao inválida, contato não adicionado");
		}

	}

	private static String lerInformacao(String mensagem, Scanner scan) {
		System.out.println(mensagem);
		String entrada = scan.nextLine();

		return entrada;
	}

	private static int lerInformacaoInt(String mensagem, Scanner scan) {
		boolean entradaValida = false;
		int numero = 0;

		while (!entradaValida) {

			try {
				System.out.println(mensagem);
				numero = Integer.parseInt(scan.nextLine());
				entradaValida = true;
			} catch (Exception e) {
				System.out.println("Entrada inválida, digite novamente");
			}

		}

		return numero;
	}

	private static int obterOpcaoMenu(Scanner scan) {

		boolean entradaValida = false;
		int opcao = 0;
		String entrada;

		while (!entradaValida) {
			System.out.println("Digite a opção desejada:");
			System.out.println("1: Adicionar contato ao final da lista");
			System.out.println("2: Adicionar contato em uma posição específica");
			System.out.println("3: Consultar contato em uma posição específica");
			System.out.println("4: Buscar contato");
			System.out.println("5: Consultar último índice do contato");
			System.out.println("6: Verificar se contato existe");
			System.out.println("7: Remover por posição");
			System.out.println("8: Excluir por posição");
			System.out.println("9: Verificar tamanho da lista de contatos");
			System.out.println("10: Excluir todos contatos");
			System.out.println("11: Imprimir lista de contatos");
			System.out.println("0: Sair");

			try {

				entrada = scan.nextLine();
				opcao = Integer.parseInt(entrada);

				if (opcao >= 0 && opcao <= 11) {
					entradaValida = true;
				} else {
					throw new Exception();
				}

			} catch (Exception e) {
				System.out.println("Entrada inválida, digite novamente");
				System.out.println("\r\n");
			}

		}

		return opcao;
	}

	private static void criarContatosDinamicamente(int quantidade, Lista<Contato> lista) {
		Contato contato;

		for (int i = 1; i <= quantidade; i++) {
			contato = new Contato();
			contato.setNome("Contato " + i);
			contato.setTelefone("0000000" + i);
			contato.setEmail("contato" + i + "@email.com");
			lista.adicionar(contato);
		}

	}

}
