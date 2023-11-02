import java.util.Scanner;
public class Exercicio06 {
    public static void main(String[] args){
        /**06. Criar dois vetores A e B cada um com 10 elementos inteiros. 
         * Construir um vetor C, onde cada elemento de C é a soma dos respectivos 
         * elementos em A e B, ou seja: C[i] = A[i] + B[i]. */
        Scanner scan = new Scanner(System.in);
        int vetA[] = new int[10], vetB[] = new int[vetA.length], vetC[] = new int[vetB.length];
        
        System.out.println("**/ Soma dos Vetores A e B /**");
        System.out.println("\n** Digite os valores do vetor A **");
        for (int i = 0; i < vetA.length; i++) {
            System.out.print("Digite a posicao " + (i + 1) + " do vetor A: ");
            vetA[i] =  scan.nextInt();
        }

        System.out.println("\n** Digite os valores do vetor B **");
        for (int i = 0; i < vetB.length; i++) {
            System.out.print("Digite a posicao " + (i + 1) + " do vetor B: ");
            vetB[i] =  scan.nextInt();
            vetC[i] = vetA[i] + vetB[i];
        }

        System.out.println("\n*** Elementos vetor C ***");
        for (int i = 0; i < vetC.length; i ++){
            System.out.println("A posicao " + (i + 1) + " do vetor C eh : " + vetC[i]);
        }
    }    
}//revisado 02/11/2023
