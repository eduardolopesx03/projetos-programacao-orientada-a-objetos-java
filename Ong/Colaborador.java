package ong;

//Classe Colaborador herdando características da Classe abstrata Pessoa
public class Colaborador extends Pessoa {
	
	//Atributos (Encapsulamento)
    private String cargo;
    private String areaAtuacao;
    
    //Métodos getters e setters
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }
    
    //Sobrescrita do método "toString", que vai servir para retornarmos o que queremos que apareça quando formos printar um objeto
    //que foi instanciado por essa classe.
    @Override
    public String toString() {
    	return "Colaborador: " + getNome() + "\nIdade: " +  getIdade() + "\nCPF: " + getCpf() + "\nCargo: " + getCargo() + "\nArea de Atuação: " + getAreaAtuacao();
    }
    
}