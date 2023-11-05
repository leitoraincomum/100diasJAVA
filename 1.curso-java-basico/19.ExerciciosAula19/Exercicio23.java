import java.util.Scanner;
public class Exercicio23{
    public static void main(String[] args){
        /**23. Criar um vetor A com 10 elementos inteiros. 
         * Desenvolver um programa que verifique se "todos" os elementos 
         * do vetor A são pares. Se pelo menos um elemento do vetor não for par 
         * o processo de repetição para percorrer os elementos do vetor deve ser 
         * encerrado, como sugestão: utilize uma variável do tipo flag para atingir 
         * este propósito. */
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        boolean par = true;
        int i = 0;

        System.out.println("** Parar se não for par **");

        do {            
            System.out.print("Entre com um numero para a posicao " + (i + 1) + "o : ");
            vetorA[i] = scan.nextInt();
        
            if (vetorA[i] % 2 != 0){
            par = false;
            System.out.println("Numero impar. Programa encerrado!");
            }
            i++;            
        }while(par == true && i < vetorA.length); 

        /* Exemplo Loiane com break
          for (int i=0; i<vetorA.length; i++){
            
            System.out.println("Entre com um número para a posição " + i);
            vetorA[i] = scan.nextInt();
            
            if (vetorA[i] % 2 != 0){
                break;
            }
        }
         */
            
    }
}//revisado 04/11/2023