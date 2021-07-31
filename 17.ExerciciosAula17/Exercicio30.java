import java.util.Scanner;
public class Exercicio30 {
    public static void main(String[] args) {
        /**30. O Sr. Manoel Joaquim acaba de adquirir uma panificadora e 
         * pretende implantar a metodologia da tabelinha, que já é um sucesso 
         * na sua loja de 1,99. Você foi contratado para desenvolver o programa 
         * que monta a tabela de preços de pães, de 1 até 50 pães, a partir do 
         * preço do pão informado pelo usuário, conforme o exemplo abaixo:
        Preço do pão: R$ 0.18
        Panificadora Pão de Ontem - Tabela de preços
        1 - R$ 0.18
        2 - R$ 0.36
        ...
        50 - R$ 9.00*/
        Scanner scan = new Scanner(System.in);

        System.out.println("** Tabela de precos - Pao de ontem **");
        System.out.print("Digite quantos paes deseja comprar: ");
        int qtdPaes = scan.nextInt();

        for (int i = 1; i <= qtdPaes; i++) {
            System.out.println(i + " - R$ " + (0.18 * i));
        }
    }    
}
