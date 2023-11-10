import java.util.Scanner;
public class Exercicio26 {
    public static void main(String[] args) {
        /*26. Um posto está vendendo combustíveis com a seguinte tabela de descontos:
        Alcool:
        - até 20 litros, desconto de 3% por litro
        - acima de 20 litros, desconto de 5% por litro
        Gasolina:
        - até 20 litros, desconto de 4% por litro
        - acima de 20 litros, desconto de 6% por litro 
        Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível
        (codificado da seguinte forma: A-álcool, G-gasolina),
        calcule e imprima o valor a ser pago pelo cliente 
        sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço do litro do álcool é R$ 1,90.*/
        Scanner scan = new Scanner(System.in);
        double qtdLitros,vCobrado,vTotal, pDesconto;
        String tCombustivel;

        System.out.println("** Desconto combustivel ** \nDigite quantos litros de combustivel foram vendidos: ");
        qtdLitros = scan.nextDouble();
        System.out.println("Digite qual o tipo de combustivel: \nA - alcool ou G - gasolina");
        tCombustivel = scan.next();
        tCombustivel = tCombustivel.toUpperCase();

        switch(tCombustivel){
            case "A":
            vTotal = 1.90 * qtdLitros;
            if (qtdLitros <=20){
                pDesconto = vTotal * 0.03;
                vCobrado = vTotal - pDesconto;
                System.out.println("Valor cobrado eh R$ " + vCobrado);
            }else{
                pDesconto = vTotal * 0.05;
                vCobrado = vTotal - pDesconto;
                System.out.println("Valor cobrado eh R$ " + vCobrado);
            }
            break;
            case "G":
            vTotal = 2.50 * qtdLitros;
            if (qtdLitros <=20){
                pDesconto = vTotal * 0.04;
                vCobrado = vTotal - pDesconto;
                System.out.println("Valor cobrado eh R$ " + vCobrado);
            }else{
                pDesconto = vTotal * 0.06;
                vCobrado = vTotal - pDesconto;
                System.out.println("Valor cobrado eh R$ " + vCobrado);
            }
            break;
            default: System.out.println("Tipo de combustivel invalido");
        }
        /*
         System.out.println("Entre com a qtd de litros vendidos");
        double litros = scan.nextDouble();
        
        System.out.println("Entre com o tipode combustível");
        String tipo = scan.next();
        
        double precoGas = 2.5;
        double precoAlc = 1.9;
        int percDesconto = 0;
        double total = 0;
        double totalDesc = 0;
        
        if (tipo.equalsIgnoreCase("a")){
            
            if (litros <= 20){
                percDesconto = 3;
            } else {
                percDesconto = 5;
            }
            
            total = litros * precoAlc;
            
        } else if (tipo.equalsIgnoreCase("g")){
            
            if (litros <= 20){
                percDesconto = 4;
            } else {
                percDesconto = 6;
            }
            
            total = litros * precoGas;
        }
        
        totalDesc = (total / 100) * percDesconto;
        
        double precoAPagar = total - totalDesc;
        
        System.out.println("Valor a ser pago: " + precoAPagar);
         */

    }
    
}//revisão 29/10/2023
