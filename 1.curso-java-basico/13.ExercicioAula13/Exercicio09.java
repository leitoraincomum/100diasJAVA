import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
    /*9. Faça um Programa que peça a temperatura em graus Fahrenheit, 
    transforme e mostre a temperatura em graus Celsius.
    C = 5 * ((F-32) / 9). */
    Scanner scan = new Scanner(System.in);
    double celsius, fahrenheit;
    
    System.out.println("***Conversao de graus Fahrenheit em Celsius***");
    System.out.println("Digite a temperatura em Fahrenheit que quer converter: ");
    fahrenheit = scan.nextDouble();
    celsius = 5 * ((fahrenheit - 32)/9);

    System.out.println(fahrenheit + " graus F convertido eh " + celsius + " graus C");
    }    
}
//revisado em 28/10/2023