import java.util.Scanner;
public class Exercicio12 {
    public static void main(String[] args) {
        /*12. Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:
        Tabuada de 5:
        5 X 1 = 5
        5 X 2 = 10
        ...
        5 X 10 = 50 */
        Scanner scan = new Scanner(System.in);
        System.out.println("** Gerador de tabuada **\nDigite um numero para tabuada: ");
        int num = scan.nextInt();

        System.out.println("Tabuada de " + num);

        for (int i = 1; i < 11; i++){
            System.out.println(num + " x " + i + " = " + i * num);
        }
    }
    
}//revisado 01/11/2023
