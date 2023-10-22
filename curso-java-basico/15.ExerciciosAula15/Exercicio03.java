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
            case "F": System.out.println("Sexo feminino " + sexo); break;
            case "M": System.out.println("Sexo masculino " + sexo); break;
            default: System.out.println("Sexo invalido " + sexo); 
        }

        

    }
    
}
