package consultorio;

import java.util.List;

//Classe Impressao
public class Impressao {

	//Método para imprimir a lista com todos os pacientes
	public void imprimirListaPacientes() {
		
		//Tratamento de Erros
		//Neste caso o tratamento de erros vai funcionar da seguinte forma, como dentro da
		//clase BaseDados quando colocado um índice inexistente nos atributos de lá
		//os métodos irão retornar uma lista nula, ou seja, vai dar erro aqui no método de 
		//impressão já que não é possível imprimir uma lista nula. Para tratar este erro, 
		//utilizamos o tratamento de erros: informamos que não é possível imprimir uma lista
		//nula e o programa continuara sem interrupções (funcionando da mesma forma pra os próximos tratamento).
		try {
			BaseDados pacientesCadastrados = new BaseDados();

			List<Paciente> listaPacientes = pacientesCadastrados.cadastroDePacientes();

			for (Paciente pacientes : listaPacientes) {
				System.out.println(pacientes + "\n");
			}
		}
		catch (NullPointerException exception) {
			System.out.println("Não é possível imprimir uma lista nula (null)!");
		}
	}

	//Método para imprimir a lista com todos os profissionais de saúde
	public void imprimirListaProfissionaisSaude() {
		
		//Tratamento de Erros
		try {
			BaseDados profissionaisSaudeCadastrados = new BaseDados();

			List<ProfissionalSaude> listaProfissionaisSaude = profissionaisSaudeCadastrados.cadastroDoProfissionalDeSaude();

			for (ProfissionalSaude profissionaisSaude : listaProfissionaisSaude) {
				System.out.println(profissionaisSaude + "\n");
			}
		}
		catch (NullPointerException exception) {
			System.out.println("Não é possível imprimir uma lista nula (null)!");
		}
	}

	//Método para imprimir a lista com todos os exames cadastrados
	public void imprimirListaExames() {
		
		//Tratamento de Erros
		try {
			BaseDados examesCadastrados = new BaseDados();

			List<Exame> listaExames = examesCadastrados.cadastroDeExames();

			for (Exame exames : listaExames) {
				System.out.println(exames + "\n");
			}
		}
		catch (NullPointerException exception) {
			System.out.println("Não é possível imprimir uma lista nula (null)!");
		}
	}

	//Método para imprimir a lista com todos os agendamentos do paciente em um determinado período
	public void imprimirListaAgendamentos() {
		
		//Tratamento de Erros
		try {
			BaseDados agendamentosTotais = new BaseDados();
			List<Agendamento> listaAgendamentos = agendamentosTotais.agendamentosDosPacientes();

			for (Agendamento agendamento : listaAgendamentos) {
				if (agendamento.isSituacao()) {
					System.out.println(agendamento + "\n");
				} else {
					System.out.println("A situação do agendamento está inativa.\n");
				}
			}
		}
		catch (NullPointerException exception) {
			System.out.println("Não é possível imprimir uma lista nula (null)!");
		}
	}

	//Método para imprimir a lista com todos os prontuários do paciente em um determinado período
	public void imprimirListaProntuarios() {
		
		//Tratamento de Erros
		try {
			BaseDados prontuariosTotais = new BaseDados();
			List<Prontuario> listaProntuarios = prontuariosTotais.prontuariosDosPacientes();

			for (Prontuario prontuario : listaProntuarios) {
				if (prontuario.isSituacao()) {
					System.out.println(prontuario + "\n");
				} else {
					System.out.println("A situação do prontuário está inativa.\n");
				}
			}
		}
		catch (NullPointerException exception) {
			System.out.println("Não é possível imprimir uma lista nula (null)!");
		}
	}

	//Método para imprimir a lista com todos os agendamentos feitos para um determinado profissional
	public void imprimirListaAgendamentosProfissional() {
		
		//Tratamento de Erros
		try {
			BaseDados agendamentosProfissionais = new BaseDados();
			List<AgendamentosProfissional> listaAgendamentosProfissionais = agendamentosProfissionais.todosAgendamentosProfissional();

			for (AgendamentosProfissional agendamentoProfissional : listaAgendamentosProfissionais) {
				if (agendamentoProfissional.getPaciente().isSituacao() && agendamentoProfissional.getProfissionalSaude().isSituacao()) {
					System.out.println(agendamentoProfissional + "\n");
				} else {
					System.out.println("A situação do(a) paciente e/ou a situação do(a) profissional está(ão) inativa, logo não é possível agendar um atendimento.\n");
				}
			}
		}
		catch (NullPointerException exception) {
			System.out.println("Não é possível imprimir uma lista nula (null)!");
		}
	}

	//Método para imprimir a lista com todos os prontuários registrados por um determinado profissional de saúde
	public void imprimirListaProntuariosProfissionalSaude() {
		
		//Tratamento de Erros
		try {
			BaseDados prontuariosProfissionalSaude = new BaseDados();
			List<ProntuariosProfissionalSaude> listaProntuariosProfissionalSaude = prontuariosProfissionalSaude.todosProntuariosProfissionalSaude();

			for (ProntuariosProfissionalSaude prontuarioProfissionalSaude : listaProntuariosProfissionalSaude) {
				if (prontuarioProfissionalSaude.getPaciente().isSituacao() && prontuarioProfissionalSaude.getProfissionalSaude().isSituacao()) {
					System.out.println(prontuarioProfissionalSaude + "\n");
				} else {
					System.out.println("A situação do(a) paciente e/ou a situação do(a) profissional está(ão) inativa, logo não é possível registrar nenhum prontuário.\n");
				}
			}
		}
		catch (NullPointerException exception) {
			System.out.println("Não é possível imprimir uma lista nula (null)!");
		}
	}

	//Método para imprimir a lista com todos os exames feitos por um determinado paciente
	public void imprimirListaTodosExamesPaciente() {
		
		//Tratamento de Erros
		try {
			BaseDados examesPaciente = new BaseDados();
			List<ExamesPaciente> listaTodosExamesPaciente = examesPaciente.todosExamesPacientes();

			for (ExamesPaciente examePaciente : listaTodosExamesPaciente) {
				if (examePaciente.getPaciente().isSituacao()) {
					System.out.println(examePaciente + "\n");
				} else {
					System.out.println("A situação do(a) paciente está inativa, logo não é possível realizar nenhum exame.\n");
				}
			}
		}
		catch (NullPointerException exception) {
			System.out.println("Não é possível imprimir uma lista nula (null)!");
		}
	}

	//Método para imprimir a quantidade de atendimentos efetuados por profissional de saúde
	public void imprimirQuantidadeAtendimentosProfissionalSaude() {
		
		//Tratamento de Erros
		try {
			BaseDados quantidadeAtendimentosProfissionalSaude = new BaseDados();
			List<AtendimentoProfissionalSaude> totalQuantidadeAtendimentosProfissionalSaude = quantidadeAtendimentosProfissionalSaude.quantidadeAtendimentosProfissionalSaude();

			for (AtendimentoProfissionalSaude atendimentoProfissionalSaude : totalQuantidadeAtendimentosProfissionalSaude) {
				if (atendimentoProfissionalSaude.getPaciente().isSituacao() && atendimentoProfissionalSaude.getProfissionalSaude().isSituacao()) {
					System.out.println(atendimentoProfissionalSaude + "\n");
				} else {
					System.out.println("O(a) profissional e/ou o (a) paciente está(ão) com a situação inativa, logo não é possível efetuar nenhum atendimento (0).\n");
				}
			}
		}
		catch (NullPointerException exception) {
			System.out.println("Não é possível imprimir uma lista nula (null)!");
		} 
	}

	//Método para imprimir a quantidade de agendamentos por paciente
	public void imprimirTodosAgendamentosPaciente() {
		
		//Tratamento de Erros
		try {
			BaseDados quantidadeAgendamentosPaciente = new BaseDados();
			List<AgendamentosPaciente> totalQuantidadeAgendamentosPaciente = quantidadeAgendamentosPaciente.todosAgendamentosPaciente();

			for (AgendamentosPaciente agendamentosPaciente : totalQuantidadeAgendamentosPaciente) {
				if (agendamentosPaciente.getPaciente().isSituacao() && agendamentosPaciente.getProfissionalSaude().isSituacao()) {
					System.out.println(agendamentosPaciente + "\n");
				} else {
					System.out.println("A situação do(a) paciente e/ou do(a) profissional está(ão) inativa, logo não é possível agendar nenhum atendimento (0).\n");
				}
			}
		}
		catch (NullPointerException exception) {
			System.out.println("Não é possível imprimir uma lista nula (null)!");
		}
	}
	
}
