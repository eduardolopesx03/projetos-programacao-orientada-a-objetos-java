package faculdade;

import java.util.Date;

//Classe Unidade herdando características de Curso
public class Unidade extends Curso {
	
	//Atributos (Encapsulamento)
	private int identificador;
	private String sigla;
	private String descricao;
	private boolean status;
	private Date dataCadastro;
	
	//Método getters e setters
	public int getIdentificador() {
		return identificador;
	}
	
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	
	public String getSigla() {
		return sigla;
	}
	
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
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
	
	//Sobrescrita do método toString, importante para mostrar a estrutura de como vai ser 
	//impresso
	@Override
	public String toString() {
		return "Curso: " + getCurso() + "\nIdenficador: " + getIdentificador() + "\nSigla: " + getSigla() + "\nDescrição: " + getDescricao() + "\nStatus: " + isStatus() + "\nData Cadastro: " + getDataCadastro();
	}
}
