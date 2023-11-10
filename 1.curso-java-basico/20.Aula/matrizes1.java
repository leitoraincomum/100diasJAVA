import java.util.Scanner;
public class matrizes1 {
    public static void main(String[] args) {
        /**Escreva um programa que receba as quatro notas de 30 alunos. Usando matriz */
        Scanner scan = new Scanner(System.in);
        System.out.println("** Arrays multidimensionais ** \n30 alunos com 4 notas cada");
        //linhas: alunos - colunas: notas
        double[][] notasAlunos = new double[30][4];
        //[i][j]
        for (int i = 0; i < notasAlunos.length; i++) {
            //for j aninhado (um dentro do outro)
            System.out.println("\nAluno - " + (i+1));
            for(int j = 0; j < notasAlunos[i].length; j++) {
                System.out.println(notasAlunos[i][j] + " ");
            }
        }
        
    }
    
}//Revisado 06/11/2023
