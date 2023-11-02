import java.util.Scanner;
public class Exercicio27 {
    public static void main(String[] args) {
        /**27. Faça um programa que calcule o número médio de alunos por turma. 
         * Para isto, peça a quantidade de turmas e a quantidade de alunos para 
         * cada turma. As turmas não podem ter mais de 40 alunos. */
        Scanner scan = new Scanner(System.in);
        System.out.println("** Media de alunos por turma **");
        System.out.print("Qual a quantidade de de turmas para calcular? ");
        int turmas = scan.nextInt();
        int somaAlunos = 0, qtdAlunos;

        for (int i = 0; i < turmas; i++){

            boolean valido;

            do{
                System.out.print("Quantos alunos tem a turma " + (i + 1) + "a? ");
                qtdAlunos = scan.nextInt();

                if(qtdAlunos >  40){
                    valido = false;
                    System.out.println("Numero de alunos invalido. Maximo 40, digite novamente");
                }else{
                    valido = true;
                }
            }while(!valido);
            somaAlunos += qtdAlunos;
        }
        
        double mediaAlunos = somaAlunos/turmas;

        System.out.println("O numero medio de alunos por tumas eh " + mediaAlunos);
    }    
}//revisado 01/11/2023