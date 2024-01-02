import java.util.Scanner;
public class Exercicio02 {
    public static void main(String[] args){
        /**02. Criar um vetor A com 8 elementos inteiros. Construir um vetor B 
         * de mesmo tipo e tamanho e com os elementos do vetor A multiplicados por 2, 
         * ou seja: B[i] = A[i] * 2. */
        Scanner scan = new Scanner(System.in);
        int vetA[] = new int[8], vetB[] = new int[8];

        System.out.println("*** VetB = vetA * 2 ***");
        
        for (int i = 0; i < vetA.length; i ++){
            System.out.print("Digite a posicao " + (i + 1) + " do vetor A: ");
            vetA[i] = scan.nextInt();
        }

        for (int i = 0; i < vetB.length; i ++){
            vetB[i] = vetA[i] * 2; 
        }

        System.out.println("\n*** Elementos vetor B ***");
        for (int i = 0; i < vetB.length; i++){
            System.out.println("Posicao " + (i + 1) + " do vetor B: " + vetB[i]);
        }
    }
    
}//revisado 02/11/2023
