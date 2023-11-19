import java.util.Scanner;

public class exercicio04 {
    /*4. Reescreva o exercício 6 da aula 20 (Jogo da Velha). 
    Desenvolva uma classe para representar o Jogo da Velha. 
    Desenvolva uma classe para testar o Jogo. */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        JogoDaVelha jogoDaVelha = new JogoDaVelha();

        System.out.println("Jogador 1 = X \nJogador 2 = O");

        boolean ganhou = false;
        char sinal;
        int linha = 0, coluna = 0;

        while (!ganhou) {//enquanto ninguém ganhar e ainda tiverem jogadas
            if (jogoDaVelha.vezJogador1()) {
                System.out.println("Vez do jogador 1. Escolha linha e coluna (1-3).");
                sinal = 'X';
            } else {
                System.out.println("Vez do jogador 2. Escolha linha e coluna (1-3).");
                sinal = 'O';
            }
            //linha e coluna chamam método para validar a entrada do jogador
            linha = valor("Linha: ", scan);
            coluna = valor("Coluna: ", scan);
            
            if (!jogoDaVelha.validarJogada(linha, coluna, sinal)){
                System.out.println("Posição já usada, tente novamente!");
            }
            
            jogoDaVelha.imprimirTabuleiro();
            
            if (jogoDaVelha.verificarGanhador('X')){
                ganhou = true;
                System.out.println("Parabens, jogador 1 ganhou!");
            } else if (jogoDaVelha.verificarGanhador('O')){
                ganhou = true;
                System.out.println("Parabens, jogador 2 ganhou!");
            } else if (jogoDaVelha.jogada > 9){
                ganhou = true;
                System.out.println("Ninguem ganhou essa partida.");
            }
        }
    }

    //método estático para linha e coluna usando apenas um bloco
    static int valor(String tipoValor, Scanner scan) {
        int valor = 0;
        boolean valorValida = false;
        while (!valorValida) {
            System.out.println("Entre com a " + tipoValor + " (1, 2 ou 3)");
            valor = scan.nextInt();
            if (valor >= 1 && valor <= 3) {
                valorValida = true;
            } else {
                System.out.println("Entrada invalida, tente novamente!");
            }
        }
        valor--;
        return valor;
    }

}//feito 19/11/2023