import java.util.Scanner;
public class Exercicio21 {
    public static void main(String[] args) {
        /**21. Faça um programa que peça um número inteiro e determine se ele é 
         * ou não um número primo. Um número primo é aquele que é divisível 
         * somente por ele mesmo e por 1.*/
        Scanner scan = new Scanner(System.in);

        System.out.println("** Verificar se eh numero primo **");
        System.out.print("Digite o numero para verificar se eh primo: ");
        int numero = scan.nextInt();

        boolean primo = true;
        for (int i = 2; i < numero; i++){
            if (numero%i == 0){
               primo = false;
            }
        }

        if (primo == false){
            System.out.println("Nao eh um numero primo!");
        }else{
            System.out.println("Eh um numero primo!");
        }
    }
}//revisado 01/11/2023
