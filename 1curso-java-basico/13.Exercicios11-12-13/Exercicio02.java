import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        /*2. Faça um Programa que peça um número e 
        então mostre a mensagem "O número informado foi [número]."*/
        Scanner scan = new Scanner(System.in);
        int numero;

        System.out.println("Digite um numero: ");
        numero = scan.nextInt();

        System.out.println("O numero informado foi: " + numero);

    }
}
//revisado em 28/10/2023