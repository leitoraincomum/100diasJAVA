public class Exercicio16 {
    public static void main(String[] args) {
        /**16. A série de Fibonacci é formada pela seqüência 
         * 0,1,1,2,3,5,8,13,21,34,55,... 
         * Faça um programa que gere a série até que o valor seja maior que 500.*/
        System.out.println("** Exibir serie Fibbonacci ate ser maior que 500 **");
        int primeiro = 1, segundo = 1, proximo = 0;
        String fibonacci = (primeiro + " " + segundo + " ");

        do{
           for (int i = 3; proximo < 500; i++) {
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
            fibonacci = fibonacci + proximo + " ";
        }
        }while(proximo < 500);
    

        System.out.println("Os primeiros numeros da serie Fibonacci - " + fibonacci);
    
    }    
}//revisado 01/11/2023
