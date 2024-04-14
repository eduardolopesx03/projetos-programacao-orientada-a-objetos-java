package campeonato;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		// criar jogadores
		Jogador jogador1 = new Jogador("Ronaldo", 25, "atacante");
		Jogador jogador2 = new Jogador("Messi", 30, "meio-campo");
		Jogador jogador3 = new Jogador("Neymar", 27, "atacante");
		Jogador jogador4 = new Jogador("Mbappé", 22, "atacante");
		Jogador jogador5 = new Jogador("Modric", 36, "meio-campo");
		Jogador jogador6 = new Jogador("Marcelo", 33, "defesa");

		// criar equipes
		Equipe equipe1 = new Equipe("Bahia");
		equipe1.adicionarJogador(jogador1);
		equipe1.adicionarJogador(jogador2);
		equipe1.adicionarJogador(jogador3);

		Equipe equipe2 = new Equipe("Vitória");
		equipe2.adicionarJogador(jogador4);
		equipe2.adicionarJogador(jogador5);
		equipe2.adicionarJogador(jogador6);

		Equipe equipe3 = new Equipe("Fluminense de Feira");
		equipe3.adicionarJogador(jogador1);
		equipe3.adicionarJogador(jogador4);
		equipe3.adicionarJogador(jogador5);

		// criar campeonato
		Campeonato campeonato = new Campeonato();
		campeonato.adicionarEquipe(equipe1);
		campeonato.adicionarEquipe(equipe2);
		campeonato.adicionarEquipe(equipe3);

		// imprimir jogos
		System.out.println("Jogos:");
		ArrayList<String> jogos = campeonato.getJogos();
		for (String jogo : jogos) {
			System.out.println(jogo);
		}

		// gerar resultados
		System.out.println("\nResultados:");
		campeonato.gerarResultados();

		// imprimir pontuação das equipes
		System.out.println("\nPontuação:");
		for (Equipe equipe : campeonato.getEquipes()) {
			System.out.println(equipe.getNome() + ": " + equipe.getPontos() + " pontos");
		}

		// imprimir campeão
		System.out.println("\nCampeão: " + campeonato.getCampeao().getNome());
	}
}
