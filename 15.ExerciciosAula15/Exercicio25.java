import java.util.Scanner;
public class Exercicio25 {
    public static void main(String[] args) {
        /*25. Faça um programa que faça 5 perguntas para uma pessoa sobre um crime.
        As perguntas são:
        a. "Telefonou para a vítima?"
        b. "Esteve no local do crime?"
        c. "Mora perto da vítima?"
        d. "Devia para a vítima?"
        e. "Já trabalhou com a vítima?"
        O programa deve no final emitir uma classificação sobre a participação da pessoa no crime.
        Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita",
        entre 3 e 4 como "Cúmplice" e 5 como "Assassino". 
        Caso contrário, ele será classificado como "Inocente".*/
        Scanner scan = new Scanner(System.in);
        String resp1, resp2, resp3, resp4, resp5;
        int contResp = 0;

        System.out.println("** Investigacao Assassinato **");
        System.out.println("Telefonou para a vitima?");
        resp1 = scan.next();
        if (resp1.equalsIgnoreCase("S")){
            contResp++;
        }

        System.out.println("Esteve no local do crime?");
        resp2 = scan.next();
        if (resp2.equalsIgnoreCase("S")){
            contResp++;
        }

        System.out.println("Mora perto da vitima?");
        resp3 = scan.next();
        if (resp3.equalsIgnoreCase("S")){
            contResp++;
        }

        System.out.println("Devia para a vitima?");
        resp4 = scan.next();
        if (resp4.equalsIgnoreCase("S")){
            contResp++;
        }
        
        System.out.println("Ja trabalhou com a vitima?");
        resp5 = scan.next();
        if (resp5.equalsIgnoreCase("S")){
            contResp++;
        }

        if(contResp < 2){
            System.out.println("Inocente");
        }else if(contResp == 2){
            System.out.println("Suspeita");
        }else if(contResp == 3 || contResp == 4){
            System.out.println("Cumplice");
        }else if(contResp == 5){
            System.out.println("Assassino");
        }
    }
    
}
