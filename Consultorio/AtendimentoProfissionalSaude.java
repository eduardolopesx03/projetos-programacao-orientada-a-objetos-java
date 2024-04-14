package consultorio;

//Classe AtendimentoProfissionalSaude herdando as características da clase Agendamento (Herança)
public class AtendimentoProfissionalSaude extends Agendamento {
	
	//Sobrescrita do método toString (Polimorfismo)
	@Override
	public String toString() {
		return "O(a) profissional de saúde " + getProfissionalSaude().getNome() + " realizou um atendimento com o paciente " + getPaciente().getNome() + " (1).";
	}
	
}
