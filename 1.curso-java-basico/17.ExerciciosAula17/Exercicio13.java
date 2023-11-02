import java.util.Scanner;
public class Exercicio13 {
    public static void main(String[] args) {
        /*13. Faça um programa que peça dois números, base e expoente, 
        calcule e mostre o primeiro número elevado ao segundo número. 
        Não utilize a função de potência da linguagem.*/
        Scanner scan = new Scanner(System.in);

        System.out.println("** Calculo de potencia **");
        System.out.print("Digite o numero da base: ");
        int base = scan.nextInt();

        System.out.print("Digite o numero do expoente: ");
        int expoente = scan.nextInt();

        int calculo = 1;

        for (int i = 0; i < expoente; i++) {
            calculo *= base;
        }

        System.out.println("Resultado: " + calculo);
    }    
}//revisado 01/11/2023
