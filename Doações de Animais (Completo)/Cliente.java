package ong;

//Classe Cliente herdando características da Classe abstrata Pessoa
public class Cliente extends Pessoa {
	
	//Atributos (Encapsulamento)
    private double doacaoMensal;
    private boolean possuiCadastro;
    
    //Método getters e setters
    public double getDoacaoMensal() {
        return doacaoMensal;
    }

    public void setDoacaoMensal(double doacaoMensal) {
        this.doacaoMensal = doacaoMensal;
    }

    public boolean isPossuiCadastro() {
        return possuiCadastro;
    }

    public void setPossuiCadastro(boolean possuiCadastro) {
        this.possuiCadastro = possuiCadastro;
    }
    
    //Sobrescrita do método "toString", que vai servir para retornarmos o que queremos que apareça quando formos printar um objeto
    //que foi instanciado por essa classe.
    @Override
    public String toString() {
    	return "Cliente: " + getNome() + "\nIdade: " +  getIdade() + "\nCPF: " + getCpf() + "\nDoação Mensal: R$" + getDoacaoMensal() + "\nPossui Cadastro: " + isPossuiCadastro();
    }
    
}