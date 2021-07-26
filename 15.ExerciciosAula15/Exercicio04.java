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
    }    
}