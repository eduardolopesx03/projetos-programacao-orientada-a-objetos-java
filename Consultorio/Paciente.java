package consultorio;

//Classe Paciente herdando as características da clase abstrata Pessoa (Herança)
public class Paciente extends Pessoa {
	
	//Atributos (Encapsulamento)
	private String contato;
	private Endereco endereco;
	
	//Métodos getters e setters
	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	//Sobrescrita do método toString (Polimorfismo)
	@Override
	public String toString() {
		return "Identificador: " + getIdentificador() + "\nNome: " + getNome() + "\nContato: " + getContato() + "\nData do Cadastro: " + getDataDoCadastro() + "\nSituação: " + isSituacao() + "\nEndereço" + getEndereco();
	}
	
}
