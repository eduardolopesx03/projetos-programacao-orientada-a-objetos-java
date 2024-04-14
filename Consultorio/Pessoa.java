package consultorio;

import java.time.LocalDateTime;

//(Classe Abstrata)
//Classe Abstrata Pessoa que vai servir como "Classe Modelo" para as Classes Paciente e ProfissionalSaude
public abstract class Pessoa {
	
	//Atributos (Encapsulamento)
	private int identificador;
	private String nome;
	private LocalDateTime dataDoCadastro;
	private boolean situacao;
	
	//Métodos getters e setters
	public int getIdentificador() {
		return identificador;
	}
	
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public LocalDateTime getDataDoCadastro() {
		return dataDoCadastro;
	}
	
	public void setDataDoCadastro(LocalDateTime dataDoCadastro) {
		this.dataDoCadastro = dataDoCadastro;
	}
	
	public boolean isSituacao() {
		return situacao;
	}
	
	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}
	
}
