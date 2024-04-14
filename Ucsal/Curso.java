package faculdade;

//Classe abstrata (modelo) Curso que vai servir para definir o atributo curso nas outras
//classes de forma que não seja direta
public abstract class Curso {
	
	//Atributos (Encapsulamento)
	private String curso;
	
	//Método getters e setters
	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
}
