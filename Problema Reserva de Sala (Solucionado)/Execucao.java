package faculdade;

import java.util.List;

//Classe Execucao, vai ser a classe com métodos que iremos executar e imprimir o que
//é solicitado.
public class Execucao {

	public static void main(String[] args) {
		System.out.println("Lista com todos os professores cadastrados");
		imprimirListaProfessores();

		System.out.println();

		System.out.println("Lista com todos os laboratórios cadastrados");
		imprimirListaLaboratorios();

		System.out.println();

		System.out.println("Lista com todas as solicitações feitas pelos professores para os respectivos laboratórios");
		printarListaDeSolicitacoes();

		System.out.println();

		System.out.println("Lista com todas as unidades com seus respectivos cursos associados");
		imprimirListaUnidades();

	}

	//Método para imprimir a lista de professores
	public static void imprimirListaProfessores() {
		
		//Utilizando tratamento de exceções para caso der algum erro em alguma coisa
		//dentro do bloco "try" o programa continuara e o erro vai ser tratado dentro
		//do bloco "catch". Nesse caso não ira ocorrer erro algum, mas caso um índice
		//inexistente da lista seja colocado na hora de definir o valor de um atributo,
		//o programa irá informar que não é possível fazer essa aplicação e continuará
		//(presente na classe Dados), e nesse caso se der erro lá na classe Dados não
		//vai ser possível imprimir a lista.
		try {
			Dados dados = new Dados();

			List<Professor> listaProfessores = dados.obtemProfessor();

			for (Professor professor : listaProfessores) {
				System.out.println(professor + "\n");
			}
		}
		catch (NullPointerException exception) {
			System.out.println("Nesse método não é possível imprimir uma lista vazia!");
		}
	}

	//Método para imprimir a lista de laboratórios
	public static void imprimirListaLaboratorios() {
		Dados dados = new Dados();

		List<Laboratorio> listaLaboratorios = dados.obtemLaboratorios();

		for (Laboratorio laboratorio : listaLaboratorios) {
			System.out.println(laboratorio + "\n");
		}
	}

	//Método para imprimir a lsita de solicitações
	public static void printarListaDeSolicitacoes() {
		
		//Utilizando tratamento de exceções para caso der algum erro em alguma coisa
		//dentro do bloco "try" o programa continuara e o erro vai ser tratado dentro
		//do bloco "catch". Nesse caso não ira ocorrer erro algum, mas caso um índice
		//inexistente da lista seja colocado na hora de definir o valor de um atributo,
		//o programa irá informar que não é possível fazer essa aplicação e continuará
		//(presente na classe Dados), e nesse caso se der erro lá na classe Dados não
		//vai ser possível imprimir a lista.
		try {
			Dados dados = new Dados();

			List<Solicitacao> listaSolicitacoes = dados.obtemSolicitacoes();

			for (Solicitacao solicitacao : listaSolicitacoes) {
				System.out.println(solicitacao + "\n");
			}
		}
		catch (NullPointerException exception){
			System.out.println("Nesse método não é possível imprimir uma lista vazia!");
		}
	}

	//Método para imprimir a lista de unidades
	public static void imprimirListaUnidades() {
		Dados dados = new Dados();

		List<Unidade> listaUnidades = dados.obtemUnidades();

		for (Unidade unidade : listaUnidades) {
			System.out.println(unidade + "\n");
		}
	}
}


