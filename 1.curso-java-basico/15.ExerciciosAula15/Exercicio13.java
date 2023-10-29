import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        /*13. Faça um Programa que leia um número e exiba o dia correspondente da semana. 
        (1-Domingo, 2- Segunda, etc.), 
        se digitar outro valor deve aparecer valor inválido.*/
        Scanner scan = new Scanner(System.in);
        System.out.println("** Dia da semana **\nDigite qual dia quer saber de 1 a 7: ");
        int dia = scan.nextInt();

        switch (dia){
            case 1: 
            System.out.println("1 - Domingo"); 
            break;
            case 2: 
            System.out.println("2 - Segunda");
            break;
            case 3: 
            System.out.println("3 - Terca");
            break;
            case 4: 
            System.out.println("4 - Quarta");
            break;
            case 5: 
            System.out.println("5 - Quinta");
            break;
            case 6:
            System.out.println("6 - Sexta");
            break;
            case 7:
            System.out.println("7 - Sabado");
            break;
            default:
            System.out.println("Valor invalido");
        }
    }
}//revisado 29/10/2023