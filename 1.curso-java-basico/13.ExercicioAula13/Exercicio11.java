import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        /*11. Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
        a. o produto do dobro do primeiro com metade do segundo .
        b. a soma do triplo do primeiro com o terceiro.
        c. o terceiro elevado ao cubo. */
        Scanner scan = new Scanner(System.in);
        int int1, int2;
        double real, prodDobro,somaTriplo, terceiroCubo;

        System.out.println("*** Calculos ");
        System.out.println("Digite dois numeros inteiros: ");
        int1 = scan.nextInt();
        int2 = scan.nextInt();

        prodDobro = (int1 * 2) * (int2/2);

        System.out.println("Digite um numero qualquer: ");
        real = scan.nextDouble();

        somaTriplo = (int1 * 3) + real;
        terceiroCubo = Math.pow(real,3);

        System.out.println("Resultados: \nO produto do dobro do primeiro com metade do segundo: " + prodDobro);
        System.out.println("A soma do triplo do primeiro com o terceiro: " + somaTriplo);
        System.out.println("O terceiro elevado ao cubo: " + terceiroCubo);

    }
    
}
//revisado em 28/10/2023