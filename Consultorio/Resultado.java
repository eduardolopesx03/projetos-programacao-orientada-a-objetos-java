package consultorio;

//Classe Resultado
public class Resultado {
	
	//Método main
	public static void main(String[] args) {
		
		Impressao imprimir = new Impressao(); //Instanciando o objeto imprimir

		System.out.println("Lista Com Todos os Pacientes");
		imprimir.imprimirListaPacientes(); //Executando os métodos de impressão específicos para cada lista

		System.out.println();

		System.out.println("Lista Com Todos os Profissionais de Saúde");
		imprimir.imprimirListaProfissionaisSaude();

		System.out.println();

		System.out.println("Lista Com Todos os Exames Cadastrados");
		imprimir.imprimirListaExames();

		System.out.println();

		System.out.println("Lista Com Todos os agendamentos do Paciente em um Determinado Período \n(Obs: Só é possível ter um agendamento se a sua situação estiver como ativa) \n(Obs2: como todos os pacientes agendaram no mesmo dia e horário (LocalDateTime) todos aparecerão aqui)");
		imprimir.imprimirListaAgendamentos();
		
		System.out.println();

		System.out.println("Lista Com Todos os Prontuários do Paciente em um Determinado Período \n(Obs: Só é possível ter um prontuário se a sua situação estiver como ativa) \n(Obs2: como todos os pacientes agendaram no mesmo dia e horário (LocalDateTime) todos aparecerão aqui)");
		imprimir.imprimirListaProntuarios();
		
		System.out.println();

		System.out.println("Lista Com Todos os Agendamentos Feitos para um Determinado Profissional \n(Obs: Só é possível ter um agendamento se a sua situação do paciente e a situação do profissional estiverem ativa)");
		imprimir.imprimirListaAgendamentosProfissional();
		
		System.out.println();

		System.out.println("Lista Com Todos os Prontuários Registrados por um Determinado Profissional de Saúde \n(Obs: Só é possível ter um prontuário registrado se a situação do paciente e a situação do profissional estiverem ativa)");
		imprimir.imprimirListaProntuariosProfissionalSaude();
		
		System.out.println();

		System.out.println("Lista Com Todos os Exames Feitos por um Determinado Paciente \n(Obs: Só é possível ter feito um exame se a situação do paciente estiver ativa)");
		imprimir.imprimirListaTodosExamesPaciente();
		
		System.out.println();

		System.out.println("Quantidade de Atendimentos Efetuados por Profissional de Saúde \n(Obs: Só é possível ter efetuado um atendimento se a situação do paciente e a situação do profissional estiverem ativa)");
		imprimir.imprimirQuantidadeAtendimentosProfissionalSaude();
		
		System.out.println();

		System.out.println("Quantidade de Agendamentos por Paciente \n(Obs: Só é possível ter efetuado um agendamento se a situação do paciente e a situação do profissional estiverem ativa)");
		imprimir.imprimirTodosAgendamentosPaciente();
		
	}
	
}
