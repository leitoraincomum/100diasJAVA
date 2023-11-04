import java.text.DecimalFormat;
import java.util.Scanner;
public class Exercicio20{
    public static void main(String[] args){
        /**20. Implementar um programa que obtenha a cotação do dólar (U$) 
         * em relação ao real (R$) e a seguir armazene em vetor A com 20 elementos 
         * as seguintes conversões:
         * A[i] = cotação do dolar * i, para todo i variando de 1 até 20. */
        Scanner scan = new Scanner(System.in);

        double[] vetA = new double[20];
        double cotacao;
        
        System.out.print("** Cotacao **\nDigite a cotacao atual do dolar: ");
        cotacao = scan.nextDouble();
        
        for (int i = 0; i < vetA.length; i++){
            vetA[i] = cotacao * (i + 1);
        }
        
        DecimalFormat df = new DecimalFormat("###,###.##");
        
        System.out.print("** Cotacao de 1 a 20 **\n");
        for (int i = 0; i < vetA.length; i++){
            System.out.println((i + 1) + ": " + df.format(vetA[i]));
        }
    
    }
}//revisado 03/11/2023