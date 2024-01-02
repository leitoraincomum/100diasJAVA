import java.util.Scanner;
public class Exercicio05 {
    public static void main(String[] args){
        /**05. Criar um vetor A com 10 elementos inteiros. 
         * Construir um vetor B de mesmo tipo e tamanho, sendo que cada 
         * elemento do vetor B deverá ser o respectivo elemento de A multiplicado 
         * por sua posição (ou índice), ou seja: B[i] = A[i] * i. */
        Scanner scan = new Scanner(System.in);
        int vetA[] = new int[10], vetB[] = new int[vetA.length];
        
        System.out.println("** B[i] = A[i] * i **");
        for (int i = 0; i < vetB.length; i++) {
            System.out.print("Digite a posicao " + (i + 1) + " do vetor A: ");
            vetA[i] =  scan.nextInt();
            vetB[i] = vetA[i] * i;    
        }

        System.out.println("\n*** Elementos vetor B ***");
        for (int i = 0; i < vetB.length; i ++){
            System.out.println("A posicao " + (i + 1) + " do vetor B eh : " + vetB[i]);
        }

    }    
}//revisado 02/11/2023
