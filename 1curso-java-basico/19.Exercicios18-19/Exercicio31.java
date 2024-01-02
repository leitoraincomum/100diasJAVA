import java.util.Scanner;
public class Exercicio31{
    public static void main(String[] args){
        /**31. Ler um vetor A com 20 elementos. 
         * Separar os elementos pares e ímpares de A utilizando apenas um vetor extra B. 
         * Sugestão: no início do vetor B armazene os elementos pares de A e nas posições 
         * restantes do vetor B armazene os elementos de A que são ímpares. */
        Scanner scan = new Scanner(System.in);
        int vetA[] = new int[20], vetB[] = new int[vetA.length];
        int posB = 0;
        System.out.println("**Vetor B separa elementos pares e impares de vetor A**");

        for (int i = 0; i < vetA.length; i++) {
            System.out.print("Digite a posicao " + (i + 1) + " do vetor A: ");
            vetA[i] = scan.nextInt();
            if (vetA[i] % 2 == 0){
                vetB[posB] = vetA[i];
                posB++;
            }
        }

        for (int i = 0; i < vetA.length; i++){
            if (vetA[i] % 2 != 0){
                vetB[posB] = vetA[i];
                posB++;
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