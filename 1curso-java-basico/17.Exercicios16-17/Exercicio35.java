import java.util.Scanner;
public class Exercicio35 {
    public static void main(String[] args) {
        /**35. Encontrar números primos é uma tarefa difícil. Faça um programa 
         * que gera uma lista dos números primos existentes entre 1 e um número 
         * inteiro informado pelo usuário.*/
        Scanner scan = new Scanner(System.in);
        
        System.out.println("** Numero primo em um intervalo **");
        System.out.print("Entre com um numero para saber os numeros primos entre 1 e ele: ");
        int num = scan.nextInt();
        
        boolean primo;
        
        for (int i = 1; i <= num; i++){
            
            primo = true;
        
            for (int j = 2; j < i; j++){
                if (i % j == 0){
                    primo = false;
                }
            }

            if (primo){
                System.out.print(i + " ");
            }
        }
    }    
}//revisado 01/11/2023
