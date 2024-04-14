package faculdade;

import java.util.Date;

//Classe Professor
public class Professor {

	//Atributos (Encapsulamento)
	private int identificador;
	private String nome;
	private Unidade unidade;
	private boolean status;
	private Date dataCadastro;

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
	
	public Unidade getUnidade() {
		return unidade;
	}
	
	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
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
	
	public void setDataCadastro(java.util.Date dataCadastro) {
		this.dataCadastro = (Date) dataCadastro;
	}
	
	//Sobrescrita do método toString, importante para mostrar a estrutura de como vai ser 
	//impresso
	@Override
	public String toString() {
		return "Professor: " + getNome() + "\nIdentificador: " + getIdentificador() + "\nUnidade (Curso, Sigla, Descrição): " + getUnidade().getCurso() + ", " + getUnidade().getSigla() + ", " + getUnidade().getDescricao() + "\nStatus: " + isStatus() + "\nData Cadastro: " + getDataCadastro();
	}
}
