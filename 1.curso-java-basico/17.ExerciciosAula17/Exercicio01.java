import java.util.Scanner;
public class Exercicio01 {
    public static void main(String[] args){
        /*1. Faça um programa que peça uma nota, entre zero e dez. 
        Mostre uma mensagem caso o valor seja inválido e continue 
        pedindo até que o usuário informe um valor válido.*/
        Scanner scan = new Scanner(System.in);
        double nota;
        System.out.println("** Validacao de nota **");
        System.out.println("Digite uma nota entre 0 e 10");
        nota = scan.nextDouble();
               
        while(nota < 0 || nota > 10){
            System.out.println("Valor invalido \nDigite uma nota entre 0 e 10");
            nota = scan.nextDouble();
        }
    }    
}//revisado 31/10/2023