import java.util.Scanner;
public class Exercicio32 {
    public static void main(String[] args) {
        /**32. Faça um programa que calcule o fatorial de um número inteiro 
         * fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120. A saída deve ser 
         * conforme o exemplo abaixo:
            Fatorial de: 5
            5! =  5 . 4 . 3 . 2 . 1 = 120 */
            Scanner scan = new Scanner(System.in);
            System.out.println("*** Calculo de fatorial ***");
            System.out.print("Digite um numero: ");
            int num = scan.nextInt();
            
            System.out.println("Fatorial de " + num + "!");
            
            int fatorial = 1;
            for (int i = num; i > 1; i--){
                fatorial *= i;
                System.out.print(i + " . ");
            }
            
            System.out.print("1 = " + fatorial);
    }    
}//revisado 01/11/2023