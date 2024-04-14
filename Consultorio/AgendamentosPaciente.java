package consultorio;

//Classe AgendamentosPaciente herdando as características da clase Agendamento (Herança)
public class AgendamentosPaciente extends Agendamento {
	
	//Sobrescrita do método toString (Polimorfismo)
	@Override
	public String toString() {
		return "O paciente " + getPaciente().getNome() + " agendou um atendimento com o profissional " + getProfissionalSaude().getNome() + " (1).";
	}
	
}
