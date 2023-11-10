import java.util.Scanner;
public class Exercicio12 {
    public static void main(String[] args) {
        /*12. Tendo como dados de entrada a altura de uma pessoa, 
        construa um algoritmo que calcule seu peso ideal, 
        usando a seguinte fórmula: (72.7*altura) - 58` */
        Scanner scan = new Scanner(System.in);
        double altura,pIdeal;

        System.out.println("** Calculo peso ideal **");
        System.out.println("Digite a sua altura: ");
        altura = scan.nextDouble();

        pIdeal = (72.7 * altura) - 58;

        System.out.println("Seu peso ideal eh: " + pIdeal);
    }
    
}
//revisado em 28/10/2023