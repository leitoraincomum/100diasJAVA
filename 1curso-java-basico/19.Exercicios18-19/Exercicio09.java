import java.text.DecimalFormat;
import java.util.Scanner;
public class Exercicio09 {
    public static void main(String[] args){
        /**09. Criar dois vetores A e B cada um com 10 elementos inteiros. 
         * Construir um vetor C, onde cada elemento de C é a divisão dos respectivos 
         * elementos em A e B, ou seja: C[i] = A[i] / float(B[i]) */
        Scanner scan = new Scanner(System.in);
        int vetA[] = new int[10], vetB[] = new int[vetA.length];
        double vetC[] = new double[vetB.length];
        
        System.out.println("** Divisao dos Vetores A e B **");
        System.out.println("\n** Digite os valores do vetor A **");
        for (int i = 0; i < vetA.length; i++) {
            System.out.print("Digite a posicao " + (i + 1) + " do vetor A: ");
            vetA[i] =  scan.nextInt();
        }

        System.out.println("\n** Digite os valores do vetor B **");
        for (int i = 0; i < vetB.length; i++) {
            System.out.print("Digite a posicao " + (i + 1) + " do vetor B: ");
            vetB[i] =  scan.nextInt();
            vetC[i] = vetA[i] / vetB[i];
        }

        DecimalFormat df = new DecimalFormat("###,###.###");
        System.out.println("\n** Elementos vetor C **");
        for (int i = 0; i < vetC.length; i ++){
            System.out.println("A posicao " + (i + 1) + " do vetor C eh : " + (df.format(vetC[i])));
        }
    }
}//revisado 02/11/2023