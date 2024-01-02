import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //4. Faça um Programa que peça as 4 notas bimestrais e mostre a média.
        double nota1, nota2, nota3, nota4, media;

        System.out.println("Digite as quatro notas para calcular a media: ");
        nota1 = scan.nextDouble();
        nota2 = scan.nextDouble();
        nota3 = scan.nextDouble();
        nota4 = scan.nextDouble();

        media = (nota1 + nota2 + nota3 + nota4)/4;

        System.out.println("A media das notas digitadas eh: " +  media);
    }
}
//revisado em 28/10/2023