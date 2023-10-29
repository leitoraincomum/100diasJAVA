import java.util.Scanner;
public class Exercicio22{
    public static void main(String[] args) {
        /*22. Faça um Programa que peça um número inteiro e determine se ele é par ou impar. 
        Dica: utilize o operador módulo (resto da divisão).*/
        Scanner scan = new Scanner(System.in);
        System.out.println("** Par ou Impar? ** \nDigite um numero inteiro: ");
        int numero = scan.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Eh um numero par!!");
        }else {
            System.out.println("Eh um numero impar!!");
        }
    }
}// revisado 29/10/2023