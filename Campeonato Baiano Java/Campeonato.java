package campeonato;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Campeonato {
	private ArrayList<Equipe> equipes;

	public Campeonato() {
		this.equipes = new ArrayList<>();
	}

	public void adicionarEquipe(Equipe equipe) {
		equipes.add(equipe);
	}

	public ArrayList<Equipe> getEquipes() {
		return equipes;
	}

	public ArrayList<String> getJogos() {
		ArrayList<String> jogos = new ArrayList<>();
		for (int i = 0; i < equipes.size() - 1; i++) {
			for (int j = i + 1; j < equipes.size(); j++) {
				jogos.add(equipes.get(i).getNome() + " x " + equipes.get(j).getNome());
			}
		}
		return jogos;
	}

	public void gerarResultados() {
		Random rand = new Random();
		for (int i = 0; i < equipes.size() - 1; i++) {
			for (int j = i + 1; j < equipes.size(); j++) {
				int resultado = rand.nextInt(3); // gera um número aleatório entre 0 e 2
				if (resultado == 0) {
					System.out.println(equipes.get(i).getNome() + " x " + equipes.get(j).getNome() + ": empate");
				} else if (resultado == 1) {
					System.out.println(equipes.get(i).getNome() + " x " + equipes.get(j).getNome() + ": vitória do " + equipes.get(i).getNome());
					equipes.get(i).adicionarVitoria(true);
					equipes.get(j).adicionarDerrota(true);
				} else {
					System.out.println(equipes.get(i).getNome() + " x " + equipes.get(j).getNome() + ": vitória do " + equipes.get(j).getNome());
					equipes.get(j).adicionarVitoria(true);
					equipes.get(i).adicionarDerrota(true);
				}
			}
		}
	}

	public Equipe getCampeao() {
		ArrayList<Equipe> classificacao = new ArrayList<>(equipes);
		Collections.shuffle(classificacao, new Random()); // ordem aleatória
		return classificacao.get(0); // retorna o primeiro da lista
	}
}
