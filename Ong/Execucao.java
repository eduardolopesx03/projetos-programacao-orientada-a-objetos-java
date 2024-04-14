package ong;

//Classe Execucao
public class Execucao {
	
	public static void main(String[] args) {
		
		//Criando o objeto imprimir que vem de uma instancia da classe Impressao
		Impressao imprimir = new Impressao();
		
		//Chamando o método de impressão para imprimir a lista de animais
		System.out.println("Todos os Animais Cadastrados");
		imprimir.imprimirListaAnimais();
		
		System.out.println();
		
		//Chamando o método de impressão para imprimir a lista de clientes
		System.out.println("Todos os Clientes Cadastrados");
		imprimir.imprimirListaClientes();
		
		System.out.println();
		
		//Chamando o método de impressão para imprimir a lista de colaboradores
		System.out.println("Todos os Colaboradores da ONG");
		imprimir.imprimirListaColaboradores();
		
		System.out.println();
		
		//Chamando o método de impressão para imprimir a ong
		System.out.println("Identificação da ONG");
		imprimir.imprimirIdentificacaoOng();
		
		System.out.println();
		
		//Chamando o método de impressão para imprimir a lista de de doações
		System.out.println("Todos as Doacões (Histórico) - Obs: as doações só podem ser feitas pelos clientes que tem cadastro na ONG");
		imprimir.imprimirListaDoacoes();
		
	}

}
