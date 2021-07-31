import java.util.Scanner;
public class Exercicio08 {
    public static void main(String[] args) {
        //8. Faça um programa que leia 5 números e informe a soma e a média dos números.
        Scanner scan = new Scanner(System.in);
        int num, maior = Integer.MIN_VALUE;
        double soma = 0;
        System.out.println("** Ler 5 numeros, mostrar soma e media **");

        for (int i = 1; i < 6; i++) {
            System.out.print("Digite o " + i + "o numero : ");
            num = scan.nextInt();
            soma = soma + num;

            if (num > maior) {
                maior = num;
            }
        }

        System.out.println("O maior numero digitado foi: " + maior + "\nA soma deles eh: " + soma + 
        "\nA media deles eh: " + soma/2);
    }
    
}
