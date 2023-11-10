import java.util.Scanner;
public class Exercicio36{
    public static void main(String[] args){
        /**36. Criar um vetor A com 11 elementos, indexados de 0 até 10. 
         * Sendo que cada elemento do vetor A é formado pela potência de base 2 
         * elevado ao expoente igual a posição do respectivo elemento, ou seja: 
         * A[i] = 2i. Sugestão int A[11]; */
        Scanner scan = new Scanner(System.in);
        double[] vetA = new double[11];
        System.out.println("*** Vetor A equivalente a 2 elevado a i ***");
        
        for (int i = 0; i < vetA.length; i++){
            vetA[i] = Math.pow(2, i);
        }

        System.out.println("\nElementos do vetor A: ");
        for (int i = 0; i < vetA.length; i++){
            System.out.print(vetA[i] + " ");
        }
    }
}//revisado 06/11/2023 (equivalente ao dia 05/11/2023 pois faltou luz)