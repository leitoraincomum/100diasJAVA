import java.util.Scanner;
public class Exercicio11 {
    public static void main(String[] args) {
        //Altere o programa anterior para mostrar no final a soma dos números.
        Scanner scan = new Scanner(System.in);
        int soma = 0;
        
        System.out.print("**Soma do intervalo entre numeros **\nDigite o primeiro numero: ");
        int num1 = scan.nextInt();

        System.out.print("Digite o segundo numero: ");
        int num2 = scan.nextInt();

        if(num1 > num2){
            for(int i = num2 + 1 ; i < num1; i++){
                System.out.print(i + " ");
                soma += i;
            }
            System.out.println("\nA soma dos numeros do intervalo eh: " + soma);
        }else if(num2 > num1){
            for(int i = num1 + 1; i < num2; i++){
                System.out.print(i + " ");
                soma += i;
            }
            System.out.println("\nA soma dos numeros do intervalo eh: " + soma);
        }else if (num2 == num1){
            System.out.println("Os numeros digitados sao iguais");
        }
    }    
}//revisado 01/11/2023