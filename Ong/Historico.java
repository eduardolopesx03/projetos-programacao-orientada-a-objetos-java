package ong;

import java.util.Date;

//Classe abstrata (modelo) Historico
public abstract class Historico {
	
	//Atributos (Encapsulamento)
    private String descricao;
    private Date data;
    private String local;
    
    //Métodos getters e setters
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Date getData() {
		return data;
	}
	
	public void setData(Date data) {
		this.data = data;
	}
	
	public String getLocal() {
		return local;
	}
	
	public void setLocal(String local) {
		this.local = local;
	}
}