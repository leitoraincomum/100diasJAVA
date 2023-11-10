import java.util.Scanner;
import java.util.zip.Deflater;

public class Exercicio11 {
    public static void main(String[] args) {
        /*11. As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contraram para desenvolver o programa que calculará os reajustes.
        Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:
        - salários até R$ 280,00 (incluindo) : aumento de 20%
        - salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
        - salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
        - salários de R$ 1500,00 em diante : aumento de 5% Após o aumento ser realizado, informe na tela:
        - o salário antes do reajuste;
        - o percentual de aumento aplicado;
        - o valor do aumento;
        - o novo salário, após o aumento.*/
        Scanner scan = new Scanner(System.in);
        System.out.println("** Aumento de Salario Tabajara **"  + 
        "\nDigite o salario do colaborador: ");
        double salario = scan.nextDouble();
        int caso = 0;
        
        if (salario <=280){
            caso = 1;
        }else if (salario > 280 && salario <= 700){
            caso = 2;
        }else if (salario > 700 && salario <= 1500){
            caso = 3;
        }else if (salario > 1500){
            caso = 4;
        }

        switch (caso) {
            case 1:
            System.out.println("O salario anterior de R$ " + salario + 
            "\nReajuste de 20% que equivaleu a R$ " + (salario * 0.20) +
            "\nSalario novo R$ " + salario * 1.20);
            break;
            case 2:
            System.out.println("O salario anterior de R$ " + salario + 
            "\nReajuste de 15% que equivaleu a R$ " + (salario * 0.15) +
            "\nSalario novo R$ " + salario * 1.15);
            break;
            case 3:
            System.out.println("O salario anterior de R$ " + salario + 
            "\nReajuste de 10% que equivaleu a R$ " + (salario * 0.10) +
            "\nSalario novo R$ " + salario * 1.10);
            break;
            case 4:
            System.out.println("O salario anterior de R$ " + salario + 
            "\nReajuste de 10% que equivaleu a R$ " + (salario * 0.05) +
            "\nSalario novo R$ " + salario * 1.05);
            break;
            default:
            System.out.println("Salario invalido");
        }
        /*
        System.out.println("Digite o salário:");
        double salario = scan.nextDouble();
        
        int percentual = 0;
        if (salario <= 280){
            percentual = 20;
        } else if (salario > 280 && salario < 700){
            percentual = 15;
        } else if (salario >= 700 && salario < 1500){
            percentual = 10;
        } else if (salario >= 1500){
            percentual = 5;
        }
        
        double aumento = (salario / 100) * percentual;
        double salarioAjustado = salario + aumento;
        
        System.out.println("Salário: " + salario);
        System.out.println("Percentual: " + percentual);
        System.out.println("Aumento: " + aumento);
        System.out.println("Salário ajustado: " + salarioAjustado);
         */
    }
    
}
