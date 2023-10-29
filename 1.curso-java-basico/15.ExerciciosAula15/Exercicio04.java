import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        /*4. Faça um Programa que verifique se 
        uma letra digitada é vogal ou consoante.*/
        Scanner scan = new Scanner(System.in);
        System.out.println("** Vogal ou consoante\nDigite a letra pra ser identificada");
        String letra  = scan.next();
        letra = letra.toUpperCase();

        if (letra.length() > 1){
            System.out.println("Nao eh uma letra valida!!");
        } else {
            switch (letra) {
                case "A":
                case "E":
                case "I":
                case "O":
                case "U":
                System.out.println("Eh uma vogal"); break;
                default: System.out.println("Eh consoante");
            }
        }
 /*
            if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || 
                letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || 
                letra.equalsIgnoreCase("u")){
            System.out.println("vogal");
        }  else {
             System.out.println("consoante");   
        }
        
        if (letra.length() > 1){
            System.out.println("Não é uma letra válida");
        } else {
            switch(letra){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
            case "A":
            case "E":
            case "I":
            case "O":
            case "U": System.out.println("vogal"); break;
            default: System.out.println("consoante");  
        }
        }*/

    }    
}// revisado 29/10/2023