import java.util.Scanner;
public class Exercicio06 {
    public static void main(String[] args){
        //6. Faça um Programa que leia três números e mostre o maior deles.
        Scanner scan = new Scanner(System.in);
        System.out.println("** Exiba o maior numero **\nDigite tres numeros");
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
/* 
 System.out.println("Entre com primeiro número:");
        int num1 = scan.nextInt();
        
        System.out.println("Entre com segundo número:");
        int num2 = scan.nextInt();
        
        System.out.println("Entre com terceiro número:");
        int num3 = scan.nextInt();
        
        if (num1 >= num2 && num1 >= num3){
            System.out.println("num1 é maior: " + num1);
        } else if (num2 >= num1 && num2 >= num3){
            System.out.println("num2 é maior: " + num2);
        } else if (num3 >= num1 && num3 >= num2){
            System.out.println("num3 é maior: " + num3);
        } 
*/
        
    }    
}// revisado 29/10/2023
