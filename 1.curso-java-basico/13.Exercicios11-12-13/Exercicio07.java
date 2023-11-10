import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        /*7. Faça um Programa que calcule a área de um quadrado, 
        em seguida mostre o dobro desta área para o usuário.*/
        Scanner scan = new Scanner(System.in);
        double lado, area, areaDobro;

        System.out.println("**** Dobro da area do quadrado ****");
        System.out.println("Digite o valor de um lado do quadrado: ");
        lado = scan.nextDouble();
        //lado elevado ao quadradow
        area = Math.pow(lado, 2);
        
        areaDobro = area * 2;

        System.out.println("O valor da area do quadrado eh: " + area);
        System.out.println("O valor do dobro da area do quadrado eh: " + areaDobro);

    } 
}
//revisado em 28/10/2023