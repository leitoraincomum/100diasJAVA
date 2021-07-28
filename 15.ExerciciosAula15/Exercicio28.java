import java.util.Scanner;
public class Exercicio28 {
    public static void main(String[] args) {
        /*28. O Hipermercado Tabajara está com uma promoção de carnes que é imperdível. Confira:
                              Até 5 Kg           Acima de 5 Kg
        File Duplo      R$ 4,90 por Kg          R$ 5,80 por Kg
        Alcatra         R$ 5,90 por Kg          R$ 6,80 por Kg
        Picanha         R$ 6,90 por Kg          R$ 7,80 por Kg
        - Para atender a todos os clientes, cada cliente poderá levar apenas um dos tipos de carne 
        da promoção, porém não há limites para a quantidade de carne por cliente. Se compra for feita
        no cartão Tabajara o cliente receberá ainda um desconto de 5% sobre o total da compra. 
        Escreva um programa que peça o tipo e a quantidade de carne comprada pelo usuário e 
        gere um cupom fiscal, contendo as informações da compra: tipo e quantidade de carne, 
        preço total, tipo de pagamento, valor do desconto e valor a pagar. */
        Scanner scan = new Scanner(System.in);
        System.out.println("** Tabajara desconto carne \nEntre com o tipo da carne" + 
        "\n1 - File Duplo \n2 - Alcatra \n3 - Picanha");
        int tipo = scan.nextInt();

        System.out.println("Entre com a quantidade em quilo de carne: ");
        double qtdCarne = scan.nextDouble();
        double vTotal = 0, desconto;

        switch(tipo){
            case 1:
            if (qtdCarne <=5){
                vTotal = qtdCarne * 4.9;
            }else{
                vTotal = qtdCarne * 5.8;}
            break;
            case 2:
            if (qtdCarne <=5){
                vTotal = qtdCarne * 5.9;
            }else{
                vTotal = qtdCarne * 6.8;}
            break;
            case 3:
            if (qtdCarne <=5){
                vTotal = qtdCarne * 6.9;
            }else{
                vTotal = qtdCarne * 7.8;}
            break;
            default: System.out.println("Tipo de carne invalida!");
        }

        System.out.println("O valor parcial eh " + vTotal);
        System.out.println("Sera pago no cartao da loja?\n1 - Sim \n2 - Nao");
        int cartao = scan.nextInt();

        if (cartao == 1) {
            desconto = (vTotal/100) * 5;
            System.out.println("Desconto de R$ " + desconto);
            System.out.println("Valor a pagar R$ " + (vTotal - desconto));
        }else{
            System.out.println("Valor a pagar R$ " + vTotal);
        }
    }
}
