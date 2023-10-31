import java.util.Scanner;

public class Exercicio01{
    public static void main(String[] args) {
        //1. Faça um Programa que peça dois números e imprima o maior deles.
        Scanner scan = new Scanner(System.in);
        int num1, num2;
        System.out.println("** Exibir maior numero **\nDigite dois numeros: ");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        if (num1 > num2){
            System.out.println("O maior numero digitado foi: " + num1);
        }else if (num2 > num1){
            System.out.println("O maior numero digitado foi: " + num2);
        } else {// além do solicitado
            System.out.println("Os numeros digitados sao iguais");
        }
    }  
}//revisado 29/10/2023