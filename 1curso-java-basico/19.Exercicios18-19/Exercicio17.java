import java.util.Scanner;
public class Exercicio17{
    public static void main(String[] args){
        /**17. Ler um vetor A com 10 elementos inteiros correspondentes 
         * as idades de um grupo de pessoas. Escreva um programa que determine 
         * e escreva a quantidade de pessoas que possuem idade superior a 35 anos.*/
        Scanner scan = new Scanner(System.in);
        int vetA[] = new int[10], qtd = 0;
        
        System.out.println("** Quantidade de idades maiores a 35 **");
        for (int i = 0; i < vetA.length; i++) {
            System.out.print("Digite a idade " + (i + 1) + " do vetor A: ");
            vetA[i] =  scan.nextInt();
            if (vetA[i] > 35){
                qtd++;
            }
        }

        System.out.println("Foram digitadas " + qtd + " idades acima de 35.");
    }
}//revisado 03/11/2023