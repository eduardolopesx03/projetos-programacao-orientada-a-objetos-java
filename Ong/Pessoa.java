package ong;

//Classe abstrata (modelo) Pessoa
public abstract class Pessoa {
	
	//Atributos (Encapsulamento)
    private String nome;
    private int idade;
    private String cpf;
    
    //Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
