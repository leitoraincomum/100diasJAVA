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
            System.out.println("\nNotas do Aluno " + (i+1));
            for(int j = 0; j < notasAlunos[i].length; j++) {
                System.out.println(notasAlunos[i][j] + " ");
            }
        }

        System.out.println("\nCalculando a média de cada aluno");
        for (int i = 0; i < notasAlunos.length; i++) {
            //for j aninhado (um dentro do outro)
            int soma = 0;
            for(int j = 0; j < notasAlunos[i].length; j++) {
                soma += notasAlunos[i][j];
            }
            System.out.println("Media do aluno " + (i + 1) + " eh  = " + (soma/4) );
        
        
    }

    /*  Anotações
        exemplos de declarar com a introdução de dados no vetor/array
        double[] notasAluno1 = {7, 8, 9, 10}; 

        exemplo de declarar com introdução de dados no array bidmensional
        cada subconjuntom de {} reflete uma linha do array		
		double[][] notasAlunos2 = {{7, 8, 9, 10}, {8, 6, 7, 10}};
		
		System.out.println("Output da matriz notasAlunos2");
		
		for (int i=0; i<notasAlunos2.length; i++){
			for (int j=0; j<notasAlunos2[i].length; j++){
				System.out.print(notasAlunos2[i][j] + " - ");
			}
			System.out.println();
		}
     */
}
}//Revisado 06/11/2023