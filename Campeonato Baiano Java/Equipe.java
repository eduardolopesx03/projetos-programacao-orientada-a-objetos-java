package campeonato;

import java.util.ArrayList;

public class Equipe {

	private String nome;
	private int pontos;
	private int vitoriasMandante;
	private int vitoriasVisitante;
	private int derrotasMandante;
	private int derrotasVisitante;
	private ArrayList<Jogador> jogadores;

	public Equipe(String nome) {
		this.nome = nome;
		this.jogadores = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public ArrayList<Jogador> getJogadores() {
		return jogadores;
	}

	public void adicionarJogador(Jogador jogador) {
		jogadores.add(jogador);
	}

	public void removerJogador(Jogador jogador) {
		jogadores.remove(jogador);
	}

	public void adicionarVitoria(boolean mandante) {
		pontos += 3;
		if (mandante) {
			vitoriasMandante++;
		} else {
			vitoriasVisitante++;
		}
	}

	public void adicionarDerrota(boolean mandante) {
		if (mandante) {
			derrotasMandante++;
		} else {
			derrotasVisitante++;
		}
	}

	public int getPontos() {
		return pontos;
	}
}
