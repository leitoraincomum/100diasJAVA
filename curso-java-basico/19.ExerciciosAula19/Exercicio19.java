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
        double nota1[] = new double[10], nota2[] = new double[10], result[] = new double[10];

        System.out.println("** Media de alunos - Aprovado / Reprovado **");
        for (int i = 0; i < nota1.length; i++) {
            System.out.print("Digite a primeira nota do  " + (i + 1) + "o aluno: ");
            nota1[i] = scan.nextDouble();
            System.out.print("Digite a segunda nota do  " + (i + 1) + "o aluno: ");
            nota2[i] = scan.nextDouble();
            result[i] = (nota1[i] + nota2[i])/2;
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
}