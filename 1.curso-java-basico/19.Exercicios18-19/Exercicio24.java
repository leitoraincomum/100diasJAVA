import java.util.Scanner;
public class Exercicio24{
    public static void main(String[] args){
        /** 24. Números palíndromos são aqueles que escritos da direita para a esquerda 
         * têm o mesmo valor quando escritos da esquerda para a direita. 
         * Exemplo: 545; 789987; 97379; 123454321; etc. 
         * Escreva um programa que verifique se um dado vetor A de 10 elementos 
         * inteiros é um palíndromo, ou seja, se o primeiro elemento do vetor e 
         * igual ao último, se o segundo elemento do vetor é igual ao penúltimo e 
         * assim por diante até verificar todos os elementos ou chegar a 
         * conclusão que o vetor não é um palíndromo.*/
        Scanner scan = new Scanner(System.in);
        int[] vetA = new int[10];
        boolean palindromo = true;
        
        System.out.println("** Verificar se numero digitado no vetor eh palindromo **");
        for (int i = 0; i < vetA.length; i++){            
            System.out.print("Entre com um numero para a posicao " + i +  " : ");
            vetA[i] = scan.nextInt();            
        }
               
        for (int i = 0; i < (vetA.length / 2 ); i++){
            
            if (vetA[i] != vetA[vetA.length - 1 - i]){
                palindromo = false;
                break;
            }
        }
        
        System.out.print("\nElementos digitados no vetor A: ");
        for (int i = 0; i < vetA.length; i++){
            System.out.print(vetA[i] + " ");
        }
        
        if (palindromo){
            System.out.println("\nPalindromo");
        } else {
            System.out.println("\nNao eh palindromo");
        }
    }
}//revisado 04/11/2023