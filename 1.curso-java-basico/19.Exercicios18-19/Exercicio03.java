import java.util.Scanner;
public class Exercicio03 {
    public static void main(String[] args) {
        /**03. Criar um vetor A com 15 elementos inteiros. 
         * Construir um vetor B de mesmo tipo e tamanho, sendo que cada elemento 
         * do vetor B deverá ser o quadrado do respectivo elemento de A, ou seja: 
         * B[i] = A[i] * A[i]. */
        Scanner scan = new Scanner(System.in);
        int [] vetA = new int[15], vetB = new int[15];

        for (int i = 0; i < vetA.length; i ++){
            System.out.print("Digite a posicao " + (i + 1) + " do vetor A: ");
            vetA[i] = scan.nextInt();
        }

        for (int i = 0; i < vetB.length; i ++){
            vetB[i] = vetA[i] * vetA[i];
        }

        System.out.println("\n*** Elementos vetor B ***");
        for (int i = 0; i < vetB.length; i ++){
            System.out.println("A posicao " + (i + 1) + " do vetor B eh : " + vetB[i]);
        }

    }
    
}//revisado 02/11/2023