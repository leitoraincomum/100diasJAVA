import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio38 {
    public static void main(String[] args) {
        /**38. Um funcionário de uma empresa recebe aumento salarial anualmente: 
         * Sabe-se que:
         * a. 'Esse funcionário foi contratado em 1995, com salário inicial de R$ 1.000,00;
         * b. Em 1996 recebeu aumento de 1,5% sobre seu salário inicial;
         * c. A partir de 1997 (inclusive), os aumentos salariais sempre correspondem ao 
         * dobro do percentual do ano anterior. Faça um programa que determine o salário 
         * atual desse funcionário. Após concluir isto, altere o programa permitindo que 
         * o usuário digite o salário inicial do funcionário. */
        Scanner scan = new Scanner(System.in);
        //formato do valor com uso da biblioteca
        DecimalFormat format = new DecimalFormat("###,###.##");

        System.out.println("** Valores de aumento anual de salário **");
        System.out.print("Digite o salario inicial do funcionario: ");
        double salario = scan.nextDouble();

        //double salario = 1000; //95
        double percentual = 1.5; // 96
        
        salario += (salario/100) * percentual; //96
             
        for (int i = 1997; i <= 2021; i++){
            
            percentual *= 2;
            
            salario += (salario/100) * percentual;
            
            System.out.println("Ano - " + i + " =  valor de R$ " + 
            format.format(salario) + " - com percentual de " + percentual + "%");
        }
    }   
}//revisado 01/11/2023
