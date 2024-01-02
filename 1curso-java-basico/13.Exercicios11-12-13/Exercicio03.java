import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        //3. Faça um Programa que peça dois números e imprima a soma.
        Scanner scan = new Scanner(System.in);
        int num1, num2, soma;

        System.out.println("Digite dois numeros para a soma: ");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        soma = num1 + num2;

        System.out.println("O resultado da soma de " + num1 + " e " + num2 + " eh: " + soma);
    }
    
}
//revisado em 28/10/2023