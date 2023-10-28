import java.util.Scanner;
public class Exercicio15 {
    public static void main(String[] args){
        /*15.Faça um Programa que pergunte quanto você ganha por hora
        e o número de horas trabalhadas no mês. 
        Calcule e mostre o total do seu salário no referido mês, 
        sabendo-se que são descontados 11% para o Imposto de Renda, 
        8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
        - salário bruto.
        - quanto pagou ao INSS.
        - quanto pagou ao sindicato.
        - o salário líquido.
        calcule os descontos e o salário líquido, conforme a tabela abaixo:
        + Salário Bruto : R$
        - IR (11%) : R$
        - INSS (8%) : R$
        - Sindicato ( 5%) : R$
        = Salário Liquido : R$
        Obs.: Salário Bruto - Descontos = Salário Líquido. */
        Scanner scan = new Scanner(System.in);
        double valorHora, qtdHoras, sBruto,
        sLiquido, iRenda, iNSS, sindicato, tDescontos;

        System.out.println("** Calculo de Salario **");
        System.out.println("Digite o valor da hora trabalhada: ");
        valorHora = scan.nextDouble();
        System.out.println("Digite a quantidade de horas trabalhadas no mes: ");
        qtdHoras = scan.nextDouble();
        
        sBruto = valorHora *qtdHoras;

        iRenda = sBruto * 0.11;
        iNSS = sBruto * 0.08;
        sindicato = sBruto * 0.05;
        tDescontos = iRenda + iNSS + sindicato;

        sLiquido = sBruto - tDescontos;
        /*- salário bruto.
        - quanto pagou ao INSS.
        - quanto pagou ao sindicato.
        - o salário líquido.*/

        System.out.println("O valor do salario bruto eh R$ " + sBruto + 
        "\nO valor do salario liquido eh R$ " + sLiquido + 
        "\nTendo o total de descontos de R$ "+ tDescontos + 
        "\nSendo R$ " + iNSS + " de INSS,  R$ " + iRenda + 
        " de imposto de renda e R$ " + " e R$ " + sindicato + 
        " de contribuicao sindical");
    }
    
}
//revisado em 28/10/2023