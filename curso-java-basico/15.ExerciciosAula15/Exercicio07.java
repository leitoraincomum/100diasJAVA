import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        /*7. Faça um Programa que leia três números 
        e mostre o maior e o menor deles.*/
        Scanner scan = new Scanner(System.in);
        System.out.println("** Exiba o maior e menor numero **\nDigite tres numeros");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        double num3 = scan.nextDouble();
        
        if((num1 > num2) && (num1 > num3)){
            System.out.println("O maior numero digitado foi: " + num1);
        } else if((num2 > num3) && (num2 > num1)){
            System.out.println("O maior numero digitado foi: " + num2);
        } else if((num3 > num1) && (num3 > num2)){
            System.out.println("O maior numero digitado foi: " + num3);
        }

        if((num1 < num2) && (num1 < num3)){
            System.out.println("O menor numero digitado foi: " + num1);
        } else if((num2 < num3) && (num2 < num1)){
            System.out.println("O menor numero digitado foi: " + num2);
        } else if((num3 < num1) && (num3 < num2)){
            System.out.println("O menor numero digitado foi: " + num3);
        } 
    }
}
