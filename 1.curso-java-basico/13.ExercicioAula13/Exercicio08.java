import java.util.Scanner;

public class Exercicio08{
    public static void main(String[] args) {
        /*8. Faça um Programa que pergunte quanto você ganha
        por hora e o número de horas trabalhadas no mês. 
        Calcule e mostre o total do seu salário no referido mês.*/
        Scanner scan = new Scanner(System.in);
        double valorHora, valorTotal, qtdHoras;

        System.out.println("*** Valor de horas trabalhadas/mês ***");
        System.out.println("Digite o valor ganho por hora trabalhada: ");
        valorHora = scan.nextDouble();
        System.out.println("Digite a quantidade de horas trabalhada no mês: ");
        qtdHoras = scan.nextDouble();

        valorTotal = valorHora * qtdHoras;

        System.out.println("O valor do salario eh: " + valorTotal);
    }
}
//revisado em 28/10/2023