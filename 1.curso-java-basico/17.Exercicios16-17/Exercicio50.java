import java.util.Scanner;
public class Exercicio50 {
    public static void main(String[] args) {
        /**50. Sendo H = 1 + 1/2 + 1/3 + 1/4 + ... + 1/N, 
         * Faça um programa que calcule o valor de H com N termos. */
        Scanner scan = new Scanner(System.in);
        System.out.println("*** Calculo de H ***\nSendo H = 1 + 1/2 + 1/3 + 1/4 + ... + 1/N");
        
        System.out.print("Digite o valor de N: ");
        int n = scan.nextInt();
        
        double soma = 0;
        
        for (int i = 1; i <= n; i++){  
            soma += 1/i;
        }
        
        System.out.println("H = " + soma);

    }    
}//revisado 01/11/2023
