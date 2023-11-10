import java.util.Scanner;
public class Exercicio25{
    public static void main(String[] args){
        /**25. Criar um vetor A com 10 elementos inteiros. 
         * Construir um vetor B de mesmo tipo e tamanho, 
         * obedecendo as seguintes regras de formação: 
         * a) Bi deverá receber 1 quando Ai for par; 
         * b) Bi deverá receber 0 quando Ai for ímpar. */
        Scanner scan = new Scanner(System.in);
        int vetA[] = new int[10], vetB[] = new int[10];

        System.out.println("** Vetor B recebe 1 se par e 0 se impar em Vetor A **");
        for (int i = 0; i < vetA.length; i++){
            System.out.print(" Digite o valor da posicao " + (i + 1) + " do vetor: ");
            vetA[i] =  scan.nextInt();
            /*ternario do bloco abaixo:
             vetorB[i] = (vetorA[i] % 2 == 0) ? 1 : 0)*/
            if (vetA[i] % 2 == 0){
                vetB[i] =  1;
            }else{
                vetB[i] = 0;
            }
        }

        System.out.println("\n** Elementos do vetor A **");
        for (int i = 0; i < vetA.length; i++){
            System.out.print(vetA[i] + " ");
        }
        System.out.println("\n** Elementos do vetor B **");
        for (int i = 0; i < vetB.length; i++){
            System.out.print(vetB[i] + " ");
        }
    }
}//revisado 04/11/2023