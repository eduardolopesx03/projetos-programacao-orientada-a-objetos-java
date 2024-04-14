package ong;

import java.util.List;

//Classe Impressao
public class Impressao {
	
	//Métodos de impressão para imprimir a lista de animais
	public void imprimirListaAnimais() {
		Dados animaisCadastrados = new Dados();

		List<Animal> listaAnimaisCadastrados = animaisCadastrados.obterAnimais();

		for (Animal animais : listaAnimaisCadastrados) {
			System.out.println(animais + "\n");
		}
	}
	
	
	//Métodos de impressão para imprimir a lista de clientes
	public void imprimirListaClientes() {
		Dados clientesCadastrados = new Dados();

		List<Cliente> listaClientesCadastrados = clientesCadastrados.obterClientes();

		for (Cliente clientes : listaClientesCadastrados) {
			System.out.println(clientes + "\n");
		}
	}
	
	
	//Métodos de impressão para imprimir a lista de colaboradores
	public void imprimirListaColaboradores() {
		Dados colaboradores = new Dados();

		List<Colaborador> listaColaboradores = colaboradores.obterColaboradores();

		for (Colaborador todosColaboradores : listaColaboradores) {
			System.out.println(todosColaboradores + "\n");
		}
	}
	
	//Método de impressão para imprimir o objeto ong
	public void imprimirIdentificacaoOng() {
		Dados ong = new Dados();
		
		System.out.println(ong.obterOng() + "\n");
	}
	
	
	//Métodos de impressão para imprimir a lista de doações
	public void imprimirListaDoacoes() {
		try {
			Dados doacao = new Dados();

			List<Doacao> listaDoacoes = doacao.obterDoacoes();

			for (Doacao doacoes : listaDoacoes) {
				System.out.println(doacoes);
			}
		}
		catch (NullPointerException exception) {
			System.out.println("Não é possível imprimir uma lista vazia!");
		}
	}
}
