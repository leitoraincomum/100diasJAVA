import java.util.Scanner;
//Refazer de acordo com enunciado
/**3. Faça um programa que leia três vetores independentes compostos por 5 números que são
fornecidos pelo usuário. Crie uma matriz que reuna estes três vetores em uma única
estrutura. Faça uma procedure que exiba na tela o conteúdo da matriz. Faça uma function
que receba a matriz como parâmetro e retorne o maior valor contido nesta matriz, e antes de
terminar a execução do programa exiba este valor na tela. */
public class exercicio03 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int[][] numeros = new int[3][3];
        
        for (int i=0; i<numeros.length; i++){
            for (int j=0; j<numeros[i].length; j++){
                
                System.out.println("Entre com o valor da pos [" + i + "," + j + "]");
                numeros[i][j] = scan.nextInt();
            }
        }
        
        int qtdPares = 0;
        int qtdImpares = 0;
        for (int i=0; i<numeros.length; i++){
            for (int j=0; j<numeros[i].length; j++){
                
                if (numeros[i][j] % 2 == 0){
                    qtdPares++;
                } else {
                    qtdImpares++;
                }
            }
        }  
        
        for (int i=0; i<numeros.length; i++){
            for (int j=0; j<numeros[i].length; j++){
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("Pares = " + qtdPares);
        System.out.println("Impares = " + qtdImpares);
    }
}