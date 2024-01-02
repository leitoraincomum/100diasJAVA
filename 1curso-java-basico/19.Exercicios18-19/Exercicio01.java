import java.util.Scanner;
public class Exercicio01 {
    public static void main(String[] args){
        /** 01. Criar um vetor A com 5 elementos inteiros. Construir um vetor B de 
         * mesmo tipo e tamanho e com os "mesmos" elementos do vetor A, ou seja, 
         * B[i] = A[i].*/
        Scanner scan = new Scanner(System.in);
        double[] temperaturas = new double[365];
        int[] vetA = new int[5], vetB = new int[5];     
        
        System.out.println("** Copiar vetA em vetB **");
        
        for (int i = 0; i < vetA.length; i++) {
            System.out.print("Digite o " + (i + 1) + "o numero do vetor A: ");
            vetA[i] = scan.nextInt();
        } 

        for (int i = 0; i < vetB.length; i++){
            vetB[i] = vetA[i];}
        
        System.out.println("\n*** Elementos vetor A ***");
        for (int i = 0; i < vetA.length; i++){
            System.out.println(" Item " + (i + 1) + " vetor A : " + vetA[i]);
        }

        System.out.println("\n*** Elementos vetor B ***");
        for (int i = 0; i < vetB.length; i++) {
            System.out.print("\n Item " + (i + 1) + " vetor B : " + vetB[i]);
        }
   }
}//revisado 02/11/2023