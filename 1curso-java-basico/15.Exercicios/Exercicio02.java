import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args){
        //2. Faça um Programa que peça um valor 
        //e mostre na tela se o valor é positivo ou negativo.
        Scanner scan = new Scanner(System.in);
        System.out.println("** Numero negativo ou positivo ** \nDigite um numero: ");
        int num = scan.nextInt();
        if(num >= 0){
            System.out.println("O numero digitado: " + num + " eh positivo");
        } else {
            System.out.println("O numero digitado: " + num + " eh negativo");
        }
    }
}// Revisado em 29/10/2023
