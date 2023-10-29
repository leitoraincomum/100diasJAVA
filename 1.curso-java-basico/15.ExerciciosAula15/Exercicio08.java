import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        /*8. Faça um programa que pergunte o preço de três produtos 
        e informe qual produto você deve comprar,
        sabendo que a decisão é sempre pelo mais barato.*/
        Scanner scan = new Scanner(System.in);
        System.out.println("** Opcao de compra **\nDigite o preco de tres produtos");
        double preco1 = scan.nextDouble();
        double preco2 = scan.nextDouble();
        double preco3 = scan.nextDouble();

        if((preco1 < preco2) && (preco1 < preco3)){
            System.out.println("O produto que deve ser comprado eh o primeiro com preco R$ " + preco1);
        } else if((preco2 < preco3) && (preco2 < preco1)){
            System.out.println("O produto que deve ser comprado eh o segundo com preco R$ " + preco2);
        } else if((preco3 < preco1) && (preco3 < preco2)){
            System.out.println("O produto que deve ser comprado eh o terceiro com preco R$ " + preco3);
        } 

        /*
        System.out.println("Entre com primeiro preço:");
        double preco1 = scan.nextDouble();
        
        System.out.println("Entre com segundo preço:");
        double preco2 = scan.nextDouble();
        
        System.out.println("Entre com terceiro preço:");
        double preco3 = scan.nextDouble();
        
        if (preco1 <= preco2 && preco1 <= preco3){
            System.out.println("Compre o produto 1");
        } else if (preco2 <= preco1 && preco2 <= preco3){
            System.out.println("Compre o produto 2");
        } else if (preco3 <= preco1 && preco3 <= preco2){
            System.out.println("Compre o produto 3");
        }
        */

    }
    
}//revisão 29/10/2023