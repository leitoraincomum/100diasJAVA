import java.util.Scanner;
public class Exercicio13 {
    public static void main(String[] args) {
        /**13. Criar um vetor A com 10 elementos inteiros. 
         * Implementar um programa que determine a soma dos elementos 
         * armazenados neste vetor que são múltiplos de 5. */
        Scanner scan = new Scanner(System.in);
        int vetA[] = new int[10], contMult5 = 0;

        System.out.println("** Quais elementos do vetor sao multiplos de 5 **");
        for (int i = 0; i < vetA.length; i++) {
            System.out.print("Digite a posicao " + (i + 1) + " do vetor A: ");
            vetA[i] =  scan.nextInt();
            if (vetA[i] % 5 == 0) {
                contMult5 += vetA[i];
            }
        }
        System.out.println("A soma dos numeros que sao multiplos de 5 eh: " + contMult5);
    }
}//revisado 03/11/2023