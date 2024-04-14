package consultorio;

import java.time.LocalDateTime;

//Classe Exame
public class Exame {
	
	//Atributos (Encapsulamento)
	private int identificador;
	private String nomeExame;
	private String descricaoExame;
	private String observacao;
	private String categoria;
	private LocalDateTime dataDoCadastro;
	private boolean situacao;
	
	//Métodos getters e setters
	public int getIdentificador() {
		return identificador;
	}
	
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	
	public String getNomeExame() {
		return nomeExame;
	}
	
	public void setNomeExame(String nomeExame) {
		this.nomeExame = nomeExame;
	}
	
	public String getDescricaoExame() {
		return descricaoExame;
	}
	
	public void setDescricaoExame(String descricaoExame) {
		this.descricaoExame = descricaoExame;
	}
	
	public String getObservacao() {
		return observacao;
	}
	
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
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
	
	//Sobrescrita do método toString (Polimorfismo)
	@Override
	public String toString() {
		return "Identificador: " + getIdentificador() + "\nNome do Exame: " + getNomeExame() + "\nDescrição do Exame: " + getDescricaoExame() + "\nObservação: " + getObservacao() + "\nCategoria: " + getCategoria() + "\nData Do Cadastro: " + getDataDoCadastro() + "\nSituação: " + isSituacao();
	}
	
}
