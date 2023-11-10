import java.util.Scanner;
public class Exercicio06 {
    public static void main(String[] args) {
        /*6. Faça um Programa que peça o raio de um círculo,
         calcule e mostre sua área.*/
         Scanner scan = new Scanner(System.in);
         double raio, area;

         System.out.println("**** Area do Circulo ****");
         System.out.println("Digite o valor do raio: ");
         raio = scan.nextDouble();

         area = 3.1415 * raio * raio;

         System.out.println("O valor da area do circulo eh: " + area);
    }
    
}
//revisado em 28/10/2023