import java.util.Scanner;
public class Exercicio33{
    public static void main(String[] args){
        /**33. Criar um vetor A com 10 elementos inteiros. 
         * Escreva um programa que imprima cada elemento do vetor A e 
         * uma mensagem indicando se o respectivo elemento é um número primo ou não. */
        Scanner scan = new Scanner(System.in);
        int[] vetA = new int[5];
        boolean primo;
        String msg;

        System.out.println("** Numeros primos ou nao **");
        
        for (int i = 0; i < vetA.length; i++){
            System.out.print("Digite a posicao " + (i + 1) + " do vetor A: ");
            vetA[i] = scan.nextInt();
        }
        
        for (int i = 0; i < vetA.length; i++){
            primo = true;
            for (int j = 2; j < vetA[i]; j++){
                if (vetA[i] % j == 0){
                    primo = false;
                    break;
                }
            }
            
            msg = "";
            if (primo){
                msg = ": eh  primo";
            } else {
                msg = ": nao eh primo";
            }
            
            System.out.println(vetA[i] + msg);
        }
    }
}//revisado 06/11/2023 (equivalente ao dia 05/11/2023 pois faltou luz)