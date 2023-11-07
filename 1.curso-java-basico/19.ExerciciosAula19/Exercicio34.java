import java.util.Scanner;
public class Exercicio34{
    public static void main(String[] args){
        /**34. Criar um vetor A com 10 elementos inteiros. 
         * Escreva um programa que imprima cada elemento do vetor A e a 
         * relação de todos os pares de 0 até o respectivo elemento. */
        Scanner scan = new Scanner(System.in);
        int[] vetA = new int[10];
        System.out.println("** Numeros pares de 0 ateh o numero digitado **");
        
        for (int i = 0; i < vetA.length; i++){
            System.out.print("Digite a posicao " + (i + 1) + " do vetor A: ");
            vetA[i] = scan.nextInt();
        }
        
        for (int i = 0; i < vetA.length; i++){
            System.out.println("\nAnalizando pares em relacao a 0 e ao numero " + vetA[i]);
            for (int j = 2; j < vetA[i]; j++){
                if (j % 2 == 0){
                    System.out.println(j + " eh par");
                }
            }
        }
    }
}//revisado 06/11/2023 (equivalente ao dia 05/11/2023 pois faltou luz)