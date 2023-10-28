import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        //5. Faça um Programa que converta metros para centímetros.
        Scanner scan = new Scanner(System.in);
        double metros, centimetros;

        System.out.println("****** Conversao de metros para centimetros ******");
        System.out.println("Digite o valor em metros que quer converter: ");
        metros = scan.nextDouble();

        centimetros = metros * 100;

        System.out.println(metros + " em centimetros eh igual a : " + centimetros);

    }
    
}
//revisado em 28/10/2023