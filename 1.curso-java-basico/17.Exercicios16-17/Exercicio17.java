import java.util.Scanner;
public class Exercicio17 {
    public static void main(String[] args) {
        /**17. Faça um programa que calcule o fatorial de um número inteiro 
         * fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120.*/
        Scanner scan = new Scanner(System.in);
        System.out.print("*** Calculo do Fatorial ***\nDigite o numero para calculo do fatorial: ");
        int numero = scan.nextInt();

        int fatorial = 1;

        for (int i = 1; i <= numero; i++){
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numero + " eh - " + fatorial);
    }    
}//revisado 01/11/2023
