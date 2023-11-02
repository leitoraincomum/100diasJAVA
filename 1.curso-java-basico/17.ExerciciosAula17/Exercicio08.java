import java.util.Scanner;
public class Exercicio08 {
    public static void main(String[] args) {
        //8. Faça um programa que leia 5 números e informe a soma e a média dos números.
        Scanner scan = new Scanner(System.in);
        int num, soma = 0;
        double media;
        System.out.println("** Ler 5 numeros, mostrar soma e media **");

        for (int i = 1; i < 6; i++) {
            System.out.print("Digite o " + i + "o numero : ");
            num = scan.nextInt();
            soma += num;
        }

        media = soma/5;

        System.out.println("A soma dos numeros digitados eh: " + soma + 
        "\nA media deles eh: " + media);
    }
    
}//revisado 31/10/2023
