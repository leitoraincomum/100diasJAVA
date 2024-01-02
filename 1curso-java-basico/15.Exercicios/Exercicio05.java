import java.util.Scanner;
public class Exercicio05 {
    public static void main(String[] args) {
        /*5. Faça um programa para a leitura de duas notas parciais de um aluno.
        O programa deve calcular a média alcançada por aluno e apresentar:
        - A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
        - A mensagem "Reprovado", se a média for menor do que sete;
        - A mensagem "Aprovado com Distinção", se a média for igual a dez.*/
        Scanner scan = new Scanner(System.in);
        System.out.println("** Media de notas \nDigite as duas notas**");
        double nota1 = scan.nextDouble();
        double nota2 = scan.nextDouble();
        double media = (nota1 + nota2)/2;

        if (media == 10){
            System.out.println("Aprovado com distincao");
        } else if (media >= 7){
            System.out.println("Aprovado " + media);
        } else {
            System.out.println("Reprovado " + media);           
        }
    }
}// revisado 29/10/2023
