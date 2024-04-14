package ong;

import java.util.Date;

//Classe Doacao herdando características da Classe abstrata Historico
public class Doacao extends Historico {
	
	//Atributos (Encapsulamento)
	private Cliente Cliente;
	private Colaborador colaborador;
	private Animal animal;
	private Date data;
	private String ong;
	
	//Métodos getters e setters
	public Cliente getCliente() {
		return Cliente;
	}

	public void setCliente(Cliente cliente) {
		Cliente = cliente;
	}

	public Colaborador getColaborador() {
		return colaborador;
	}

	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getOng() {
		return ong;
	}

	public void setOng(String ong) {
		this.ong = ong;
	}
	
	//Sobrescrita do método "toString", que vai servir para retornarmos o que queremos que apareça quando formos printar um objeto
    //que foi instanciado por essa classe.
	@Override
	public String toString() {
		return "O animal " + getAnimal().getNome() + " da espécie " + getAnimal().getEspecie() + " foi adotado pelo cliente " + getCliente().getNome() + " através do colaborador " + getColaborador().getNome() + " da ONG " + getOng() + " na data e horário " + getData()+ ".";
	}
	
}
