import java.util.Scanner;
public class Exercicio17 {
    public static void main(String[] args) {
        /*17. Faça um Programa que peça um número correspondente a um determinado ano 
        e em seguida informe se este ano é ou não bissexto.*/
        Scanner scan = new Scanner(System.in);
        System.out.println("** Ano bissexto ** \nDigite o ano que quer saber se eh bissexto:");
        int ano = scan.nextInt();

        if((ano % 400 == 0) || (ano % 4 == 0) && (ano % 100 != 0)){
			System.out.println(ano + " eh um ano bissexto!");
		}
		else{
            System.out.println(ano + " nao eh um ano bissexto!");
        }
		
    }
}// revisado 29/10/2023
