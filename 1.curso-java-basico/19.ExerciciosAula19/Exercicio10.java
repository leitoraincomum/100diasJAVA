import java.util.Scanner;
public class Exercicio10 {
    public static void main(String[] args){
        /**10. Criar um vetor A com 10 elementos inteiros. 
         * Construir um vetor B de mesmo tipo e tamanho, sendo que cada 
         * elemento do vetor B deverá ser o resto da divisão do respectivo 
         * elemento de A por 2 (dois), ou seja: B[i] := A[i] % 2 */
        Scanner scan = new Scanner(System.in);
        int vetA[] = new int[10], vetB[] = new int[vetA.length];
        
        System.out.println("** Divisao dos Vetores A e B **");
        System.out.println("\n** Digite os valores do vetor A **");
        for (int i = 0; i < vetA.length; i++) {
            System.out.print("Digite a posicao " + (i + 1) + " do vetor A: ");
            vetA[i] =  scan.nextInt();
            vetB[i] = vetA[i] % 2 ;
        }

        System.out.println("\n** Digite os valores do vetor B **");
        System.out.println("\n** Elementos vetor B **");
        for (int i = 0; i < vetB.length; i ++){
            System.out.println("A posicao " + (i + 1) + " do vetor B eh : " + vetB[i]);
        }
    }
}//revisado 02/11/2023
