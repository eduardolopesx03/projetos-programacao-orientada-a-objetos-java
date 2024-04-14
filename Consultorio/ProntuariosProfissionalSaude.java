package consultorio;

//Classe ProntuariosProfissionalSaude herdando as características da clase Prontuario (Herança)
public class ProntuariosProfissionalSaude extends Prontuario {
	
	//Sobrescrita do método toString (Polimorfismo)
	@Override
	public String toString() {
		return "O profisional de saúde " + getProfissionalSaude().getNome() + " registrou um prontuário para o(a) paciente " + getPaciente().getNome() + ".";
	}
	
}
