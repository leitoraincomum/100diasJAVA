import java.util.Scanner;
public class matrizes2 {
    public static void main(String[] args) {
        /**Escreva um programa que receba as quatro notas de 30 alunos. Usando matriz */
        Scanner scan = new Scanner(System.in);
        System.out.println("** Arrays multidimensionais - 30 alunos com 4 notas cada **");
        //linhas: alunos - colunas: notas
        double[][] notasAlunos = new double[30][4];
        //[i][j]
        for (int i = 0; i < notasAlunos.length; i++) {
            //for j aninhado (um dentro do outro)
            for(int j = 0; j < notasAlunos[i].length; j++) {
                System.out.println(notasAlunos[i][j] + " ");
            }
            System.out.println("------------------------");
        }

        System.out.println("Calculando a média de cada aluno");
        for (int i = 0; i < notasAlunos.length; i++) {
            //for j aninhado (um dentro do outro)
            int soma = 0;
            for(int j = 0; j < notasAlunos[i].length; j++) {
                soma += notasAlunos[i][j];
            }
            System.out.println("Media do aluno " + (i + 1) + " eh  = " + (soma/4) );
        
        
    }
    
}
}
