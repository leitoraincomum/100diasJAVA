import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        /*14. Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina
        ao longo de um semestre, e calcule a sua média. A atribuição de conceitos obedece à tabela 
        abaixo:
        Média de Aproveitamento  Conceito
        Entre 9.0 e 10.0        A
        Entre 7.5 e 9.0         B
        Entre 6.0 e 7.5         C
        Entre 4.0 e 6.0         D
        Entre 4.0 e zero        E
        O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente
        e a mensagem 'APROVADO' se o conceito for A, B ou C ou 
        'REPROVADO' se o conceito for D ou E. */
        Scanner scan = new Scanner(System.in);
        System.out.println("** Aprovado ou Reprovado **\nDigite a primeira nota: ");
        double nota1 = scan.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2)/2;
        String conceito;

        if (media >=9 && media <= 10){
        //Entre 9.0 e 10.0        A
           conceito = "A";
        }else if(media >=7.5 && media < 9){
        //Entre 7.5 e 9.0         B
            conceito = "B";
        }else if(media >= 6 && media < 7.5){
        //Entre 6.0 e 7.5         C
            conceito = "C";
        } else if(media >= 4 && media < 6 ){
        //Entre 4.0 e 6.0         D
            conceito = "D";
        } else if(media >= 0 && media < 4){
        //Entre 4.0 e zero        E
            conceito = "E";
        } else{
            conceito = "invalido";
        }

        switch(conceito){
            case "A":
            case "B":
            case "C": System.out.println("Aprovado"); break;
            case "D":
            case "E": System.out.println("Reprovado");break;
            default: System.out.println("Notas invalidas");
        }
        /*
         System.out.println("Entre com a primeira nota:");
        double nota1 = scan.nextDouble();
        
        System.out.println("Entre com a segunda nota:");
        double nota2 = scan.nextDouble();
        
        double media = (nota1 + nota2) / 2;
        
        String aproveitamento = "";
        if (media >= 9 && media <= 10){
            aproveitamento = "A";
        } else if (media >= 7.5 && media < 9){
            aproveitamento = "B";
        } else if (media >= 6 && media < 7.5){
            aproveitamento = "C";
        } else if (media >= 4 && media < 6){
            aproveitamento = "D";
        } else if (media >= 0 && media < 4){
            aproveitamento = "E";
        } 
        
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Média: " + media);
        System.out.println("Conceito: " + aproveitamento);
        
        switch(aproveitamento){
            case "A":
            case "B":
            case "C": System.out.println("APROVADO"); break;
            case "D":
            case "E": System.out.println("REPROVADO"); break;  
        }
         */
    }
}
