import java.util.Scanner;
public class Exercicio43 {
    public static void main(String[] args) {
        /**43. O cardápio de uma lanchonete é o seguinte:
        Especificação   Código  Preço
        Cachorro Quente 100     R$ 1,20
        Bauru Simples   101     R$ 1,30
        Bauru com ovo   102     R$ 1,50
        Hambúrguer      103     R$ 1,20
        Cheeseburguer   104     R$ 1,30
        Refrigerante    105     R$ 1,00
        Faça um programa que leia o código dos itens pedidos e as quantidades desejadas. 
        Calcule e mostre o valor a ser pago por item (preço * quantidade) e o total geral 
        do pedido. Considere que o cliente deve informar quando o pedido deve ser encerrado. */
        Scanner scan = new Scanner(System.in);
        System.out.println("** Cardapio Lanchonete **" + 
        "\nCachorro Quente 100     R$ 1,20" +
        "\nBauru Simples   101     R$ 1,30" +
        "\nBauru com ovo   102     R$ 1,50" +
        "\nHamburguer      103     R$ 1,20" +
        "\nCheeseburguer   104     R$ 1,30" +
        "\nRefrigerante    105     R$ 1,00");
        
        boolean naoTerminar = true;
        int cod, qtd;
        double total = 0;
        String output = "";
        
        do {
            
            System.out.print("Digite o codigo do produto e a quantidade.\n(Ou digite 0 0 para sair): ");
            cod = scan.nextInt();
            qtd = scan.nextInt();
            
            if (cod == 0 && qtd == 0){
                naoTerminar = false;
                output += "Total a pagar: R$ " + total;
            } else {
                switch (cod){
                case 100:
                    output += "Cachorro Quente -> 1,20 * " + qtd ;
                    output += " = " + (1.2 * qtd) + "\n";
                    total += 1.2 * qtd;
                    break;
                case 101:
                    output += "Bauru Simples -> 1,30 * " + qtd ;
                    output += " = " + (1.3 * qtd) + "\n";
                    total += 1.3 * qtd;
                    break;
                case 102:
                    output += "Bauru com ovo -> 1,50 * " + qtd ;
                    output += " = " + (1.5 * qtd) + "\n";
                    total += 1.5 * qtd;
                    break;
                case 103:
                    output += "Hambúrguer -> 1,20 * " + qtd ;
                    output += " = " + (1.2 * qtd) + "\n";
                    total += 1.2 * qtd;
                    break;
                case 104:
                    output += "Cheeseburguer -> 1,30 * " + qtd ;
                    output += " = " + (1.3 * qtd) + "\n";
                    total += 1.3 * qtd;
                    break;
                case 105:
                    output += "Refrigerante -> 1,00 * " + qtd ;
                    output += " = " + (1 * qtd) + "\n";
                    total += 1 * qtd;
                    break;
                default:
                    System.out.println("Codigo invalido, tente novamente!");
                }
            }
            
        }while(naoTerminar);
        
        System.out.println(output);
    }    
}//revisado 01/11/2023
