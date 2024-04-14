package ong;

//Classe Animal
public class Animal {
	
	//Atributos (Encapsulamento)
    private String nome;
    private int idade;
    private String especie;
    
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

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    //Sobrescrita do método "toString", que vai servir para retornarmos o que queremos que apareça quando formos printar um objeto
    //que foi instanciado por essa classe.
    @Override
    public String toString() {
    	return "Animal: " + getEspecie() + "\nNome: " + getNome() + "\nIdade: " + getIdade();
    }
    
}