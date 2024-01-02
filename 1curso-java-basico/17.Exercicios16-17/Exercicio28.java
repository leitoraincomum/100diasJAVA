import java.util.Scanner;
public class Exercicio28 {
    public static void main(String[] args) {
        /**28. Faça um programa que calcule o valor total investido 
         * por um colecionador em sua coleção de CDs e o valor médio 
         * gasto em cada um deles. O usuário deverá informar a 
         * quantidade de CDs e o valor para em cada um.*/
        Scanner scan = new Scanner(System.in);
        System.out.println("** Media gasta com CDs **");
        System.out.print("Digite a quantidade de CDs: ");
        int qtdCD = scan.nextInt();
        double preco, soma = 0;

        for (int i = 0; i < qtdCD; i++) {
            System.out.print("Digite o valor do " + (i + 1) + "o CD: ");
            preco = scan.nextInt();
            soma += preco;
        }
        
        double mediaPrecos = soma/qtdCD;
        System.out.println("A media de preco dos CDs : " + mediaPrecos);
    }    
}//revisado 01/11/2023
