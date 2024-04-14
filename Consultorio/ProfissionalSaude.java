package consultorio;

//Classe ProfissionalSaude herdando as características da clase abstrata Pessoa (Herança)
public class ProfissionalSaude extends Pessoa {
	
	//Atributos (Encapsulamento)
	private String tipo;
	private String listaDeEspecialidades;
	
	//Métodos getters e setters
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getListaDeEspecialidades() {
		return listaDeEspecialidades;
	}

	public void setListaDeEspecialidades(String listaDeEspecialidades) {
		this.listaDeEspecialidades = listaDeEspecialidades;
	}
	
	//Sobrescrita do método toString (Polimorfismo)
	@Override
	public String toString() {
			return "Identificador: " + getIdentificador() + "\nNome: " + getNome() + "\nTipo: " + getTipo() + "\nLista de especialidades: " + getListaDeEspecialidades() + "\nData Do Cadastro: " + getDataDoCadastro() + "\nSituação: " + isSituacao();
	}
	
}
