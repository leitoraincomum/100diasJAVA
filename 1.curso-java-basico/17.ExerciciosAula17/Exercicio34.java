import java.util.Scanner;
public class Exercicio34 {
    public static void main(String[] args) {
        /**34. Os números primos possuem várias aplicações dentro da Computação, 
         * por exemplo na Criptografia. Um número primo é aquele que é divisível 
         * apenas por um e por ele mesmo. Faça um programa que peça um número 
         * inteiro e determine se ele é ou não um número primo.*/
        Scanner scan = new Scanner(System.in);
        
        System.out.println("*** Numero primo ***");
        System.out.print("Entre com um numero para saber se eh primo: ");
        int num = scan.nextInt();
        
        boolean primo = true;
                
        for (int i = 2; i < num; i++){
            if (num % i == 0){
                System.out.println( num + " nao eh primo - divisivel por " + i);
                primo = false;
            }
        }
        
        if (primo){
            System.out.print(num + " eh um numero primo");
        }
        
    }    
}//revisado 01/11/2023
