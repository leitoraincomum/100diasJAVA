import java.util.Scanner;
public class Exercicio18{
    public static void main(String[] args){
        /**18. Ler um vetor A com 10 elementos inteiros correspondentes as 
         * idades de um grupo de pessoas. Escreva um programa que determine e 
         * escreva a menor e a maior idades e suas respectivas posições. */
        Scanner scan = new Scanner(System.in);
        int vetA[] = new int[10], menorIdade = Integer.MAX_VALUE, maiorIdade = Integer.MIN_VALUE,
        posicaoMenor = 0, posicaoMaior = 0;
        
        System.out.println("** Maior e menor idade **");
        for (int i = 0; i < vetA.length; i++) {
            System.out.print("Digite a idade " + (i + 1) + " do vetor A: ");
            vetA[i] =  scan.nextInt();
            if (vetA[i] < menorIdade) {
                menorIdade = vetA[i];
                posicaoMenor = i;
            }
            if (vetA[i] > maiorIdade){
                maiorIdade = vetA[i];
                posicaoMaior = i;
            }
        }
        System.out.println("A menor idade digitada foi:  " + menorIdade + " na posicao " + posicaoMenor
        + "\nA maior idade digitada foi: " + maiorIdade +" na posicao " + posicaoMaior);
    }
}//revisado 03/11/2023