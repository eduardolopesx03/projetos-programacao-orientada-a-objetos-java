package consultorio;

//Classe ExamesPaciente herdando as características da clase Exame (Herança)
public class ExamesPaciente extends Exame {
	
	//Atributos (Encapsulamento)
	private Paciente paciente;

	//Métodos getters e setters
	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
	//Sobrescrita do método toString (Polimorfismo)
	@Override
	public String toString() {
		return "O(a) paciante " + getPaciente().getNome() + " realizou o exame " + getNomeExame();
	}
	
}
