import java.util.Scanner;
public class Exercicio15{
    public static void main(String[] args){
        /**15. Criar um vetor A com 10 elementos inteiros. 
         * Desenvolver um programa que defina o percentual de elementos pares e ímpares, 
         * respectivamente, armazenados neste vetor. */
        Scanner scan = new Scanner(System.in);
        int[] vetA = new int[10];
        
        System.out.println("** Qual a porcentagem de numeros pares e impares **");

        for (int i = 0; i < vetA.length; i++){
            System.out.print("Digite a posicao " + (i + 1) + " do vetor A: ");
            vetA[i] = scan.nextInt();
        }
        
        int impar = 0;
        for (int i=0; i < vetA.length; i++){
            if (vetA[i] % 2 != 0){
                impar++;
            }
        }
        
        int par = vetA.length - impar;
        
        //vetorA.length - 100%
        //par           - x
        //= x*vetorA.length == par * 100
        //= x == (par * 100)/vetorA.length

        double porcetagemPar = (par * 100)/vetA.length;
        double porcetagemImpar = 100 - porcetagemPar;
        
        System.out.print("Elementos Vetor A = ");
        for (int i=0; i<vetA.length; i++){
            System.out.print(vetA[i] + " ");
        }
        
        System.out.println("\nA porcentagem de numeros pares eh: " + porcetagemPar + 
        "\nA porcentagem impares eh " + porcetagemImpar);
    }
}//revisado 03/11/2023