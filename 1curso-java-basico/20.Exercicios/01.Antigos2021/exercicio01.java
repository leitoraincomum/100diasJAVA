import java.util.Random;

/*```1. Faça um programa que crie uma matriz de inteiros de 5 linhas por 10 colunas. Leia os
valores desta matriz linha após linha e exiba a matriz na tela colunas por colunas.*/

public class exercicio01 {
    
    public static void main(String[] args) {

        int[][] numerosAleatorios = new int[5][10];

        Random numeroRandom = new Random();
        
        for (int i = 0; i < numerosAleatorios.length; i++){
            for (int j = 0; j < numerosAleatorios[i].length; j++){
                numerosAleatorios[i][j] = numeroRandom.nextInt(100);
            }
        }
        
        int maior = 0;
        int linha = 0;
        int coluna = 0;
        for (int i= 0; i < numerosAleatorios.length; i++){
            for (int j = 0; j < numerosAleatorios[i].length; j++){
                if (numerosAleatorios[i][j] > maior){
                    maior = numerosAleatorios[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }
        
        for (int i = 0; i < numerosAleatorios.length; i++){
            for (int j = 0; j < numerosAleatorios[i].length; j++){
                System.out.print(numerosAleatorios[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("Maior valor = " + maior + " | Linha: " + linha + " | Coluna: " + coluna);
    }

}//revisado 07/11/2023