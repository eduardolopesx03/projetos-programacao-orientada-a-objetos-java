package faculdade;

import java.util.Date;

//Classe Laboratorio
public class Laboratorio {
	
	//Atributos (Encapsulamento)
	private int identificador;
    private String nome;
    private boolean status;
    private Date dataCadastro;
    private Curso curso;
    
    //Método getters e setters
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

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	//Sobrescrita do método toString, importante para mostrar a estrutura de como vai ser 
	//impresso
	@Override
    public String toString() {
    	return  "Nome: " + getNome() + "\nIdentificador: " + getIdentificador() + "\nStatus: " + isStatus() + "\nData Cadastro: " + getDataCadastro();
    }
}
