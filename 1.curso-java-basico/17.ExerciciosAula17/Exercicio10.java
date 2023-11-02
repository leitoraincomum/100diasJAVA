import java.util.Scanner;
public class Exercicio10 {
    public static void main(String[] args) {
        /*10. Faça um programa que receba dois números inteiros e gere os números 
        inteiros que estão no intervalo compreendido por eles. */
        Scanner scan = new Scanner(System.in);
        
        System.out.print("** Intervalo entre numeros **\nDigite o primeiro numero: ");
        int num1 = scan.nextInt();
        
        System.out.print("Digite o segundo numero: ");
        int num2 = scan.nextInt();

        if(num1 > num2){
            for(int i = num2 + 1 ; i < num1; i++){
                System.out.print(i + " ");
            }
        }else if(num2 > num1){
            for(int i = num1 + 1; i < num2; i++){
                System.out.print(i + " ");
            }
        }else if (num2 == num1){
            System.out.println("Os numeros digitados sao iguais");
        }
    }
    
}//revisado 31/10/2023
