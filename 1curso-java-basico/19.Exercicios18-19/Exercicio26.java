import java.util.Scanner;
public class Exercicio26{
    public static void main(String[] args){
        /**26. Criar dois vetores A e B cada um com 10 elementos inteiros. 
         * Construir um vetor C de mesmo tipo e tamanho, obedecendo as seguintes 
         * regras de formação: 
         * a) Ci deverá receber 1 quando Ai for maior que Bi; 
         * b) Ci deverá receber 0 quando Ai for igual a Bi; 
         * c) Ci deverá receber -1 quando Ai for menor que Bi. */
        Scanner scan = new Scanner(System.in);
        int vetA[] = new int[10], vetB[] = new int[vetA.length], vetC[] = new int[vetB.length];
        System.out.println("Vetores A, B e C, onde C recebe \n1 quando A for maior, \n0 quando forem iguais \ne -1 quando A for menor que B");

        for (int i = 0; i < vetA.length; i++) {
            System.out.print("Digite a posicao " + (i + 1) + " do vetor A: ");
            vetA[i] =  scan.nextInt();
        }
        for (int i = 0; i < vetB.length; i++){
            System.out.print("Digite a posicao " + (i + 1) + " do vetor B: ");
            vetB[i] = scan.nextInt();
            if (vetA[i] > vetB[i]){
                vetC[i] = 1;}
            else if (vetA[i] == vetB[i]){
                vetC[i] = 0;}
            else if (vetA[i] <vetB[i]){
                vetC[i] = -1;}
        }


        System.out.println("\nElementos do vetor A: ");
        for (int i = 0; i < vetA.length; i++){
            System.out.print(vetA[i] + " ");
        }
        System.out.println("\nElementos do vetor B: ");
        for (int i = 0; i < vetB.length; i++){
            System.out.print(vetB[i] + " ");
        }
        System.out.println("\nElementos do vetor C: ");
        for (int i = 0; i < vetC.length; i++){
            System.out.print(vetC[i] + " ");
        }
    }
}//revisado 04/11/2023