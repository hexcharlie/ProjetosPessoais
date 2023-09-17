package jogoDaVelha;

import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {
       
    	Scanner scanner = new Scanner(System.in);
        boolean jogarNovamente = true;
        
        while (jogarNovamente) {
            char jogadorAtual = 'X';

        System.out.println("───────────────────────Bem-vindo ao Jogo da Velha!─────────────────────────");
        System.out.println("───────────────────────────────────────▐▀▄───────▄▀▌───▄▄▄▄▄▄▄─────────────");
        System.out.println("───────────────────────────────────────▌▒▒▀▄▄▄▄▄▀▒▒▐▄▀▀▒██▒██▒▀▀▄──────────");
        System.out.println("──────────────────────────────────────▐▒▒▒▒▀▒▀▒▀▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▀▄────────");
        System.out.println("───1. Começar a jogar─────────────────▌▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▄▒▒▒▒▒▒▒▒▒▒▒▒▀▄──────");
        System.out.println("────────────────────────────────────▀█▒▒▒█▌▒▒█▒▒▐█▒▒▒▀▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▌─────");
        System.out.println("────────────────────────────────────▀▌▒▒▒▒▒▒▀▒▀▒▒▒▒▒▒▀▀▒▒▒▒▒▒▒▒▒▒▒▒▒▒▐───▄▄");
        System.out.println("───2. Sair do jogo──────────────────▐▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▌▄█▒█");
        System.out.println("────────────────────────────────────▐▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▒█▀─");
        System.out.println("────────────────────────────────────▐▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▀───");
        System.out.println("────────────────────────────────────▐▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▌────");
        System.out.println("─────────────────────────────────────▌▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▐─────");
        System.out.println("─────────────────────────────────────▐▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▌─────");
        System.out.println("──────────────────────────────────────▌▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▐──────");
        System.out.println("──────────────────────────────────────▐▄▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▄▌──────");
        System.out.println("────────────────────────────────────────▀▄▄▀▀▀▀▀▄▄▀▀▀▀▀▀▀▄▄▀▀▀▀▀▄▄▀────────");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();
        
        if (opcao == 1) {
            Tabuleiro tabuleiro = new Tabuleiro();
            boolean jogoAtivo = true;

            while (jogoAtivo) {
                System.out.println("Jogador " + jogadorAtual + ", é sua vez.");
                tabuleiro.imprimirTabuleiro();
                
                System.out.print("Digite a linha (1, 2, 3): ");
                int linha = scanner.nextInt() - 1; 
                System.out.print("Digite a coluna (1, 2, 3): ");
                int coluna = scanner.nextInt() - 1;

                if (tabuleiro.fazerJogada(linha, coluna, jogadorAtual)) {
                    if (tabuleiro.verificarVitoria(jogadorAtual)) {
                        tabuleiro.imprimirTabuleiro();
                        System.out.println("Jogador " + jogadorAtual + " venceu!");
                        jogoAtivo = false;
                    } else if (tabuleiro.tabuleiroCheio()) {
                        tabuleiro.imprimirTabuleiro();
                        System.out.println("Empate!");
                        jogoAtivo = false;
                    } else {
                        jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
                    }
                } else {
                    System.out.println("Jogada inválida. Tente novamente.");
                }
            }
        } else if (opcao == 2) {
            jogarNovamente = false;
            System.out.println("Obrigado por jogar!");
        } else {
            System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
        }
            if (jogarNovamente) {
                System.out.print("Deseja jogar novamente? (s/n): ");
                char resposta = scanner.next().charAt(0);
                jogarNovamente = (resposta == 's' || resposta == 'S');
            }
        }
        scanner.close();
    	}
}
