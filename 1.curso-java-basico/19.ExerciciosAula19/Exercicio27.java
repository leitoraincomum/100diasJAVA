import java.util.Scanner;
public class Exercicio27{
    public static void main(String[] args){
        /**27.Criar um vetor A com 10 elementos inteiros. 
         * Construir um vetor B de mesmo tipo e tamanho, 
         * obedecendo as seguintes regras de formação:
         * a) Bi deverá receber 'a' quando Ai for menor que 7; 
         * b) Bi deverá receber 'b' quando Ai for igual a 7; 
         * c) Bi deverá receber 'c' quando Ai for maior que 7 e menor que 10; 
         * d) Bi deverá receber 'd' quando Ai for igual a 10; e 
         * e) Bi deverá receber 'e' quando Ai for maior que 10. Sugestão: char B[10]; */
        Scanner scan = new Scanner(System.in);
        int vetA[] = new int[10];
        char vetB[] = new char[vetA.length];

        System.out.println("** Vetores A e B ** \nB recebe: " + 
        "\n'a' quando A for menor que 7, " + 
        "\n'b' quando A for igual a 7" +
        "\n'c' quando A for maior que 7 e menor que 10" + 
        "\n'd' quando A for igual a 10" + 
        "\n'e' quando A for maior que 10");

        for (int i = 0; i < vetA.length; i++) {
            System.out.print("Digite a posicao " + (i + 1) + " do vetor A: ");
            vetA[i] =  scan.nextInt();
            if (vetA[i] < 7){
                vetB[i] = 'a';}
            else if (vetA[i] == 7){
                vetB[i] = 'b';}
            else if (vetA[i] > 7 && vetA[i] < 10){
                vetB[i] = 'c';}
            else if (vetA[i] == 10){
                vetB[i] = 'd';}
            else if (vetA[i] > 10){
                vetB[i] = 'e';}
        }

        System.out.println("\nElementos do vetor A: ");
        for (int i = 0; i < vetA.length; i++){
            System.out.print(vetA[i] + " ");
        }
        System.out.println("\nElementos do vetor B: ");
        for (int i = 0; i < vetB.length; i++){
            System.out.print(vetB[i] + " ");
        }
    }
}//revisado 04/11/2023