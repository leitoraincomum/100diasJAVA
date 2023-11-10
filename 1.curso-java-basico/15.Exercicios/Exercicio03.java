import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args){
        /*3. Faça um Programa que verifique se uma letra digitada
        é "F" ou "M". Conforme a letra escrever: F - Feminino,
        M - Masculino, Sexo Inválido.*/

        Scanner scan = new Scanner(System.in);

        System.out.println("** Exibir o sexo **\nDigite o sexo (F ou M)");
        String sexo = scan.next();
        sexo = sexo.toUpperCase();

        switch(sexo){
            case "F": System.out.println("Sexo feminino - " + sexo); break;
            case "M": System.out.println("Sexo masculino - " + sexo); break;
            default: System.out.println("Sexo invalido - " + sexo); 
        }
/*
        System.out.println("Entre com uma letra (F ou M):");
        String input = scan.next();
        
        if (input.equalsIgnoreCase("f")){
            System.out.println("F - feminino");
        } else if (input.equalsIgnoreCase("m")){
            System.out.println("M - masculino");
        } else {
            System.out.println("Sexo inválido");
        }    
*/
    }
    
}// Revisado em 29/10/2023
