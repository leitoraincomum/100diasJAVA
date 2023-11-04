import java.util.Scanner;
public class Exercicio16{
    public static void main(String[] args){
        /**16. Criar um vetor A com 10 elementos inteiros. 
         * Escrever um programa que calcule e escreva: 
         * a) a soma de elementos armazenados neste vetor que são inferiores a 15; 
         * b) a quantidade de elementos armazenados no vetor que são iguais a 15; e
         * c) a média dos elementos armazenados no vetor que são superiores a 15.*/

        Scanner scan = new Scanner(System.in);
        int vetA[] = new int[10], somaMenor15 = 0, somaMaior15 = 0, somaIgual15 = 0, qtdMaior = 0;
        
        System.out.println("** Elementos maiores, menores ou iguais a 15 **");
        for (int i = 0; i < vetA.length; i++) {
            System.out.print("Digite a posicao " + (i + 1) + " do vetor A: ");
            vetA[i] =  scan.nextInt();
            if (vetA[i] < 15 ) {
                somaMenor15 = somaMenor15 + vetA[i];
            }
            if (vetA[i] == 15 ) {
                somaIgual15++; 
            }
            if (vetA[i] > 15 ) {
                somaMaior15 = somaMaior15 + vetA[i];
                qtdMaior++; 
            }
        }
        System.out.println("A soma dos elementos inferiores a 15 eh " + somaMenor15 + 
        "\nA quantidade de elementos iguais a  15 eh " + somaIgual15 + 
        "\nMedia dos numeros que sao maiores que 15 eh " + (somaMaior15/qtdMaior));
    }
}//revisado 03/11/2023