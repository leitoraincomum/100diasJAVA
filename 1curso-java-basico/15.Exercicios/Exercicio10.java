import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        /*10. Faça um Programa que pergunte em que turno você estuda. 
        Peça para digitar M-matutino ou V-Vespertino ou N- Noturno. 
        Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" 
        ou "Valor Inválido!", conforme o caso.*/
        Scanner scan = new Scanner(System.in);

        System.out.println("** Exibir mensagem de turno **\nDigite o turno que estuda:" + 
        "\n(M - matutino / V - vespertino / N - Noturno)");
        String turno = scan.next();
        turno = turno.toUpperCase();

        switch(turno){
            case "M": System.out.println("Bom dia"); break;
            case "V": System.out.println("Boa tarde"); break;
            case "N": System.out.println("Boa noite"); break;
            default: System.out.println("Valor invalido: " + turno);  
        }
        /* 
         System.out.println("Digite o turno que você estuda:");
        String turno = scan.next();
        
        switch(turno){
            case "m":
            case "M": System.out.println("Bom dia!"); break; 
            case "v":
            case "V": System.out.println("Boa tarde!"); break; 
            case "n":
            case "N": System.out.println("Boa noite!"); break;  
            default: System.out.println("Valor inválido"); 
        }
        */
    }
}//revisado 29/10/2023