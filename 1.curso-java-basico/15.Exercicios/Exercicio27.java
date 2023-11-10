import java.util.Scanner;
public class Exercicio27 {
    public static void main(String[] args) {
        /*27. Uma fruteira está vendendo frutas com a seguinte tabela de preços:
                              Até 5 Kg           Acima de 5 Kg
        Morango         R$ 2,50 por Kg          R$ 2,20 por Kg
        Maçã            R$ 1,80 por Kg          R$ 1,50 por Kg
        Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá 
        ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de 
        morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.*/
        Scanner scan = new Scanner(System.in);
        double qtdMorango = 0, qtdMaca = 0, pcKgMorango, pcKgMaca, tMorango, tMaca, pParcial , aPagar;
        System.out.println("** Fruteira **");
        System.out.println("Digite a quantidade de kilos de morango: ");
        qtdMorango = scan.nextDouble();
        if (qtdMorango <=5 ){
            pcKgMorango = 2.5;
        }else{
            pcKgMorango = 2.2;
        }
        tMorango = qtdMorango * pcKgMorango;

        System.out.println("Digite a quantidade de kilos de maca: ");
        qtdMaca = scan.nextDouble();
        if (qtdMaca <=5 ){
            pcKgMaca = 1.8;
        }else{
            pcKgMaca = 1.5;
        }
        tMaca = qtdMaca * pcKgMaca;

        pParcial = tMorango + tMaca;
        aPagar = pParcial;

        if(qtdMorango + qtdMaca > 8 || pParcial > 25){
            aPagar = pParcial - ((pParcial/100) * 10);
        }
        System.out.println("Preco total = " + aPagar);
        /*
          System.out.println("Entre com a quantidade (kg) de morango:");
        double qtdMorango = scan.nextDouble();
        
        System.out.println("Entre com a quantidade (kg) de maça:");
        double qtdMaca = scan.nextDouble();
        
        double precoKgMorango = 0;
        if (qtdMorango <= 5){
           precoKgMorango =  2.5;
        } else {
            precoKgMorango =  2.2;
        }
        
        double precoKgMaca = 0;
        if (qtdMaca <= 5){
            precoKgMaca = 1.8;
        } else {
            precoKgMaca = 1.5;
        }
        
        double precoTotalMorango = qtdMorango * precoKgMorango;
        double precoTotalMaca = qtdMaca * precoKgMaca;
        
        double precoParcial = precoKgMorango + precoKgMaca;
        double precoTotal = precoParcial;
        
        if ((qtdMorango + qtdMaca > 8) || precoParcial > 25){
            precoTotal = precoParcial - ((precoParcial / 100) * 10);
        }
        
        System.out.println("Preco total = " + precoTotal);
         */
    }
    
}//revisão 29/10/2023
