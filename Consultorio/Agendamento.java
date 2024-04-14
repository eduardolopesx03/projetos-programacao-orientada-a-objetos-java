package consultorio;

import java.time.LocalDateTime;

//Classe Agendamento
public class Agendamento {
	
	//Atributos (Encapsulamento)
	private int identificador;
	private Paciente paciente;
	private String especialidade;
	private ProfissionalSaude profissionalSaude;
	private String convenioParticular;
	private LocalDateTime dataDoAtendimento;
	private String tipoAtendimento;
	private String local;
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
	
	public String getEspecialidade() {
		return especialidade;
	}
	
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	public ProfissionalSaude getProfissionalSaude() {
		return profissionalSaude;
	}
	
	public void setProfissionalSaude(ProfissionalSaude profissionalSaude) {
		this.profissionalSaude = profissionalSaude;
	}
	
	public String getConvenioParticular() {
		return convenioParticular;
	}
	
	public void setConvenioParticular(String convenioParticular) {
		this.convenioParticular = convenioParticular;
	}
	
	public LocalDateTime getDataDoAtendimento() {
		return dataDoAtendimento;
	}
	
	public void setDataDoAtendimento(LocalDateTime dataDoAtendimento) {
		this.dataDoAtendimento = dataDoAtendimento;
	}
	
	public String getTipoAtendimento() {
		return tipoAtendimento;
	}
	
	public void setTipoAtendimento(String tipoAtendimento) {
		this.tipoAtendimento = tipoAtendimento;
	}
	
	public String getLocal() {
		return local;
	}
	
	public void setLocal(String local) {
		this.local = local;
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
		return "Identificador: " + getIdentificador() + "\nPaciente: " + getPaciente().getNome() + "\nEspecialdiade: " + getEspecialidade() + "\nProfissional de Saúde: " + getProfissionalSaude().getNome() + "\nConvênio/Particular: " + getConvenioParticular() + "\nData do Atendimento: " + getDataDoAtendimento() + "\nTipo de Atendimento: " + getTipoAtendimento() + "\nLocal: " + getLocal() + "\nSitucação: " + isSituacao();
	}
	
}