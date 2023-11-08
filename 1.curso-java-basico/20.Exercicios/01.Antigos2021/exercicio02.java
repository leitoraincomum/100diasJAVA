package Antigos;
import java.util.Random;

/*2. Faça um programa que crie uma matriz 3x3x3 onde cada elemento da matriz seja igual a
soma dos seus índices (exemplo: M[1,2,1] = 1+2+1 = 4). Crie uma função que obtenha a
soma de todos elementos da matriz, e uma outra sub-rotina que obtenha soma dos elementos
cujos valores são pares e a soma dos elementos cujos valores são ímpares. Exibir na tela os
valores da soma total, soma dos pares e soma dos ímpares.*/

public class exercicio02 {
    public static void main(String[] args) {

        int[][] numerosAleatorios = new int[10][10];

        Random numeroRandom = new Random();

        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                numerosAleatorios[i][j] = numeroRandom.nextInt(100);
            }
        }
        
        for (int i = 0; i<numerosAleatorios.length; i++){
            for (int j = 0; j<numerosAleatorios[i].length; j++){
                System.out.print(numerosAleatorios[i][j] + " ");
            }
            System.out.println();
        }
        
        int maiorL5 = 0;
        int menorL5 = 101;
        int linha5 = 5;
        for (int i=0; i<numerosAleatorios[linha5].length; i++){
            if (numerosAleatorios[linha5][i] > maiorL5){
                maiorL5 = numerosAleatorios[linha5][i];
            }
            if (numerosAleatorios[linha5][i] < menorL5){
                menorL5 = numerosAleatorios[linha5][i];
            }
        }
        
        System.out.println("Maior valor da linha 5 = " + maiorL5);
        System.out.println("Menor valor da linha 5 = " + menorL5);
        
        int maiorC7 = 0;
        int menorC7 = 101;
        int col7 = 7;
        for (int i = 0; i < numerosAleatorios.length; i++){
            if (numerosAleatorios[i][col7] > maiorC7){
                maiorC7 = numerosAleatorios[i][col7]; 
            }
            if (numerosAleatorios[i][col7] < menorC7){
                menorC7 = numerosAleatorios[i][col7]; 
            }
        }
        
        System.out.println("Maior valor da coluna 7 = " + maiorC7);
        System.out.println("Menor valor da coluna 7 = " + menorC7);
    }

}