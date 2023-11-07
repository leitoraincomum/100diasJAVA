import java.util.Scanner;
public class Exercicio32{
    public static void main(String[] args){
        /**32. Criar um vetor A com 5 elementos inteiros. 
         * Escreva um programa que imprima a tabuada de cada um dos 
         * elementos do vetor A.` */
        Scanner scan = new Scanner(System.in);
        int[] vetA = new int[5];
        System.out.println("** Tabuada de cinco numeros digitados **");
        for (int i = 0; i < vetA.length; i++){
            System.out.print("Digite a posicao " + (i + 1) + " do vetor A: ");
            vetA[i] = scan.nextInt();
        }
        
        for (int i = 0; i < vetA.length; i++){
           System.out.println("\nTabuada de " + vetA[i]);
           for (int j = 1; j <= 10; j++){
               System.out.println(j + " * " + vetA[i] + " = " + (vetA[i]*j));
           }
        }
    }
}//revisado 06/11/2023 (equivalente ao dia 05/11/2023 pois faltou luz)