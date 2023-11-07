import java.util.Scanner;
public class Exercicio28{
    public static void main(String[] args){
        /**28. Ler um vetor A com 10 elementos e construir um vetor B 
         * de mesmo tipo e tamanho e com os mesmos elementos de A, 
         * sendo que estes deverão estar invertidos, ou seja, o primeiro 
         * elemento de A passa a ser o último de B, o segundo elemento de A 
         * passa a ser o penúltimo de B e assim por diante. */
        Scanner scan = new Scanner(System.in);
        int vetA[] = new int[10], vetB[] = new int[vetA.length];
        System.out.println("** Vetor B recebendo valores do Vetor A ao contrario **");

        for (int i = 0; i < vetA.length; i++) {
            System.out.print("Digite a posicao " + (i + 1) + " do vetor A: ");
            vetA[i] = scan.nextInt();
            vetB[vetB.length - i - 1] = vetA[i];
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