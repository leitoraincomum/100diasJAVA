import java.util.Scanner;
public class Exercicio19{
    public static void main(String[] args){
        /**19.Ler as duas notas bimestrais para um conjunto de 10 alunos. 
         * Armazenar as notas informadas em dois vetores 'Nota1' e 'Nota2' 
         * do tipo real. Escreva um programa que calcule a média aritmética 
         * simples das notas informadas armazenando o resultado em um vetor 
         * 'Result' de mesmo tipo e tamanho. Ao mostrar os resultados exibir 
         * a situação de cada aluno. Se a média calculada for superior ou 
         * igual a 7 o aluno estará 'aprovado', caso contrário, a situação do aluno será 'reprovado'.. */
        Scanner scan = new Scanner(System.in);
        double notas1[] = new double[10], notas2[] = new double[notas1.length], result[] = new double[notas2.length];

        System.out.println("** Media de alunos - Aprovado / Reprovado **");
        for (int i = 0; i < notas1.length; i++) {
            System.out.print("Digite a primeira nota do  " + (i + 1) + "o aluno: ");
            notas1[i] = scan.nextDouble();
            System.out.print("Digite a segunda nota do  " + (i + 1) + "o aluno: ");
            notas2[i] = scan.nextDouble();
            result[i] = (notas1[i] + notas2[i])/2;
        }

        System.out.println("** RESULTADOS **");
        for (int i = 0; i < result.length; i++) {
            if (result[i] < 7){
                System.out.println("Aluno " + (i + 1) + " ficou com media " + result[i] + " e foi REPROVADO");                
            } else {
                System.out.println("Aluno " + (i + 1) + " ficou com media " + result[i] + " e foi APROVADO");
            }
        }
    }
}//revisado 03/11/2023