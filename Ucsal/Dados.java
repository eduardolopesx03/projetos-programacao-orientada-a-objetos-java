package faculdade;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//Classe Dados
public class Dados {

	//Método para retornar uma lista do tipo Professor
	public List<Professor> obtemProfessor(){

		//Criando a Lista de professores do tipo Professor
		List<Professor> professores = new ArrayList<Professor>();

		//Utilizando tratamento de exceções para caso der algum erro em alguma coisa
		//dentro do bloco "try" o programa continuara e o erro vai ser tratado dentro
		// do bloco "catch". Nesse caso não irá ocorrer erro algum, mas por exemplo caso o
		//índice inexistente de uma lista for colocado na hora de definir o valor de um dos
		//atributos, o programa irá informar que não é possível definir aquele valor
		//no atributo pois o índice é inexistente (presente no catch) e continuara com o
		//funcionamento do programa sem interrupções.
		try {
			//Criando objetos professor (cada um com valores diferentes para os atributos)
			Professor professor1 = new Professor(); //Instanciando o objeto professor
			professor1.setIdentificador(1);
			professor1.setNome("João Silva");
			//Através de outro método chamado de "obtemUnidades" iremos definir o valor para
			//o atributo "unidade", ou seja, temos que ter a relação do método e colocar um
			//"get(0)" (neste caso) que significa que o valor que vai ser definido nesse atri
			//buto vai ser a unidade de índice "0" da lista de unidades.
			professor1.setUnidade(obtemUnidades().get(0));
			professor1.setStatus(true);
			professor1.setDataCadastro(new Date());
			professores.add(professor1); //Adicionando o objeto criado na lista

			Professor professor2 = new Professor();
			professor2.setIdentificador(2);
			professor2.setNome("Maria Santos");
			professor2.setUnidade(obtemUnidades().get(1));
			professor2.setStatus(false);
			professor2.setDataCadastro(new Date());
			professores.add(professor2);

			Professor professor3 = new Professor();
			professor3.setIdentificador(3);
			professor3.setNome("Pedro Oliveira");
			professor3.setUnidade(obtemUnidades().get(2));
			professor3.setStatus(true);
			professor3.setDataCadastro(new Date());
			professores.add(professor3);

			Professor professor4 = new Professor();
			professor4.setIdentificador(4);
			professor4.setNome("Ana Pereira");
			professor4.setUnidade(obtemUnidades().get(3));
			professor4.setStatus(true);
			professor4.setDataCadastro(new Date());
			professores.add(professor4);


			Professor professor5 = new Professor();
			professor5.setIdentificador(5);
			professor5.setNome("Carlos Fernandes");
			professor5.setUnidade(obtemUnidades().get(4));
			professor5.setStatus(false);
			professor5.setDataCadastro(new Date());
			professores.add(professor5);

			Professor professor6 = new Professor();
			professor6.setIdentificador(6);
			professor6.setNome("Sandra Costa");
			professor6.setUnidade(obtemUnidades().get(5));
			professor6.setStatus(true);
			professor6.setDataCadastro(new Date());
			professores.add(professor6);

			return professores;
		}
		catch (IndexOutOfBoundsException exception){
			System.out.println("A posição informada não existe!");
			return null;
		}
	}

	//Método para retornar uma lista do tipo Unidade
	public List<Unidade> obtemUnidades(){

		//Criando a Lista de unidades do tipo Unidade
		List<Unidade> unidades = new ArrayList<Unidade>();

		//Criando objetos unidade (cada um com valores diferentes para os atributos)
		Unidade unidade1 = new Unidade();
		unidade1.setIdentificador(1);
		unidade1.setStatus(true);
		unidade1.setCurso("Engenharia Civil");
		unidade1.setSigla("EC");
		unidade1.setDescricao("Curso de Engenharia");
		unidade1.setDataCadastro(new Date());
		unidades.add(unidade1); //Adicionando o objeto criado na lista

		Unidade unidade2 = new Unidade();
		unidade2.setIdentificador(2);
		unidade2.setStatus(true);
		unidade2.setCurso("Medicina");
		unidade2.setSigla("MED");
		unidade2.setDescricao("Curso de Saúde");
		unidade2.setDataCadastro(new Date());
		unidades.add(unidade2);

		Unidade unidade3 = new Unidade();
		unidade3.setIdentificador(3);
		unidade3.setStatus(true);
		unidade3.setCurso("Administração");
		unidade3.setSigla("ADM");
		unidade3.setDescricao("Curso de Gestão");
		unidade3.setDataCadastro(new Date());
		unidades.add(unidade3);

		Unidade unidade4 = new Unidade();
		unidade4.setIdentificador(4);
		unidade4.setStatus(true);
		unidade4.setCurso("Direito");
		unidade4.setSigla("DIR");
		unidade4.setDescricao("Curso Jurídico");
		unidade4.setDataCadastro(new Date());
		unidades.add(unidade4);

		Unidade unidade5 = new Unidade();
		unidade5.setIdentificador(5);
		unidade5.setStatus(true);
		unidade5.setCurso("Psicologia");
		unidade5.setSigla("PSI");
		unidade5.setDescricao("Curso de Saúde");
		unidade5.setDataCadastro(new Date());
		unidades.add(unidade5);

		Unidade unidade6 = new Unidade();
		unidade6.setIdentificador(6);
		unidade6.setStatus(true);
		unidade6.setCurso("Engenharia de Computação");
		unidade6.setSigla("ECOMP");
		unidade6.setDescricao("Curso de Tecnologia da Informação");
		unidade6.setDataCadastro(new Date());
		unidades.add(unidade6);

		return unidades;
	}

	//Método para retornar uma lista do tipo Laboratorio
	public List<Laboratorio> obtemLaboratorios() {

		//Criando a Lista de laboratorios do tipo Laboratorio
		List<Laboratorio> laboratorios = new ArrayList<>();

		//Criando objetos laboratorio (cada um com valores diferentes para os atributos)
		Laboratorio laboratorio1 = new Laboratorio();
		laboratorio1.setIdentificador(1);
		laboratorio1.setNome("Laboratório de Estruturas");
		laboratorio1.setStatus(true);
		laboratorio1.setDataCadastro(new Date());
		laboratorios.add(laboratorio1); //Adicionando o objeto criado na lista

		Laboratorio laboratorio2 = new Laboratorio();
		laboratorio2.setIdentificador(2);
		laboratorio2.setNome("Laboratório de Anatomia");
		laboratorio2.setStatus(true);
		laboratorio2.setDataCadastro(new Date());
		laboratorios.add(laboratorio2);

		Laboratorio laboratorio3 = new Laboratorio();
		laboratorio3.setIdentificador(3);
		laboratorio3.setNome("Laboratório de Gestão Empresarial");
		laboratorio3.setStatus(true);
		laboratorio3.setDataCadastro(new Date());
		laboratorios.add(laboratorio3);

		Laboratorio laboratorio4 = new Laboratorio();
		laboratorio4.setIdentificador(4);
		laboratorio4.setNome("Laboratório de Prática Jurídica");
		laboratorio4.setStatus(true);
		laboratorio4.setDataCadastro(new Date());
		laboratorios.add(laboratorio4);

		Laboratorio laboratorio5 = new Laboratorio();
		laboratorio5.setIdentificador(5);
		laboratorio5.setNome("Laboratório de Psicologia Experimental");
		laboratorio5.setStatus(true);
		laboratorio5.setDataCadastro(new Date());
		laboratorios.add(laboratorio5);

		Laboratorio laboratorio6 = new Laboratorio();
		laboratorio6.setIdentificador(6);
		laboratorio6.setNome("Laboratório de Redes de Computadores");
		laboratorio6.setStatus(true);
		laboratorio6.setDataCadastro(new Date());
		laboratorios.add(laboratorio6);

		return laboratorios;
	}

	//Método para retornar uma lista de solicitacoes do tipo Solicitacao
	public List<Solicitacao> obtemSolicitacoes() {

		//Utilizando tratamento de exceções para caso der algum erro em alguma coisa
		//dentro do bloco "try" o programa continuara e o erro vai ser tratado dentro
		// do bloco "catch". Nesse caso não irá ocorrer erro algum, mas por exemplo caso o
		//índice inexistente de uma lista for colocado na hora de definir o valor de um dos
		//atributos, o programa irá informar que não é possível definir aquele valor
		//no atributo pois o índice é inexistente (presente no catch) e continuara com o
		//funcionamento do programa sem interrupções.
		try {
			//Criando a Lista de solicitacoes do tipo Solicitacao
			List<Solicitacao> solicitacoes = new ArrayList<>();

			//Criando objetos solicitacao (cada um com valores diferentes para os atributos)
			Solicitacao solicitacao1 = new Solicitacao();
			solicitacao1.setLaboratorio(obtemLaboratorios().get(0));
			solicitacao1.setData(new Date());
			solicitacao1.setProfessor(obtemProfessor().get(0));
			solicitacao1.setCurso("Engenharia Civil");
			solicitacoes.add(solicitacao1); //Adicionando o objeto criado na lista

			Solicitacao solicitacao2 = new Solicitacao();
			solicitacao2.setLaboratorio(obtemLaboratorios().get(2));
			solicitacao2.setData(new Date());
			solicitacao2.setProfessor(obtemProfessor().get(2));
			solicitacao2.setCurso("Administração");
			solicitacoes.add(solicitacao2);

			Solicitacao solicitacao3 = new Solicitacao();
			solicitacao3.setLaboratorio(obtemLaboratorios().get(3));
			solicitacao3.setData(new Date());
			solicitacao3.setProfessor(obtemProfessor().get(3));
			solicitacao3.setCurso("Direito");
			solicitacoes.add(solicitacao3);

			Solicitacao solicitacao4 = new Solicitacao();
			solicitacao4.setLaboratorio(obtemLaboratorios().get(5));
			solicitacao4.setData(new Date());
			solicitacao4.setProfessor(obtemProfessor().get(5));
			solicitacao4.setCurso("Engenharia de Computação");
			solicitacoes.add(solicitacao4);

			return solicitacoes;
		}
		catch (IndexOutOfBoundsException exception) {
			System.out.println("A posição informada não existe!");
			return null;
		}
	}
}