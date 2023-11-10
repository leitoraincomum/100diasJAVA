import java.util.Scanner;
public class Exercicio22{
    public static void main(String[] args){
        /**21. Gerar aleatoriamente um vetor A com 10 elementos inteiros e 
         * iguais a 0 e 1, sugestão: A[i] = (int)Math.round(Math.random() * 1); 
         * Pede-se para implementar um programa que determine o percentual de 
         * números 0's e 1's existentes no vetor A. */
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Vetor Aleatorio e porcentagem 0 e 1");
        int[] vetorA = new int[10];
        int qtd0 = 0, qtd1 = 0;
        
        for (int i = 0; i < vetorA.length; i++){
            vetorA[i] = (int) Math.round(Math.random() * 1);
            
            if (vetorA[i] == 0){
                qtd0++;
            } else {
                qtd1++;
            }
        }
        
        //10  - 100%
        //qtd - x
        //x = (qtd * 100)/10;
        double porc0 = (qtd0 * 100) / vetorA.length;
        double porc1 = (qtd1 * 100) / vetorA.length;
        
        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }    
        System.out.println("\nPorcentagens de 0 = " + porc0);
        System.out.println("Porcentagens de 1 = " + porc1);
    }
}//revisado 03/11/2023