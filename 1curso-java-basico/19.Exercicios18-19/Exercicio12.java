import java.util.Scanner;
public class Exercicio12 {
    public static void main(String[] args){
        /**12. Criar um vetor A com 10 elementos inteiros. 
         * Implementar um programa que defina e escreva a soma de todos os 
         * elementos armazenados neste vetor.*/
        Scanner scan = new Scanner(System.in);
        int vetA[] = new int[10], soma = 0;

        System.out.println("** Soma dos elementos do VetorA **");
        for (int i = 0; i < vetA.length; i++) {
            System.out.print("Digite a posicao " + (i + 1) + " do vetor A: ");
            vetA[i] =  scan.nextInt();
            soma = soma + vetA[i];      
        }
        System.out.println("A soma dos valores do vetor A eh: " + soma);
    }
}//revisado 03/11/2023