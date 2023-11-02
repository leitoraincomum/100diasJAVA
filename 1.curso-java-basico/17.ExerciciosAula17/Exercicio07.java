import java.util.Scanner;
public class Exercicio07 {
    public static void main(String[] args) {
        //7. Faça um programa que leia 5 números e informe o maior número.
        int num, maior = Integer.MIN_VALUE;
        Scanner scan = new Scanner(System.in);
        System.out.println("** Ler 5 numeros e mostrar o maior **");
        for (int i = 1; i < 6; i++) {
            System.out.print("Digite o " + i + "o numero : ");
            num = scan.nextInt();

            if (num > maior) {
                maior = num;
            }
        }

        System.out.println("O maior numero digitado foi: " + maior);

        /*Exemplo Loiane
 for (int i=0; i<5; i++){
            
            System.out.println("Entre com um número:");
            num = scan.nextInt();
            
            if (num > maior){
                maior = num;
                System.out.println("o número maior mudou: " + maior);
            }
        }
 */

    }    
}//revisado 31/10/2023
