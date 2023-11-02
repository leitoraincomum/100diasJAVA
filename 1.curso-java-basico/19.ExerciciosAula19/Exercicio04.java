import java.text.DecimalFormat;
import java.util.Scanner;
public class Exercicio04 {
    public static void main(String[] args){
        /**04. Criar um vetor A com 15 elementos inteiros. Construir um vetor B 
         * de mesmo tamanho, sendo que cada elemento do vetor B deverá ser a raiz 
         * quadrada do respectivo elemento de A, ou seja: B[i] = sqrt(A[i]).  */
        Scanner scan = new Scanner(System.in);
        int vetA[] = new int[15]; 
        double vetB[] = new double[vetA.length];
        System.out.println("** Raiz quadrada **");

        for (int i = 0; i < vetA.length; i++) {
            System.out.print("Digite a posicao " + (i + 1) + " do vetor A: ");
            vetA[i] =  scan.nextInt();
            vetB[i] = Math.sqrt(vetA[i]); //B[i] = sqrt(A[i])
        }

        DecimalFormat df = new DecimalFormat("###,###.##");
        System.out.println("\n** Elementos vetor B **");
        for (int i = 0; i < vetB.length; i ++){
            System.out.println("A posicao " + (i + 1) + " do vetor B eh : " + (df.format(vetB[i])));
        }

    }    
}//revisado 02/11/2023
