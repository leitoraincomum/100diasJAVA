import java.util.Scanner;
public class Exercicio24 {
    public static void main(String[] args) {
        /**24. Faça um programa que calcule o mostre a média aritmética de N notas.*/
        Scanner scan = new Scanner(System.in);
        System.out.println("** Media das notas **");
        System.out.print("Digite quantas notas serao digitadas: ");
        int qtdNotas = scan.nextInt();
        int nota;
        double soma = 0;

        for (int i = 0; i < qtdNotas; i++){
            System.out.print("Digite a " + (i + 1) + "a nota: ");
            nota = scan.nextInt();
            soma +=nota;
        }

        System.out.print("Soma das notas digitadas: " + soma);
        double media = soma/qtdNotas;
        System.out.print("\nMedia das notas: " + media);
    }
    
}//revisado 01/11/2023