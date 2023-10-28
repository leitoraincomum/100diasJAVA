import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        /*10. Faça um Programa que peça a temperatura em graus Celsius,
         transforme e mostre em graus Fahrenheit. */
         Scanner scan = new Scanner(System.in);
         double celsius,fahrenheit;
         
         System.out.println("*** Conversao de graus Celsius em Fahrenheit ***");
         System.out.println("Digite a temperatura em Celsius que quer converter: ");
         celsius = scan.nextDouble();

         fahrenheit = (9 * celsius + 160)/5;

         System.out.println(celsius + " graus C convertido eh " + fahrenheit + " graus F");
    }
}
//revisado em 28/10/2023