import java.util.Scanner;
public class Exercicio37{
    public static void main(String[] args){
        /**37. Criar um vetor A com 15 elementos inteiros. 
         * Construir um vetor B de mesmo tamanho, sendo que cada elemento do vetor B 
         * seja o fatorial do elemento correspondente em A. */
        Scanner scan = new Scanner(System.in);
        int[] vetA = new int[15], vetB = new int[vetA.length];
        
        System.out.println("*** Vetor B fatorial de vetor A ***");
        for (int i = 0; i < vetA.length; i++){
            System.out.print("Digite a posicao " + (i + 1) + " do vetor A: ");
            vetA[i] = scan.nextInt();
        }
        
        for (int i = 0; i < vetA.length; i++){         
            vetB[i] = 1; //opcional
            for (int j = 1; j <= vetA[i]; j++){
                vetB[i] *= j;
            }
        }

        System.out.println("\nElementos do vetor A: ");
        for (int i = 0; i < vetA.length; i++){
            System.out.print(vetA[i] + " ");
        }

        System.out.println("\nElementos do vetor B: ");
        for (int i = 0; i < vetB.length; i++){
            System.out.print(vetB[i] + " ");
        }
    }
    
}//revisado 06/11/2023 (equivalente ao dia 05/11/2023 pois faltou luz)