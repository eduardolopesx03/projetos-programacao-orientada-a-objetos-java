package ong;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//Classe Dados
public class Dados {
	
	//Método para retornar uma lista do tipo Animal
	public List<Animal> obterAnimais() {
		
		//Criando a Lista de animais do tipo Animal
		List<Animal> listaAnimais = new ArrayList<Animal>();
		
		//Criando objetos animal (cada um com valores diferentes para os atributos)
		Animal animal1 = new Animal(); //Instanciando o objeto animal		 
		animal1.setNome("Max");
		animal1.setIdade(3);
		animal1.setEspecie("Cachorro");
		listaAnimais.add(animal1); //Adicionando o objeto criado na lista

		Animal animal2 = new Animal();	
		animal2.setNome("Luna");
		animal2.setIdade(5);
		animal2.setEspecie("Gato");
		listaAnimais.add(animal2);

		Animal animal3 = new Animal();
		animal3.setNome("Rocky");
		animal3.setIdade(2);
		animal3.setEspecie("Cachorro");
		listaAnimais.add(animal3);

		Animal animal4 = new Animal();
		animal4.setNome("Nala");
		animal4.setIdade(4);
		animal4.setEspecie("Gato");
		listaAnimais.add(animal4);

		Animal animal5 = new Animal();
		animal5.setNome("Charlie");
		animal5.setIdade(1);
		animal5.setEspecie("Coelho");
		listaAnimais.add(animal5);

		Animal animal6 = new Animal();
		animal6.setNome("Bella");
		animal6.setIdade(6);
		animal6.setEspecie("Cachorro");
		listaAnimais.add(animal6);
		
		
		return listaAnimais;
	}
	
	//Método para retornar uma lista do tipo Cliente
	public List<Cliente> obterClientes() {
		
		//Criando a Lista de clientes do tipo Cliente
		List<Cliente> listaClientes = new ArrayList<Cliente>();
		
		//Criando objetos cliente (cada um com valores diferentes para os atributos)
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Maria Santos");
		cliente1.setIdade(30);
		cliente1.setCpf("111.222.333-44");
		cliente1.setDoacaoMensal(100.00);
		cliente1.setPossuiCadastro(true);
		listaClientes.add(cliente1); //Adicionando o objeto criado na lista
		
		Cliente cliente2 = new Cliente();
		cliente2.setNome("João Silva");
		cliente2.setIdade(45);
		cliente2.setCpf("555.666.777-88");
		cliente2.setDoacaoMensal(200.00);
		cliente2.setPossuiCadastro(true);
		listaClientes.add(cliente2);
		
		Cliente cliente3 = new Cliente();
		cliente3.setNome("Ana Oliveira");
		cliente3.setIdade(28);
		cliente3.setCpf("999.888.777-66");
		cliente3.setDoacaoMensal(50.00);
		cliente3.setPossuiCadastro(false);
		listaClientes.add(cliente3);
		
		Cliente cliente4 = new Cliente();
		cliente4.setNome("Pedro Sousa");
		cliente4.setIdade(35);
		cliente4.setCpf("222.333.444-55");
		cliente4.setDoacaoMensal(150.00);
		cliente4.setPossuiCadastro(true);
		listaClientes.add(cliente4);
		
		Cliente cliente5 = new Cliente();
		cliente5.setNome("Laura Costa");
		cliente5.setIdade(42);
		cliente5.setCpf("777.888.999-00");
		cliente5.setDoacaoMensal(75.00);
		cliente5.setPossuiCadastro(false);
		listaClientes.add(cliente5);
		
		Cliente cliente6 = new Cliente();
		cliente6.setNome("Carlos Almeida");
		cliente6.setIdade(39);
		cliente6.setCpf("444.555.666-77");
		cliente6.setDoacaoMensal(120.00);
		cliente6.setPossuiCadastro(true);
		listaClientes.add(cliente6);
		
		
		return listaClientes;
	}
	
	//Método para retornar uma lista do tipo Colaborador
	public List<Colaborador> obterColaboradores(){
		
		//Criando a Lista de colaboradores do tipo Colaborador
		List<Colaborador> listaColaboradores = new ArrayList<Colaborador>();
		
		//Criando objetos colaborador (cada um com valores diferentes para os atributos)
		Colaborador colaborador1 = new Colaborador();
		colaborador1.setNome("Ana Silva");
		colaborador1.setIdade(28);
		colaborador1.setCpf("111.222.333-44");
		colaborador1.setCargo("Coordenadora");
		colaborador1.setAreaAtuacao("Programas Sociais");
		listaColaboradores.add(colaborador1); //Adicionando o objeto criado na lista
		
		Colaborador colaborador2 = new Colaborador();
		colaborador2.setNome("Pedro Santos");
		colaborador2.setIdade(35);
		colaborador2.setCpf("555.666.777-88");
		colaborador2.setCargo("Analista Financeiro");
		colaborador2.setAreaAtuacao("Área de Atuação: Finanças");
		listaColaboradores.add(colaborador2);
		
		Colaborador colaborador3 = new Colaborador();
		colaborador3.setNome("Marina Oliveira");
		colaborador3.setIdade(42);
		colaborador3.setCpf("999.888.777-66");
		colaborador3.setCargo("Assistente de Comunicação");
		colaborador3.setAreaAtuacao("Comunicação e Marketing");
		listaColaboradores.add(colaborador3);
		
		Colaborador colaborador4 = new Colaborador();
		colaborador4.setNome("Lucas Souza");
		colaborador4.setIdade(29);
		colaborador4.setCpf("222.333.444-55");
		colaborador4.setCargo("Técnico Ambiental");
		colaborador4.setAreaAtuacao("Meio Ambiente");
		listaColaboradores.add(colaborador4);
		
		Colaborador colaborador5 = new Colaborador();
		colaborador5.setNome("Fernanda Costa");
		colaborador5.setIdade(31);
		colaborador5.setCpf("777.888.999-00");
		colaborador5.setCargo("Educadora Social");
		colaborador5.setAreaAtuacao("Educação");
		listaColaboradores.add(colaborador5);
		
		Colaborador colaborador6 = new Colaborador();
		colaborador6.setNome("Ricardo Almeida");
		colaborador6.setIdade(37);
		colaborador6.setCpf("444.555.666-77");
		colaborador6.setCargo("Coordenador de Projetos");
		colaborador6.setAreaAtuacao("Desenvolvimento Social");
		listaColaboradores.add(colaborador6);
		
		
		return listaColaboradores;
	}
	
	//Método para retornar um objeto Ong do tipo Ong
	public Ong obterOng() {
		
		//Criando o objeto ong do tipo Ong
		Ong ong = new Ong();
		ong.setNome("Amigos dos Animais");
		ong.setEndereco("Rua das Patinhas, 123, Cidade dos Bichinhos");
		ong.setNumeroColaboradores(6);
		ong.setOrcamentoAnual(200.525);
		
		
		return ong;
	}
	
	//Método para retornar uma lista do tipo Doacao
	public List<Doacao> obterDoacoes() {
		
		//Utilizando tratamento de exceções para caso der algum erro em alguma coisa
		//dentro do bloco "try" o programa continuara e o erro vai ser tratado dentro
		// do bloco "catch". Nesse caso não irá ocorrer erro algum, mas por exemplo caso o
		//índice inexistente de uma lista for colocado na hora de definir o valor de um dos
		//atributos, o programa irá informar que não é possível definir aquele valor
		//no atributo pois o índice é inexistente (presente no catch) e continuara com o
		//funcionamento do programa sem interrupções.
		try {
			//Criando a Lista de doacoes do tipo Doacao
			List<Doacao> listaDoacoes = new ArrayList<Doacao>();
			
			//Criando objetos doacao (cada um com valores diferentes para os atributos)
			Doacao doacao1 = new Doacao();
			doacao1.setCliente(obterClientes().get(0));
			//Através de outro método chamado de "obterColaboradores" iremos definir o valor para
			//o atributo "colaborador", ou seja, temos que ter a relação do método e colocar um
			//"get(0)" (neste caso) que significa que o valor que vai ser definido nesse atri
			//buto vai ser a unidade de índice "0" da lista de colaboradores.
			doacao1.setColaborador(obterColaboradores().get(0));
			doacao1.setOng(obterOng().getNome());
			doacao1.setAnimal(obterAnimais().get(0));
			doacao1.setData(new Date());
			listaDoacoes.add(doacao1); //Adicionando o objeto criado na lista
			
			Doacao doacao2 = new Doacao();
			doacao2.setCliente(obterClientes().get(1));
			doacao2.setColaborador(obterColaboradores().get(1));
			doacao2.setOng(obterOng().getNome());
			doacao2.setAnimal(obterAnimais().get(1));
			doacao2.setData(new Date());
			listaDoacoes.add(doacao2);
			
			Doacao doacao3 = new Doacao();
			doacao3.setCliente(obterClientes().get(3));
			doacao3.setColaborador(obterColaboradores().get(2));
			doacao3.setOng(obterOng().getNome());
			doacao3.setAnimal(obterAnimais().get(2));
			doacao3.setData(new Date());
			listaDoacoes.add(doacao3);
			
			Doacao doacao4 = new Doacao();
			doacao4.setCliente(obterClientes().get(5));
			doacao4.setColaborador(obterColaboradores().get(3));
			doacao4.setOng(obterOng().getNome());
			doacao4.setAnimal(obterAnimais().get(3));
			doacao4.setData(new Date());
			listaDoacoes.add(doacao4);
			
			
			return listaDoacoes;
		}
		catch (IndexOutOfBoundsException exception) {
			System.out.println("A posição informada não existe!");
			return null;
		}
	}
}