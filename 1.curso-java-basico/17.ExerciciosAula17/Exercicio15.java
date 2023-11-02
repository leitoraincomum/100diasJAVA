import java.util.Scanner;
public class Exercicio15 {
    public static void main(String[] args) {
        /** 15. A série de Fibonacci é formada pela seqüência 
         * 1,1,2,3,5,8,13,21,34,55,... 
         * Faça um programa capaz de gerar a série até o n−ésimo termo.*/
        Scanner scan = new Scanner(System.in);
        System.out.println("**Exibir serie Fibbonacci **");
        int primeiro = 1, segundo = 1, proximo, n;
        String fibonacci = (primeiro + " " + segundo + " ");

        System.out.print("Entre com o n-esimo termo da serie fibonacci: ");
        n = scan.nextInt();

        for (int i = 3; i <= n; i++) {
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
            fibonacci = fibonacci + proximo + " ";
        }

        System.out.println("Os "  + n  + " primeiros numeros da serie Fibonacci - " + fibonacci);
    }
}//revisado 01/11/2023