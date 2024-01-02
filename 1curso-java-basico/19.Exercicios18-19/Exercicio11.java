import java.util.Scanner;
public class Exercicio11 {
    public static void main(String[] args) {
        /**11. Criar um vetor A com 10 elementos inteiros.
         * Implementar um programa que defina e escreva a quantidade de 
         * elementos armazenados neste vetor que são pares. */
        Scanner scan = new Scanner(System.in);
        int vetA[] = new int[10], contPar = 0;

        System.out.println("** Quais elementos do vetor sao pares **");
        for (int i = 0; i < vetA.length; i++) {
            System.out.print("Digite a posicao " + (i + 1) + " do vetor A: ");
            vetA[i] =  scan.nextInt();
            if (vetA[i]%2 == 0) {
                contPar++;
            }
        }
        System.out.println("Dentro do vetor A, existem " + contPar + " numeros que sao par.");
    }
}//revisado 03/11/2023