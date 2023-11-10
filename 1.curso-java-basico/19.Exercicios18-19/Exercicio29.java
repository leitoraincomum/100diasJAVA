import java.util.Scanner;
public class Exercicio29{
    public static void main(String[] args){
        /**29. Ler dois vetores A e B com 10 elementos cada. 
         * Construir um vetor C, sendo este a junção dos dois outros vetores. 
         * Os primeiros 10 elementos de C deverão receber os elementos de A e 
         * os últimos elementos C deverão receber os elementos de B. Desta forma, 
         * C deverá ter o dobro de elementos de A e B, ou seja, 20 elementos.*/
        Scanner scan = new Scanner(System.in);
        int vetA[] = new int[10], vetB[] = new int[vetA.length], vetC[] = new int[vetB.length * 2];
        System.out.println("** Vetor C recebe elementos dos vetores A e B **");
        
        System.out.print("\n** Insira os valores do Vetor A **\n");
        for (int i = 0; i < vetA.length; i++) {
            System.out.print("Digite a posicao " + (i + 1) + " do vetor A: ");
            vetA[i] = scan.nextInt();
            vetC[i] = vetA[i];
        }

        System.out.print("\n** Insira os valores do Vetor B **\n");
        for (int i = 0; i < vetB.length; i++) {
            System.out.print("Digite a posicao " + (i + 1) + " do vetor B: ");
            vetB[i] = scan.nextInt();
            vetC[i + vetA.length] = vetB[i];
        }
        System.out.println("\nElementos do vetor A: ");
        for (int i = 0; i < vetA.length; i++){
            System.out.print(vetA[i] + " ");
        }
        System.out.println("\nElementos do vetor B: ");
        for (int i = 0; i < vetB.length; i++){
            System.out.print(vetB[i] + " ");
        }
        System.out.println("\nElementos do vetor C: ");
        for (int i = 0; i < vetC.length; i++){
            System.out.print(vetC[i] + " ");
        }
    }
}//revisado 06/11/2023 (equivalente ao dia 05/11/2023 pois faltou luz)