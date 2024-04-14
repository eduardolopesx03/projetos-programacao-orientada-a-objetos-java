package faculdade;

import java.util.Date;

//Classe Solicitacao herdando características de Curso
public class Solicitacao extends Curso {
	
	//Atributos (Encapsulamento)
	private Laboratorio laboratorio;
    private Date data;
    private Professor professor;

    //Método getters e setters
	public Laboratorio getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(Laboratorio laboratorio) {
		this.laboratorio = laboratorio;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	//Sobrescrita do método toString, importante para mostrar a estrutura de como vai ser 
	//impresso
	@Override
    public String toString() {	
    	return "Professor: " + getProfessor().getNome() + "\nCurso: " + getCurso() + "\nsolicitou: " + getLaboratorio().getNome() + "\nData: " + getData();
    }
}
