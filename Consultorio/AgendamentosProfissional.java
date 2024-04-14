package consultorio;

//Classe AgendamentosProfissional herdando as características da clase Agendamento (Herança)
public class AgendamentosProfissional extends Agendamento {
	
	//Sobrescrita do método toString (Polimorfismo)
	@Override
	public String toString() {
		return "O(a) paciente " + getPaciente().getNome() + " agendou um (a) " + getTipoAtendimento() + " com o profissional " + getProfissionalSaude().getNome() + "" + " no local " + getLocal() + " na data e horário " + getDataDoAtendimento();
	}
	
}
