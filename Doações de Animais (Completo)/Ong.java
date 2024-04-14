package ong;

//Classe Ong
public class Ong {
	
	//Atributos (Encapsulamento)
    private String nome;
    private String endereco;
    private int numeroColaboradores;
    private double orcamentoAnual;
    
    //Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumeroColaboradores() {
        return numeroColaboradores;
    }

    public void setNumeroColaboradores(int numeroColaboradores) {
        this.numeroColaboradores = numeroColaboradores;
    }

    public double getOrcamentoAnual() {
        return orcamentoAnual;
    }

    public void setOrcamentoAnual(double orcamentoAnual) {
        this.orcamentoAnual = orcamentoAnual;
    }
    
    //Sobrescrita do método "toString", que vai servir para retornarmos o que queremos que apareça quando formos printar um objeto
    //que foi instanciado por essa classe.
    @Override
    public String toString() {
    	return "Ong: " + getNome() + "\nEndereço: " +getEndereco() + "\nColaboradores (Número): " + getNumeroColaboradores() + "\nOrçamento Anual: R$" + getOrcamentoAnual() + ",00";
    }
}
