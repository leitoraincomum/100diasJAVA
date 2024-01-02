import java.util.Scanner;
public class Exercicio36 {
    public static void main(String[] args) {
        /**36. Desenvolva um programa que faça a tabuada de um número qualquer 
         * inteiro que será digitado pelo usuário, mas a tabuada não deve necessariamente 
         * iniciar em 1 e terminar em 10, o valor inicial e final devem ser informados 
         * também pelo usuário, conforme exemplo abaixo:
        Montar a tabuada de: 5
        Começar por: 4
        Terminar em: 7

        Vou montar a tabuada de 5 começando em 4 e terminando em 7:
        5 X 4 = 20
        5 X 5 = 25
        5 X 6 = 30
        5 X 7 = 35
        Obs: Você deve verificar se o usuário não digitou o final menor que o inicial. */
        Scanner scan = new Scanner(System.in);
        System.out.println("** Tabuada personalizada **");
        System.out.print("Diga de qual numero quer a tabuada: ");
        int num = scan.nextInt();
        
        boolean invalido = false;
        int numFinal, numInicio;
        
        do {
            
            System.out.print("Em qual numero inicia a tabuada? ");
            numInicio = scan.nextInt();

            System.out.print("Em qual numero finaliza a tabuada? ");
            numFinal = scan.nextInt();

            if (numFinal <= numInicio){
                invalido = true;
                System.out.println("Numero final deve ser maior que o inicial, tente novamente!!");
            } else {
                invalido = false;
            }
            
        } while (invalido);
        
        
        System.out.println("Tabuada de " + num + ", iniciando por " + numInicio + 
        " e finalizando em " + numFinal);
        
        for (int i = numInicio; i <= numFinal; i++){
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }    
}//revisado 01/11/2023
