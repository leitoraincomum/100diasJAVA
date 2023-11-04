import java.util.Scanner;
public class Exercicio14 {
    public static void main(String[] args){
        /**14. Criar um vetor A com 10 elementos inteiros. 
         * Implementar um programa que defina e escreva a média aritmética simples 
         * dos elementos ímpares armazenados neste vetor. */
        Scanner scan = new Scanner(System.in);
        int vetA[] = new int[10], somaImp = 0, qtdImp = 0, mediaImpares;
        
        System.out.println("** Quais elementos do vetor sao multiplos de 5 **");
        for (int i = 0; i < vetA.length; i++) {
            System.out.print("Digite a posicao " + (i + 1) + " do vetor A: ");
            vetA[i] =  scan.nextInt();
            if (vetA[i] % 2 == 1) {
                somaImp = somaImp + vetA[i];
                qtdImp++;
            }
        }
        mediaImpares = somaImp/qtdImp;
        System.out.println("A media dos numeros que sao impares eh igual a " + mediaImpares);
    }
}//revisado 03/11/2023