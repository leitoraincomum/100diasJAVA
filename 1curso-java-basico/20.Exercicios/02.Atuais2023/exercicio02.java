import java.util.Random;

public class exercicio02 {
    /*2. Gere e imprima uma matriz M 10x10 com valores aleatórios entre 0-9. 
    Após isso indique qual é o maior e o menor valor da linha 5 e 
    qual é o maior e o menor valor da coluna 7. */
    public static void main(String[] args) {
        int[][] numerosAleatorios = new int[10][10];
        Random numeroRandom = new Random();

        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++){
                numerosAleatorios[i][j] = numeroRandom.nextInt(100);
            }
        }

        System.out.println("\n** Matriz 10 x 10 gerada **");
        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++){
                System.out.print(numerosAleatorios[i][j] + " ");
            }
            System.out.println();
        }

        int linha5 = 5,  maiorL5 = Integer.MIN_VALUE, menorL5 = Integer.MAX_VALUE;

        for (int i = 0; i < numerosAleatorios[linha5].length; i++){
            if (numerosAleatorios[linha5][i] > maiorL5){
                maiorL5 = numerosAleatorios[linha5][i];                 
            }
            if (numerosAleatorios[linha5][i] < menorL5){
               menorL5 = numerosAleatorios[linha5][i];                 
            }                
        }
        System.out.println("\nMenor valor Linha 5: " + menorL5 +
        "\nMaior valor Linha 5: " + maiorL5);
        
        int coluna7 = 7, maiorC7 = Integer.MIN_VALUE, menorC7 = Integer.MAX_VALUE;;

        for (int i = 0; i < numerosAleatorios.length; i++){
            if (numerosAleatorios[i][coluna7] > maiorC7){
                maiorC7 = numerosAleatorios[i][coluna7];                 
            }
            if (numerosAleatorios[i][coluna7] < menorC7){
               menorC7 = numerosAleatorios[i][coluna7];                 
            }                
        }

        System.out.println("\nMenor valor Coluna 7: " + menorC7 +
        "\nMaior valor Coluna 7: " + maiorC7);

    }    
}//feito em 08/11/2023