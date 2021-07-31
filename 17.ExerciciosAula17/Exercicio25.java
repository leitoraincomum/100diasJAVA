import java.util.Scanner;
public class Exercicio25 {
    public static void main(String[] args) {
        /**25. Faça um programa que peça para n pessoas a sua idade, 
         * ao final o programa devera verificar se a média de idade da turma 
         * varia entre 0 e 25,26 e 60 e maior que 60; 
         * e então, dizer se a turma é jovem, adulta ou idosa, 
         * conforme a média calculada. */
        Scanner scan = new Scanner(System.in);

        System.out.println("** Turma jovem, adulta ou idosa **");
        System.out.print("Digite a quantidade de pessoas do grupo: ");
        int pessoas = scan.nextInt();
        int idade, soma = 0;

        for (int i = 0; i < pessoas; i++){
            System.out.print("Digite a idade da " + (i + 1) + "a pessoa: ");
            idade = scan.nextInt();
            soma += idade;
        }
        
        if (soma/pessoas >= 0 && soma/pessoas <= 25){
            System.out.println("Grupo de pessoas jovens");
        }else if(soma/pessoas >= 26 && soma/pessoas <= 60){
            System.out.println("Grupo de pessoas adultas");
        }else {
            System.out.println("Grupo de pessoas idosas");
        }
    }
    
}
