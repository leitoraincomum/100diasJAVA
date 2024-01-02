import java.util.Scanner;
public class Exercicio49 {
    public static void main(String[] args) {
        /**49. Faça um programa que mostre os n termos da Série a seguir:
        S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m.
        Imprima no final a soma da série. */
        Scanner scan = new Scanner(System.in);
        System.out.println("*** Calcululo de termos de uma serie ***\nSendo S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m");
        
        System.out.print("Digite o valor do N: ");
        int n = scan.nextInt();
        double soma = 0;
        
        System.out.print("Soma dos termos abaixo: \n");
        for (int i = 1, j = 1; i <= n; i++, j += 2){
            
            System.out.print(i + "/" + j + "  ");        
            soma += i/j;
        }
                
        System.out.println("\nSoma dos termos = " + soma);
    }
    
}//revisado 01/11/2023
