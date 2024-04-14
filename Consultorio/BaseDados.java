package consultorio;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

//Classe BaseDados
public class BaseDados {

	//Método para retornar uma lista (Coleções) do tipo Paciente
	public List<Paciente> cadastroDePacientes() {
		
		//Tratamento de Erros
		//Utilizando tratamento de exceções para caso der algum erro em alguma coisa
		//dentro do bloco "try" o programa continuara e o erro vai ser tratado dentro
		//do bloco "catch". Nesse caso não irá ocorrer erro algum, mas por exemplo caso o
		//índice inexistente de uma lista for colocado na hora de definir o valor de um dos
		//atributos, o programa irá informar que não é possível definir aquele valor
		//no atributo pois o índice é inexistente (presente no catch) e continuara com o
		//funcionamento do programa sem interrupções (funcionando da mesma forma pra os próximos tratamento).
		try {
			//Criando a Lista de pacientes do tipo Paciente (Coleções)
			List<Paciente> listaPacientes = new ArrayList<Paciente>();
			
			//Criando objetos paciente (cada um com valores diferentes para os atributos)
			Paciente paciente1 = new Paciente(); //Instanciando o objeto paciente
			paciente1.setIdentificador(1);
			paciente1.setNome("João da Silva");
			paciente1.setContato("+55 123456789");
			paciente1.setDataDoCadastro(LocalDateTime.now());
			paciente1.setSituacao(true);
			paciente1.setEndereco(cadastroEnderecos().get(0)); //Relação com a lista de enderecos
			listaPacientes.add(paciente1); //Adicionando o objeto criado na lista (Coleções)

			Paciente paciente2 = new Paciente();
			paciente2.setIdentificador(2);
			paciente2.setNome("Maria Souza");
			paciente2.setContato("+55 987654321");
			paciente2.setDataDoCadastro(LocalDateTime.now());
			paciente2.setSituacao(true);
			paciente2.setEndereco(cadastroEnderecos().get(1));
			listaPacientes.add(paciente2);

			Paciente paciente3 = new Paciente();
			paciente3.setIdentificador(3);
			paciente3.setNome("Carlos Ferreira");
			paciente3.setContato("+55 555555555");
			paciente3.setDataDoCadastro(LocalDateTime.now());
			paciente3.setSituacao(true);
			paciente3.setEndereco(cadastroEnderecos().get(2));
			listaPacientes.add(paciente3);

			Paciente paciente4 = new Paciente();
			paciente4.setIdentificador(4);
			paciente4.setNome("Ana Santos");
			paciente4.setContato("+55 999999999");
			paciente4.setDataDoCadastro(LocalDateTime.now());
			paciente4.setSituacao(true);
			paciente4.setEndereco(cadastroEnderecos().get(3));
			listaPacientes.add(paciente4);

			Paciente paciente5 = new Paciente();
			paciente5.setIdentificador(5);
			paciente5.setNome("Rafaela Oliveira");
			paciente5.setContato("+55 111111111");
			paciente5.setDataDoCadastro(LocalDateTime.now());
			paciente5.setSituacao(false);
			paciente5.setEndereco(cadastroEnderecos().get(4));
			listaPacientes.add(paciente5);

			Paciente paciente6 = new Paciente();
			paciente6.setIdentificador(6);
			paciente6.setNome("Lucas Mendes");
			paciente6.setContato("+55 222222222");
			paciente6.setDataDoCadastro(LocalDateTime.now());
			paciente6.setSituacao(false);
			paciente6.setEndereco(cadastroEnderecos().get(5));
			listaPacientes.add(paciente6);
			
			
			
			return listaPacientes; //Retornando a lista (Coleções) completa de pacientes
		}
		catch (IndexOutOfBoundsException exception) {
			System.out.println("A posição informada não existe!");
			return null;
		}
	}
	
	//Método para retornar uma lista (Coleções) do tipo Endereco
	public List<Endereco> cadastroEnderecos() {
		
		//Criando a Lista de enderecos do tipo Endereco (Coleções)
		List<Endereco> listaEnderecos = new ArrayList<Endereco>();
		
		//Criando objetos endereco (cada um com valores diferentes para os atributos)
		Endereco endereco1 = new Endereco(); //Instanciando o objeto endereco
		endereco1.setRua("Rua dos Flores");
		endereco1.setBairro("Centro");
		endereco1.setCidade("São Paulo");
		endereco1.setEstado("São Paulo");
		endereco1.setCep("01234-567");
		listaEnderecos.add(endereco1); //Adicionando o objeto criado na lista (Coleções)

		Endereco endereco2 = new Endereco();
		endereco2.setRua("Avenida das Palmeiras");
		endereco2.setBairro("Jardim Botânico");
		endereco2.setCidade("Rio de Janeiro");
		endereco2.setEstado("Rio de Janeiro");
		endereco2.setCep("21000-123");
		listaEnderecos.add(endereco2);

		Endereco endereco3 = new Endereco();
		endereco3.setRua("Travessa das Oliveiras");
		endereco3.setBairro("Vila Bela");
		endereco3.setCidade("Belo Horizonte");
		endereco3.setEstado("Minas Gerais");
		endereco3.setCep("30123-456");
		listaEnderecos.add(endereco3);

		Endereco endereco4 = new Endereco();
		endereco4.setRua("Rua dos Lírios");
		endereco4.setBairro("Jardim das Flores");
		endereco4.setCidade("Porto Alegre");
		endereco4.setEstado("Rio Grande do Sul");
		endereco4.setCep("90876-543");
		listaEnderecos.add(endereco4);

		Endereco endereco5 = new Endereco();
		endereco5.setRua("Alameda das Acácias");
		endereco5.setBairro("Setor Central");
		endereco5.setCidade("Goiânia");
		endereco5.setEstado("Goiás");
		endereco5.setCep("74000-789");
		listaEnderecos.add(endereco5);

		Endereco endereco6 = new Endereco();
		endereco6.setRua("Avenida dos Ipês");
		endereco6.setBairro("Jardim América");
		endereco6.setCidade("Brasília");
		endereco6.setEstado("Distrito Federal");
		endereco6.setCep("70000-012");
		listaEnderecos.add(endereco6);
		
		
		
		return listaEnderecos; //Retornando a lista (Coleções) completa de enderecos
	}
	
	//Método para retornar uma lista (Coleções) do tipo ProfissionalSaude
	public List<ProfissionalSaude> cadastroDoProfissionalDeSaude() {
		
		//Tratamento de Erros
		try {
			//Criando a Lista de ProfissionaisSaude do tipo ProfissionalSaude (Coleções)
			List<ProfissionalSaude> listaProfissionaisSaude = new ArrayList<ProfissionalSaude>();
			
			//Criando objetos ProfissionalSaude (cada um com valores diferentes para os atributos)
			ProfissionalSaude profissionalSaude1 = new ProfissionalSaude(); //Instanciando o objeto profissionalSaude
			profissionalSaude1.setIdentificador(1);
			profissionalSaude1.setNome("Roberto Silva");
			profissionalSaude1.setTipo("Médico");
			profissionalSaude1.setListaDeEspecialidades(especialidadesDoProfissionalDeSaude().get(0) + " e " + especialidadesDoProfissionalDeSaude().get(1)); //Relação com a lista de especialidades
			profissionalSaude1.setDataDoCadastro(LocalDateTime.now());
			profissionalSaude1.setSituacao(true);
			listaProfissionaisSaude.add(profissionalSaude1); //Adicionando o objeto criado na lista (Coleções)

			ProfissionalSaude profissionalSaude2 = new ProfissionalSaude();
			profissionalSaude2.setIdentificador(2);
			profissionalSaude2.setNome("Ana Rodrigues");
			profissionalSaude2.setTipo("Fonoaudióloga");
			profissionalSaude2.setListaDeEspecialidades(especialidadesDoProfissionalDeSaude().get(2) + " e " + especialidadesDoProfissionalDeSaude().get(3));
			profissionalSaude2.setDataDoCadastro(LocalDateTime.now());
			profissionalSaude2.setSituacao(true);
			listaProfissionaisSaude.add(profissionalSaude2);

			ProfissionalSaude profissionalSaude3 = new ProfissionalSaude();
			profissionalSaude3.setIdentificador(3);
			profissionalSaude3.setNome("Carlos Santos");
			profissionalSaude3.setTipo("Enfermeiro");
			profissionalSaude3.setListaDeEspecialidades(especialidadesDoProfissionalDeSaude().get(4) + " e " + especialidadesDoProfissionalDeSaude().get(5));
			profissionalSaude3.setDataDoCadastro(LocalDateTime.now());
			profissionalSaude3.setSituacao(true);
			listaProfissionaisSaude.add(profissionalSaude3);

			ProfissionalSaude profissionalSaude4 = new ProfissionalSaude();
			profissionalSaude4.setIdentificador(4);
			profissionalSaude4.setNome("Marina Lima");
			profissionalSaude4.setTipo("Psicóloga");
			profissionalSaude4.setListaDeEspecialidades(especialidadesDoProfissionalDeSaude().get(6) + " e " + especialidadesDoProfissionalDeSaude().get(7));
			profissionalSaude4.setDataDoCadastro(LocalDateTime.now());
			profissionalSaude4.setSituacao(true);
			listaProfissionaisSaude.add(profissionalSaude4);

			ProfissionalSaude profissionalSaude5 = new ProfissionalSaude();
			profissionalSaude5.setIdentificador(5);
			profissionalSaude5.setNome("Sofia Mendes");
			profissionalSaude5.setTipo("Médica");
			profissionalSaude5.setListaDeEspecialidades(especialidadesDoProfissionalDeSaude().get(8) + " e " + especialidadesDoProfissionalDeSaude().get(9));
			profissionalSaude5.setDataDoCadastro(LocalDateTime.now());
			profissionalSaude5.setSituacao(false);
			listaProfissionaisSaude.add(profissionalSaude5);

			ProfissionalSaude profissionalSaude6 = new ProfissionalSaude();
			profissionalSaude6.setIdentificador(6);
			profissionalSaude6.setNome("Laura Ferreira");
			profissionalSaude6.setTipo("Enfermeira");
			profissionalSaude6.setListaDeEspecialidades(especialidadesDoProfissionalDeSaude().get(10) + " e " + especialidadesDoProfissionalDeSaude().get(11));
			profissionalSaude6.setDataDoCadastro(LocalDateTime.now());
			profissionalSaude6.setSituacao(false);
			listaProfissionaisSaude.add(profissionalSaude6);
			
			
			
			return listaProfissionaisSaude; //Retornando a lista (Coleções) completa de ProfissionaisSaude
		}
		catch (IndexOutOfBoundsException exception) {
			System.out.println("A posição informada não existe!");
			return null;
		}
	}
	
	//Método para retornar uma lista (Coleções) do tipo String
	public List<String> especialidadesDoProfissionalDeSaude() {
		
		//Criando a Lista de EspecialidadesDosProfissionaisDeSaude do tipo String (Coleções)
		List<String> listaEspecialidadesDosProfissionaisDeSaude = new ArrayList<>();

		listaEspecialidadesDosProfissionaisDeSaude.add("Cardiologia"); //Adicionando a String na lista (Coleções)
		listaEspecialidadesDosProfissionaisDeSaude.add("Clínica Geral");

		listaEspecialidadesDosProfissionaisDeSaude.add("Linguagem");
		listaEspecialidadesDosProfissionaisDeSaude.add("Audiologia");

		listaEspecialidadesDosProfissionaisDeSaude.add("Cuidados Intensivos");
		listaEspecialidadesDosProfissionaisDeSaude.add("Pediatria");

		listaEspecialidadesDosProfissionaisDeSaude.add("Terapia Cognitivo-Comportamental");
		listaEspecialidadesDosProfissionaisDeSaude.add("Psicologia Infantil");

		listaEspecialidadesDosProfissionaisDeSaude.add("Dermatologia");
		listaEspecialidadesDosProfissionaisDeSaude.add("Alergologia");

		listaEspecialidadesDosProfissionaisDeSaude.add("Cuidados Domiciliares");
		listaEspecialidadesDosProfissionaisDeSaude.add("Saúde da Mulher");
		
		
		
		return listaEspecialidadesDosProfissionaisDeSaude; //Retornando a lista (Coleções) completa de EspecialidadesDosProfissionaisDeSaude
	}
	
	//Método para retornar uma lista (Coleções) do tipo Exame
	public List<Exame> cadastroDeExames() {
		
		//Tratamento de Erros
		try {
			//Criando a Lista de exames do tipo Exame (Coleções)
			List<Exame> listaExames = new ArrayList<Exame>();
			
			//Criando objetos exame (cada um com valores diferentes para os atributos)
			Exame exame1 = new Exame(); //Instanciando o objeto exame
			exame1.setIdentificador(1);
			exame1.setNomeExame(examesSolicitados().get(0));
			exame1.setDescricaoExame("Análise dos componentes sanguíneos");
			exame1.setObservacao("Jejum de 8 horas antes do exame");
			exame1.setCategoria("Hematologia");
			exame1.setDataDoCadastro(LocalDateTime.now());
			exame1.setSituacao(true);
			listaExames.add(exame1); //Adicionando o objeto criado na lista (Coleções)

			Exame exame2 = new Exame();
			exame2.setIdentificador(2);
			exame2.setNomeExame(examesSolicitados().get(1));
			exame2.setDescricaoExame("Medição dos níveis de glicose no sangue em jejum");
			exame2.setObservacao( "Jejum de 8 horas antes do exame");
			exame2.setCategoria("Bioquímica");
			exame2.setDataDoCadastro(LocalDateTime.now());
			exame2.setSituacao(true);
			listaExames.add(exame2);

			Exame exame3 = new Exame();
			exame3.setIdentificador(3);
			exame3.setNomeExame(examesSolicitados().get(2));
			exame3.setDescricaoExame("Identificação de parasitas no material fecal");
			exame3.setObservacao("Coletar amostra em recipiente estéril");
			exame3.setCategoria("Parasitologia");
			exame3.setDataDoCadastro(LocalDateTime.now());
			exame3.setSituacao(true);
			listaExames.add(exame3);

			Exame exame4 = new Exame();
			exame4.setIdentificador(4);
			exame4.setNomeExame(examesSolicitados().get(3));
			exame4.setDescricaoExame("Quantificação de anticorpos específicos no sangue");
			exame4.setObservacao("Necessário agendamento prévio");
			exame4.setCategoria("Imunologia");
			exame4.setDataDoCadastro(LocalDateTime.now());
			exame4.setSituacao(true);
			listaExames.add(exame4);

			Exame exame5 = new Exame();
			exame5.setIdentificador(5);
			exame5.setNomeExame(examesSolicitados().get(4));
			exame5.setDescricaoExame("Obtenção de imagem do tórax por raios-X");
			exame5.setObservacao("Não é necessário jejum");
			exame5.setCategoria("Imagem");
			exame5.setDataDoCadastro(LocalDateTime.now());
			exame5.setSituacao(false);
			listaExames.add(exame5);

			Exame exame6 = new Exame();
			exame6.setIdentificador(6);
			exame6.setNomeExame(examesSolicitados().get(5));
			exame6.setDescricaoExame("Detecção de hormônio hCG para confirmar gravidez");
			exame6.setObservacao("Realizar o exame com a primeira urina do dia");
			exame6.setCategoria("Bioquímica");
			exame6.setDataDoCadastro(LocalDateTime.now());
			exame6.setSituacao(false);
			listaExames.add(exame6);
			
			
			
			return listaExames; //Retornando a lista (Coleções) completa de exames
		}
		catch(IndexOutOfBoundsException exception) {
			System.out.println("A posição informada não existe!");
			return null;
		}
	}
	
	//Método para retornar uma lista (Coleções) do tipo Agendamento
	public List<Agendamento> agendamentosDosPacientes() {
		
		//Tratamento de Erros
		try {
			//Criando a Lista de agendamentos do tipo Agendamento (Coleções)
			List<Agendamento> listaAgendamentos = new ArrayList<Agendamento>();
			
			//Criando objetos agendamento (cada um com valores diferentes para os atributos)
			Agendamento agendamento1 = new Agendamento(); //Instanciando o objeto agendamento
			agendamento1.setIdentificador(1);
			agendamento1.setPaciente(cadastroDePacientes().get(0)); //Relação com a lista de pacientes
			agendamento1.setEspecialidade("Cardiologia");
			agendamento1.setProfissionalSaude(cadastroDoProfissionalDeSaude().get(0)); //Relação com a lista de ProfissionalDeSaude
			agendamento1.setConvenioParticular("Convênio");
			agendamento1.setDataDoAtendimento(LocalDateTime.now());
			agendamento1.setTipoAtendimento("Consulta");
			agendamento1.setLocal("Hospital ABC");
			agendamento1.setSituacao(true);
			listaAgendamentos.add(agendamento1); //Adicionando o objeto criado na lista (Coleções)

			Agendamento agendamento2 = new Agendamento();
			agendamento2.setIdentificador(2);
			agendamento2.setPaciente(cadastroDePacientes().get(1));
			agendamento2.setEspecialidade("Dermatologia");
			agendamento2.setProfissionalSaude(cadastroDoProfissionalDeSaude().get(1));
			agendamento2.setConvenioParticular("Particular");
			agendamento2.setDataDoAtendimento(LocalDateTime.now());
			agendamento2.setTipoAtendimento("Consulta");
			agendamento2.setLocal("Clínica XYZ");
			agendamento2.setSituacao(true);
			listaAgendamentos.add(agendamento2);

			Agendamento agendamento3 = new Agendamento();
			agendamento3.setIdentificador(3);
			agendamento3.setPaciente(cadastroDePacientes().get(2));
			agendamento3.setEspecialidade("Ortopedia");
			agendamento3.setProfissionalSaude(cadastroDoProfissionalDeSaude().get(2));
			agendamento3.setConvenioParticular("Convênio");
			agendamento3.setDataDoAtendimento(LocalDateTime.now());
			agendamento3.setTipoAtendimento("Emergencial");
			agendamento3.setLocal("Pronto Socorro Central");
			agendamento3.setSituacao(true);
			listaAgendamentos.add(agendamento3);

			Agendamento agendamento4 = new Agendamento();
			agendamento4.setIdentificador(4);
			agendamento4.setPaciente(cadastroDePacientes().get(3));
			agendamento4.setEspecialidade("Ginecologia");
			agendamento4.setProfissionalSaude(cadastroDoProfissionalDeSaude().get(3));
			agendamento4.setConvenioParticular("Particular");
			agendamento4.setDataDoAtendimento(LocalDateTime.now());
			agendamento4.setTipoAtendimento("Consulta");
			agendamento4.setLocal("Consultório Dr. Silva");
			agendamento4.setSituacao(true);
			listaAgendamentos.add(agendamento4);

			Agendamento agendamento5 = new Agendamento();
			agendamento5.setIdentificador(5);
			agendamento5.setPaciente(cadastroDePacientes().get(4));
			agendamento5.setEspecialidade("Odontologia");
			agendamento5.setProfissionalSaude(cadastroDoProfissionalDeSaude().get(4));
			agendamento5.setConvenioParticular("Convênio");
			agendamento5.setDataDoAtendimento(LocalDateTime.now());
			agendamento5.setTipoAtendimento("Consulta");
			agendamento5.setLocal("Clínica OdontoCare");
			agendamento5.setSituacao(false);
			listaAgendamentos.add(agendamento5);

			Agendamento agendamento6 = new Agendamento();
			agendamento6.setIdentificador(6);
			agendamento6.setPaciente(cadastroDePacientes().get(5));
			agendamento6.setEspecialidade("Pediatria");
			agendamento6.setProfissionalSaude(cadastroDoProfissionalDeSaude().get(5));
			agendamento6.setConvenioParticular("Convênio");
			agendamento6.setDataDoAtendimento(LocalDateTime.now());
			agendamento6.setTipoAtendimento("Consulta");
			agendamento6.setLocal("Hospital Infantil");
			agendamento6.setSituacao(false);
			listaAgendamentos.add(agendamento6);
			
			
			
			return listaAgendamentos; //Retornando a lista (Coleções) completa de agendamentos
		}
		catch (IndexOutOfBoundsException exception) {
			System.out.println("A posição informada não existe!");
			return null;
		}
	}
	
	//Método para retornar uma lista (Coleções) do tipo Prontuario
	public List<Prontuario> prontuariosDosPacientes() {
		
		//Tratamento de Erros
		try {
			//Criando a Lista de prontuarios do tipo Prontuario (Coleções)
			List<Prontuario> listaProntuarios = new ArrayList<Prontuario>();
			
			//Criando objetos prontuario (cada um com valores diferentes para os atributos)
			Prontuario prontuario1 = new Prontuario(); //Instanciando o objeto prontuario
			prontuario1.setIdentificador(1);
			prontuario1.setPaciente(cadastroDePacientes().get(0)); //Relação com a lista de pacientes
			prontuario1.setProfissionalSaude(cadastroDoProfissionalDeSaude().get(0)); //Relação com a lista de ProfissionalDeSaude
			prontuario1.setDescricaoAtendimento("Paciente apresentou sintomas de gripe com febre alta.");
			prontuario1.setTratamentoSugerido("Repouso, ingestão de líquidos e prescrição de antitérmico.");
			prontuario1.setExamesSolicitados(examesSolicitados().get(0)); //Relação com a lista de examesSolicitados
			prontuario1.setObservacoes("Agendar retorno após 3 dias se os sintomas persistirem.");
			prontuario1.setDataDoCadastro(LocalDateTime.now());
			prontuario1.setSituacao(true);
			listaProntuarios.add(prontuario1); //Adicionando o objeto criado na lista (Coleções)

			Prontuario prontuario2 = new Prontuario();
			prontuario2.setIdentificador(2);
			prontuario2.setPaciente(cadastroDePacientes().get(1));
			prontuario2.setProfissionalSaude(cadastroDoProfissionalDeSaude().get(1));
			prontuario2.setDescricaoAtendimento("Paciente relatou dor abdominal intensa após refeição.");
			prontuario2.setTratamentoSugerido("Solicitar exame de ultrassom abdominal e prescrever analgésicos.");
			prontuario2.setExamesSolicitados(examesSolicitados().get(1));
			prontuario2.setObservacoes("Acompanhar evolução e agendar consulta com gastroenterologista.");
			prontuario2.setDataDoCadastro(LocalDateTime.now());
			prontuario2.setSituacao(true);
			listaProntuarios.add(prontuario2);

			Prontuario prontuario3 = new Prontuario();
			prontuario3.setIdentificador(3);
			prontuario3.setPaciente(cadastroDePacientes().get(2));
			prontuario3.setProfissionalSaude(cadastroDoProfissionalDeSaude().get(2));
			prontuario3.setDescricaoAtendimento("Paciente chegou com histórico de alergia a penicilina.");
			prontuario3.setTratamentoSugerido("Prescrever antibiótico alternativo e monitorar reações alérgicas.");
			prontuario3.setExamesSolicitados(examesSolicitados().get(2));
			prontuario3.setObservacoes("Alertar sobre possíveis efeitos colaterais e orientar a busca por atendimento imediato em caso de reação alérgica grave.");
			prontuario3.setDataDoCadastro(LocalDateTime.now());
			prontuario3.setSituacao(true);
			listaProntuarios.add(prontuario3);

			Prontuario prontuario4 = new Prontuario();
			prontuario4.setIdentificador(4);
			prontuario4.setPaciente(cadastroDePacientes().get(3));
			prontuario4.setProfissionalSaude(cadastroDoProfissionalDeSaude().get(3));
			prontuario4.setDescricaoAtendimento("Paciente apresentou quadro de ansiedade e insônia.");
			prontuario4.setTratamentoSugerido("Recomendar terapia cognitivo-comportamental e prescrever medicamento ansiolítico de curto prazo.");
			prontuario4.setExamesSolicitados(examesSolicitados().get(3));
			prontuario4.setObservacoes("Acompanhar evolução do quadro e ajustar tratamento conforme necessário.");
			prontuario4.setDataDoCadastro(LocalDateTime.now());
			prontuario4.setSituacao(true);
			listaProntuarios.add(prontuario4);

			Prontuario prontuario5 = new Prontuario();
			prontuario5.setIdentificador(5);
			prontuario5.setPaciente(cadastroDePacientes().get(4));
			prontuario5.setProfissionalSaude(cadastroDoProfissionalDeSaude().get(4));
			prontuario5.setDescricaoAtendimento("Paciente teve lesão na perna após queda durante atividade física.");
			prontuario5.setTratamentoSugerido("Limpar e desinfetar a ferida, aplicar curativo e prescrever analgésico.");
			prontuario5.setExamesSolicitados(examesSolicitados().get(4));
			prontuario5.setObservacoes("Instruir sobre a troca regular do curativo e monitorar sinais de infecção.");
			prontuario5.setDataDoCadastro(LocalDateTime.now());
			prontuario5.setSituacao(false);
			listaProntuarios.add(prontuario5);

			Prontuario prontuario6 = new Prontuario();
			prontuario6.setIdentificador(6);
			prontuario6.setPaciente(cadastroDePacientes().get(5));
			prontuario6.setProfissionalSaude(cadastroDoProfissionalDeSaude().get(5));
			prontuario6.setDescricaoAtendimento("Paciente procurou consulta de rotina para check-up.");
			prontuario6.setTratamentoSugerido("Solicitar exames de sangue, urina e imagem para avaliação geral da saúde.");
			prontuario6.setExamesSolicitados(examesSolicitados().get(5));
			prontuario6.setObservacoes("Agendar retorno para revisão dos resultados e discussão do plano de cuidados.");
			prontuario6.setDataDoCadastro(LocalDateTime.now());
			prontuario6.setSituacao(false);
			listaProntuarios.add(prontuario6);
			
			
			
			return listaProntuarios; //Retornando a lista (Coleções) completa de prontuarios
		}
		catch (IndexOutOfBoundsException exception) {
			System.out.println("A posição informada não existe!");
			return null;
		}
	}
	
	//Método para retornar uma lista (Coleções) do tipo String
	public List<String> examesSolicitados() {
		
		////Criando a Lista de ExamesSolicitadosProntuarios do tipo String (Coleções)
		List<String> listaExamesSolicitadosProntuarios = new ArrayList<>();
		
		listaExamesSolicitadosProntuarios.add("Hemograma Completo"); //Adicionando a String na lista (Coleções)

		listaExamesSolicitadosProntuarios.add("Glicemia de Jejum");

		listaExamesSolicitadosProntuarios.add("Pesquisa de Parasitas em Fezes");

		listaExamesSolicitadosProntuarios.add("Dosagem de Anticorpos");

		listaExamesSolicitadosProntuarios.add("Radiografia de Tórax");

		listaExamesSolicitadosProntuarios.add("Teste de Gravidez");
		
		
		
		return listaExamesSolicitadosProntuarios; //Retornando a lista (Coleções) completa de ExamesSolicitadosProntuarios
	}
	
	//Método para retornar uma lista (Coleções) do tipo AgendamentosProfissional
	public List<AgendamentosProfissional> todosAgendamentosProfissional() {
		
		//Tratamento de Erros
		try {
			//Criando a Lista de TodosAgendamentosProfissional do tipo AgendamentosProfissional (Coleções)
			List<AgendamentosProfissional> listaTodosAgendamentosProfissional = new ArrayList<AgendamentosProfissional>();
			
			//Criando objetos AgendamentosProfissional (cada um com valores diferentes para os atributos)
			AgendamentosProfissional agendamentosProfissional1 = new AgendamentosProfissional(); //Instanciando o objeto AgendamentosProfissional
			agendamentosProfissional1.setPaciente(cadastroDePacientes().get(0)); //Relação com a lista de pacientes
			agendamentosProfissional1.setTipoAtendimento("Consulta");
			agendamentosProfissional1.setProfissionalSaude(cadastroDoProfissionalDeSaude().get(0)); //Relação com a lista de ProfissionalDeSaude
			agendamentosProfissional1.setLocal("Hospital ABC");
			agendamentosProfissional1.setDataDoAtendimento(LocalDateTime.now());
			listaTodosAgendamentosProfissional.add(agendamentosProfissional1); //Adicionando o objeto criado na lista (Coleções)

			AgendamentosProfissional agendamentosProfissional2 = new AgendamentosProfissional();
			agendamentosProfissional2.setPaciente(cadastroDePacientes().get(1));
			agendamentosProfissional2.setTipoAtendimento("Consulta");
			agendamentosProfissional2.setProfissionalSaude(cadastroDoProfissionalDeSaude().get(1));
			agendamentosProfissional2.setLocal("Clínica XYZ");
			agendamentosProfissional2.setDataDoAtendimento(LocalDateTime.now());
			listaTodosAgendamentosProfissional.add(agendamentosProfissional2);

			AgendamentosProfissional agendamentosProfissional3 = new AgendamentosProfissional();
			agendamentosProfissional3.setPaciente(cadastroDePacientes().get(2));
			agendamentosProfissional3.setTipoAtendimento("Emergencial");
			agendamentosProfissional3.setProfissionalSaude(cadastroDoProfissionalDeSaude().get(2));
			agendamentosProfissional3.setLocal("Pronto Socorro Central");
			agendamentosProfissional3.setDataDoAtendimento(LocalDateTime.now());
			listaTodosAgendamentosProfissional.add(agendamentosProfissional3);

			AgendamentosProfissional agendamentosProfissional4 = new AgendamentosProfissional();
			agendamentosProfissional4.setPaciente(cadastroDePacientes().get(3));
			agendamentosProfissional4.setTipoAtendimento("Consulta");
			agendamentosProfissional4.setProfissionalSaude(cadastroDoProfissionalDeSaude().get(3));
			agendamentosProfissional4.setLocal("Consultório Dr. Silva");
			agendamentosProfissional4.setDataDoAtendimento(LocalDateTime.now());
			listaTodosAgendamentosProfissional.add(agendamentosProfissional4);

			AgendamentosProfissional agendamentosProfissional5 = new AgendamentosProfissional();
			agendamentosProfissional5.setPaciente(cadastroDePacientes().get(4));
			agendamentosProfissional5.setTipoAtendimento("Consulta");
			agendamentosProfissional5.setProfissionalSaude(cadastroDoProfissionalDeSaude().get(4));
			agendamentosProfissional5.setLocal("Clínica OdontoCare");
			agendamentosProfissional5.setDataDoAtendimento(LocalDateTime.now());
			listaTodosAgendamentosProfissional.add(agendamentosProfissional5);

			AgendamentosProfissional agendamentosProfissional6 = new AgendamentosProfissional();
			agendamentosProfissional6.setPaciente(cadastroDePacientes().get(5));
			agendamentosProfissional6.setTipoAtendimento("Consulta");
			agendamentosProfissional6.setProfissionalSaude(cadastroDoProfissionalDeSaude().get(5));
			agendamentosProfissional6.setLocal("Hospital Infantil");
			agendamentosProfissional6.setDataDoAtendimento(LocalDateTime.now());
			listaTodosAgendamentosProfissional.add(agendamentosProfissional6);
			
			
			
			return listaTodosAgendamentosProfissional; //Retornando a lista (Coleções) completa de TodosAgendamentosProfissional
		}
		catch (IndexOutOfBoundsException exception) {
			System.out.println("A posição informada não existe!");
			return null;
		}
	}
	
	//Método para retornar uma lista (Coleções) do tipo ProntuariosProfissionalSaude
	public List<ProntuariosProfissionalSaude> todosProntuariosProfissionalSaude() {
		
		//Tratamento de Erros
		try {
			//Criando a Lista de TodosProntuariosProfissionalSaude do tipo ProntuariosProfissionalSaude (Coleções)
			List<ProntuariosProfissionalSaude> listaTodosProntuariosProfissionalSaude = new ArrayList<ProntuariosProfissionalSaude>();
			
			//Criando objetos ProntuariosProfissionalSaude (cada um com valores diferentes para os atributos)
			ProntuariosProfissionalSaude prontuariosProfissionalSaude1 = new ProntuariosProfissionalSaude(); //Instanciando o objeto ProntuariosProfissionalSaude
			prontuariosProfissionalSaude1.setPaciente(cadastroDePacientes().get(0)); //Relação com a lista de pacientes
			prontuariosProfissionalSaude1.setProfissionalSaude(cadastroDoProfissionalDeSaude().get(0)); //Relação com a lista de ProfissionalDeSaude
			listaTodosProntuariosProfissionalSaude.add(prontuariosProfissionalSaude1); //Adicionando o objeto criado na lista (Coleções)

			ProntuariosProfissionalSaude prontuariosProfissionalSaude2 = new ProntuariosProfissionalSaude();
			prontuariosProfissionalSaude2.setPaciente(cadastroDePacientes().get(1));
			prontuariosProfissionalSaude2.setProfissionalSaude(cadastroDoProfissionalDeSaude().get(1));
			listaTodosProntuariosProfissionalSaude.add(prontuariosProfissionalSaude2);

			ProntuariosProfissionalSaude prontuariosProfissionalSaude3 = new ProntuariosProfissionalSaude();
			prontuariosProfissionalSaude3.setPaciente(cadastroDePacientes().get(2));
			prontuariosProfissionalSaude3.setProfissionalSaude(cadastroDoProfissionalDeSaude().get(2));
			listaTodosProntuariosProfissionalSaude.add(prontuariosProfissionalSaude3);

			ProntuariosProfissionalSaude prontuariosProfissionalSaude4 = new ProntuariosProfissionalSaude();
			prontuariosProfissionalSaude4.setPaciente(cadastroDePacientes().get(3));
			prontuariosProfissionalSaude4.setProfissionalSaude(cadastroDoProfissionalDeSaude().get(3));
			listaTodosProntuariosProfissionalSaude.add(prontuariosProfissionalSaude4);

			ProntuariosProfissionalSaude prontuariosProfissionalSaude5 = new ProntuariosProfissionalSaude();
			prontuariosProfissionalSaude5.setPaciente(cadastroDePacientes().get(4));
			prontuariosProfissionalSaude5.setProfissionalSaude(cadastroDoProfissionalDeSaude().get(4));
			listaTodosProntuariosProfissionalSaude.add(prontuariosProfissionalSaude5);

			ProntuariosProfissionalSaude prontuariosProfissionalSaude6 = new ProntuariosProfissionalSaude();
			prontuariosProfissionalSaude6.setPaciente(cadastroDePacientes().get(5));
			prontuariosProfissionalSaude6.setProfissionalSaude(cadastroDoProfissionalDeSaude().get(5));
			listaTodosProntuariosProfissionalSaude.add(prontuariosProfissionalSaude6);
			
			
			
			return listaTodosProntuariosProfissionalSaude; //Retornando a lista (Coleções) completa de TodosProntuariosProfissionalSaude
		}
		catch (IndexOutOfBoundsException exception) {
			System.out.println("A posição informada não existe!");
			return null;
		}
	}
	
	//Método para retornar uma lista (Coleções) do tipo ExamesPaciente
	public List<ExamesPaciente> todosExamesPacientes() {
		
		//Tratamento de Erros
		try {
			//Criando a Lista de TodosExamesPacientes do tipo ExamesPaciente (Coleções)
			List<ExamesPaciente> listaTodosExamesPacientes = new ArrayList<ExamesPaciente>();
			
			//Criando objetos ExamesPaciente (cada um com valores diferentes para os atributos)
			ExamesPaciente examesPaciente1 = new ExamesPaciente(); //Instanciando o objeto paciente
			examesPaciente1.setPaciente(cadastroDePacientes().get(0)); //Relação com a lista de pacientes
			examesPaciente1.setNomeExame(examesSolicitados().get(0)); //Relação com a lista de examesSolicitados
			listaTodosExamesPacientes.add(examesPaciente1); //Adicionando o objeto criado na lista (Coleções)

			ExamesPaciente examesPaciente2 = new ExamesPaciente();
			examesPaciente2.setPaciente(cadastroDePacientes().get(1));
			examesPaciente2.setNomeExame(examesSolicitados().get(1));
			listaTodosExamesPacientes.add(examesPaciente2);

			ExamesPaciente examesPaciente3 = new ExamesPaciente();
			examesPaciente3.setPaciente(cadastroDePacientes().get(2));
			examesPaciente3.setNomeExame(examesSolicitados().get(2));
			listaTodosExamesPacientes.add(examesPaciente3);

			ExamesPaciente examesPaciente4 = new ExamesPaciente();
			examesPaciente4.setPaciente(cadastroDePacientes().get(3));
			examesPaciente4.setNomeExame(examesSolicitados().get(3));
			listaTodosExamesPacientes.add(examesPaciente4);

			ExamesPaciente examesPaciente5 = new ExamesPaciente();
			examesPaciente5.setPaciente(cadastroDePacientes().get(4));
			examesPaciente5.setNomeExame(examesSolicitados().get(4));
			listaTodosExamesPacientes.add(examesPaciente5);

			ExamesPaciente examesPaciente6 = new ExamesPaciente();
			examesPaciente6.setPaciente(cadastroDePacientes().get(5));
			examesPaciente6.setNomeExame(examesSolicitados().get(5));
			listaTodosExamesPacientes.add(examesPaciente6);
			
			
			
			return listaTodosExamesPacientes; //Retornando a lista (Coleções) completa de TodosExamesPacientes
		}
		catch (IndexOutOfBoundsException exception) {
			System.out.println("A posição informada não existe!");
			return null;
		}
	}
	
	//Método para retornar uma lista (Coleções) do tipo AtendimentoProfissionalSaude
	public List<AtendimentoProfissionalSaude> quantidadeAtendimentosProfissionalSaude() {
		
		//Tratamento de Erros
		try {
			//Criando a Lista de AtendimentosProfissionalSaude do tipo AtendimentoProfissionalSaude (Coleções)
			List<AtendimentoProfissionalSaude> listaAtendimentosProfissionalSaude = new ArrayList<>();
			
			//Criando objetos AtendimentoProfissionalSaude (cada um com valores diferentes para os atributos)
			AtendimentoProfissionalSaude atendimentoProfissionalSaude1 = new AtendimentoProfissionalSaude(); //Instanciando o objeto AtendimentoProfissionalSaude
			atendimentoProfissionalSaude1.setPaciente(cadastroDePacientes().get(0)); //Relação com a lista de pacientes
			atendimentoProfissionalSaude1.setProfissionalSaude(cadastroDoProfissionalDeSaude().get(0)); //Relação com a lista de ProfissionalDeSaude
			listaAtendimentosProfissionalSaude.add(atendimentoProfissionalSaude1); //Adicionando o objeto criado na lista (Coleções)

			AtendimentoProfissionalSaude atendimentoProfissionalSaude2 = new AtendimentoProfissionalSaude();
			atendimentoProfissionalSaude2.setPaciente(cadastroDePacientes().get(1));
			atendimentoProfissionalSaude2.setProfissionalSaude(cadastroDoProfissionalDeSaude().get(1));
			listaAtendimentosProfissionalSaude.add(atendimentoProfissionalSaude2);

			AtendimentoProfissionalSaude atendimentoProfissionalSaude3 = new AtendimentoProfissionalSaude();
			atendimentoProfissionalSaude3.setPaciente(cadastroDePacientes().get(2));
			atendimentoProfissionalSaude3.setProfissionalSaude(cadastroDoProfissionalDeSaude().get(2));
			listaAtendimentosProfissionalSaude.add(atendimentoProfissionalSaude3);

			AtendimentoProfissionalSaude atendimentoProfissionalSaude4 = new AtendimentoProfissionalSaude();
			atendimentoProfissionalSaude4.setPaciente(cadastroDePacientes().get(3));
			atendimentoProfissionalSaude4.setProfissionalSaude(cadastroDoProfissionalDeSaude().get(3));
			listaAtendimentosProfissionalSaude.add(atendimentoProfissionalSaude4);

			AtendimentoProfissionalSaude atendimentoProfissionalSaude5 = new AtendimentoProfissionalSaude();
			atendimentoProfissionalSaude5.setPaciente(cadastroDePacientes().get(4));
			atendimentoProfissionalSaude5.setProfissionalSaude(cadastroDoProfissionalDeSaude().get(4));
			listaAtendimentosProfissionalSaude.add(atendimentoProfissionalSaude5);

			AtendimentoProfissionalSaude atendimentoProfissionalSaude6 = new AtendimentoProfissionalSaude();
			atendimentoProfissionalSaude6.setPaciente(cadastroDePacientes().get(5));
			atendimentoProfissionalSaude6.setProfissionalSaude(cadastroDoProfissionalDeSaude().get(5));
			listaAtendimentosProfissionalSaude.add(atendimentoProfissionalSaude6);
			
			
			
			return listaAtendimentosProfissionalSaude; //Retornando a lista (Coleções) completa de AtendimentosProfissionalSaude
		}
		catch (IndexOutOfBoundsException exception) {
			System.out.println("A posição informada não existe!");
			return null;
		}
	}
	
	//Método para retornar uma lista (Coleções) do tipo AgendamentosPaciente
	public List<AgendamentosPaciente> todosAgendamentosPaciente() {
		
		//Tratamento de Erros
		try {
			//Criando a Lista de TodosAgendamentosPaciente do tipo AgendamentosPaciente (Coleções)
			List<AgendamentosPaciente> listaTodosAgendamentosPaciente = new ArrayList<AgendamentosPaciente>();
			
			//Criando objetos AgendamentosPaciente (cada um com valores diferentes para os atributos)
			AgendamentosPaciente agendamentosPaciente1 = new AgendamentosPaciente(); //Instanciando o objeto AgendamentosPaciente
			agendamentosPaciente1.setPaciente(cadastroDePacientes().get(0)); //Relação com a lista de pacientes
			agendamentosPaciente1.setProfissionalSaude(cadastroDoProfissionalDeSaude().get(0)); //Relação com a lista de ProfissionalDeSaude
			listaTodosAgendamentosPaciente.add(agendamentosPaciente1); //Adicionando o objeto criado na lista (Coleções)
			
			AgendamentosPaciente agendamentosPaciente2 = new AgendamentosPaciente();
			agendamentosPaciente2.setPaciente(cadastroDePacientes().get(1));
			agendamentosPaciente2.setProfissionalSaude(cadastroDoProfissionalDeSaude().get(1));
			listaTodosAgendamentosPaciente.add(agendamentosPaciente2);
			
			AgendamentosPaciente agendamentosPaciente3 = new AgendamentosPaciente();
			agendamentosPaciente3.setPaciente(cadastroDePacientes().get(2));
			agendamentosPaciente3.setProfissionalSaude(cadastroDoProfissionalDeSaude().get(2));
			listaTodosAgendamentosPaciente.add(agendamentosPaciente3);
			
			AgendamentosPaciente agendamentosPaciente4 = new AgendamentosPaciente();
			agendamentosPaciente4.setPaciente(cadastroDePacientes().get(3));
			agendamentosPaciente4.setProfissionalSaude(cadastroDoProfissionalDeSaude().get(3));
			listaTodosAgendamentosPaciente.add(agendamentosPaciente4);
			
			AgendamentosPaciente agendamentosPaciente5 = new AgendamentosPaciente();
			agendamentosPaciente5.setPaciente(cadastroDePacientes().get(4));
			agendamentosPaciente5.setProfissionalSaude(cadastroDoProfissionalDeSaude().get(4));
			listaTodosAgendamentosPaciente.add(agendamentosPaciente5);
			
			AgendamentosPaciente agendamentosPaciente6 = new AgendamentosPaciente();
			agendamentosPaciente6.setPaciente(cadastroDePacientes().get(5));
			agendamentosPaciente6.setProfissionalSaude(cadastroDoProfissionalDeSaude().get(5));
			listaTodosAgendamentosPaciente.add(agendamentosPaciente6);
			
			
			
			return listaTodosAgendamentosPaciente; //Retornando a lista (Coleções) completa de TodosAgendamentosPaciente
		}
		catch (IndexOutOfBoundsException exception) {
			System.out.println("A posição informada não existe!");
			return null;
		}
	}
	
}