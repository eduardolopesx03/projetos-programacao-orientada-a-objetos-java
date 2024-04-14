package consultorio;

import java.time.LocalDateTime;

//Classe Prontuario
public class Prontuario {
	
	//Atributos (Encapsulamento)
	private int identificador;
	private Paciente paciente;
	private ProfissionalSaude profissionalSaude;
	private	String descricaoAtendimento;
	private	String tratamentoSugerido;
	private String examesSolicitados;
	private String observacoes;
	private LocalDateTime dataDoCadastro;
	private boolean situacao;
	
	//Métodos getters e setters
	public int getIdentificador() {
		return identificador;
	}
	
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	
	public Paciente getPaciente() {
		return paciente;
	}
	
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
	public ProfissionalSaude getProfissionalSaude() {
		return profissionalSaude;
	}
	
	public void setProfissionalSaude(ProfissionalSaude profissionalSaude) {
		this.profissionalSaude = profissionalSaude;
	}
	
	public String getDescricaoAtendimento() {
		return descricaoAtendimento;
	}
	
	public void setDescricaoAtendimento(String descricaoAtendimento) {
		this.descricaoAtendimento = descricaoAtendimento;
	}
	
	public String getTratamentoSugerido() {
		return tratamentoSugerido;
	}
	
	public void setTratamentoSugerido(String tratamentoSugerido) {
		this.tratamentoSugerido = tratamentoSugerido;
	}
	
	public String getExamesSolicitados() {
		return examesSolicitados;
	}
	
	public void setExamesSolicitados(String examesSolicitados) {
		this.examesSolicitados = examesSolicitados;
	}
	
	public String getObservacoes() {
		return observacoes;
	}
	
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
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
		return "Identificador: " + getIdentificador() + "\nPaciente: " + getPaciente().getNome() + "\nProfissional: " + getProfissionalSaude().getNome() + "\nDescrição do Atendimento: " + getDescricaoAtendimento() + "\nTratamento Sugerido: " + getTratamentoSugerido() + "\nExames Solicidados: " + getExamesSolicitados() + "\nObservações: " + getObservacoes() + "\nData do Cadastro: " + getDataDoCadastro() + "\nSituação: " + isSituacao();
	}
	
}
