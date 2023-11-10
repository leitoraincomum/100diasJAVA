import java.util.Scanner;
public class Exercicio35{
    public static void main(String[] args){
        /**35. Criar um vetor A com 10 elementos inteiros. 
         * Escreva um programa que imprima cada elemento do vetor A e 
         * a relação de todos os divisores do respectivo elemento. */
        Scanner scan = new Scanner(System.in);
        int[] vetA = new int[10];
        System.out.println("** Numeros divisores em relacao ao numero digitado **");
        
        for (int i = 0; i < vetA.length; i++){
            System.out.print("Digite a posicao " + (i + 1) + " do vetor A: ");
            vetA[i] = scan.nextInt();
        }
        
        for (int i = 0; i < vetA.length; i++){
            System.out.println("\nAnalizando divisores em relacao 0 e ao numero " + vetA[i]);
            
            for (int j = 1; j < vetA[i]; j++){
                if (vetA[i] % j == 0){
                    System.out.println(j + ": eh divisor");
                }
            }
        }
    }
}//revisado 06/11/2023 (equivalente ao dia 05/11/2023 pois faltou luz)