import java.util.Scanner;
public class Exercicio30{
    public static void main(String[] args){
        /**30. Ler um vetor A com 20 elementos. 
         * Construir dois vetores B e C, sendo que nos vetor B e C 
         * serão armazenados o valores pares e ímpares de A, respectivamente.*/
        Scanner scan = new Scanner(System.in);
        int vetA[] = new int[20], vetB[] = new int[vetA.length], vetC[] = new int[vetB.length];
        int posB = 0, posC = 0;
        System.out.println("** Vetor A recebe elementos e passa para os vetores B (pares) e C (impares) **");

        for (int i = 0; i < vetA.length; i++) {
            System.out.print("Digite a posicao " + (i + 1) + " do vetor A: ");
            vetA[i] = scan.nextInt();
            
            if (vetA[i] % 2 == 0){
                vetB[posB] = vetA[i];
                posB++;
            } else {
                vetC[posC] = vetA[i];
                posC++; 
            }
        }
        System.out.println("\nElementos do vetor A: ");
        for (int i = 0; i < vetA.length; i++){
            System.out.print(vetA[i] + " ");
        }
        System.out.println("\nElementos do vetor B: ");
        for (int i = 0; i < posB; i++){
            System.out.print(vetB[i] + " ");
        }
        System.out.println("\nElementos do vetor C: ");
        for (int i = 0; i < posC; i++){
            System.out.print(vetC[i] + " ");
        }
    }
}//revisado 06/11/2023 (equivalente ao dia 05/11/2023 pois faltou luz)