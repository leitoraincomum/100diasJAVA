
import java.util.Scanner;
public class Exercicio14 {
    public static void main(String[] args) {
        /**14. Faça um programa que peça 10 números inteiros, calcule e mostre 
        a quantidade de números pares e a quantidade de números impares. */
        Scanner scan = new Scanner(System.in);
        System.out.println("** Soma de pares e impares **");
        int impar = 0, par = 0, num;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "o numero: ");
            num = scan.nextInt();

            if(num%2 == 0) {
                par ++;
            } else {
                impar++;
            }
        }

        System.out.println("Foram digitados " + par + " pares e " + impar + " impares!");
    }    
}//revisado 01/11/2023
