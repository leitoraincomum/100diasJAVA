import java.util.Random;

/*2. Faça um programa que crie uma matriz 3x3x3 onde cada elemento da matriz seja igual a
soma dos seus índices (exemplo: M[1,2,1] = 1+2+1 = 4). Crie uma função que obtenha a
soma de todos elementos da matriz, e uma outra sub-rotina que obtenha soma dos elementos
cujos valores são pares e a soma dos elementos cujos valores são ímpares. Exibir na tela os
valores da soma total, soma dos pares e soma dos ímpares.*/

public class exercicio02 {
    public static void main(String[] args) {

        int[][][] numerosAleatorios = new int[3][3][3];
        int [] somaLinhas = new int[3];

        Random numeroRandom = new Random();
        int soma = 0, somaPares = 0, somaImpares = 0;

        for (int i = 0; i < numerosAleatorios.length; i++) {
            somaLinhas[i] = 0;
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                for (int k = 0; k < numerosAleatorios[j].length; k++) {
                numerosAleatorios[i][j][k] = numeroRandom.nextInt(100);
                soma += numerosAleatorios[i][j][k];
                somaLinhas[i] += numerosAleatorios[i][j][k];  
                if (numerosAleatorios[i][j][k] % 2 == 0){
                    somaPares += numerosAleatorios[i][j][k];
                }  else {
                    somaImpares += numerosAleatorios[i][j][k];
                }
                }
            }
        }
        
        for (int i = 0; i < numerosAleatorios.length; i++){
            for (int j = 0; j < numerosAleatorios[i].length; j++){
                for (int k = 0; k < numerosAleatorios[j].length; k++) {
                System.out.print(numerosAleatorios[i][j][k] + " ");
                }
            }
            System.out.println(" | Soma da linha: " + somaLinhas[i]);
        }
        System.out.println("\nA soma de todos os numeros da matriz eh " + soma +
        "\nSoma dos Pares: "+ somaPares + 
        "\nSoma dos Impares: " + somaImpares);
        /*
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
        System.out.println("Menor valor da coluna 7 = " + menorC7);*/
    }

}//revisado 07/11/2023