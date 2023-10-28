//importar a biblioteca
import java.util.Scanner;

public class LeituraDadosTeclado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

/*        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scan.nextLine();
        System.out.println("Seu nome completo eh: " + nomeCompleto);

        System.out.println("Digite seu primeiro nome: ");
        String primeiroNome = scan.next();
        System.out.println("Seu primeiro nome eh: " + primeiroNome);

        System.out.println("Digite a sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Sua idade eh: " + idade);

        System.out.println("Digite a sua altura: ");
        double altura = scan.nextDouble();
        System.out.println("Sua altura eh: " + altura);*/

        
        System.out.println("Digite seu primeiro nome, idade, altura quantidade de filhos e se tem bichinho de estimação: ");
        String primeiroNome = scan.next();
        int idade = scan.nextInt();
//      float altura = scan.nextFloat();
        double altura = scan.nextDouble();
        byte qtdFilhos = scan.nextByte();
        boolean temPet = scan.nextBoolean();

        System.out.println("Você digitou os seguintes valores");
        System.out.println("Primeiro nome: " + primeiroNome);
        System.out.println("Idade: " + idade);
        System.out.println("Quantidade de filhos: " + qtdFilhos);
        System.out.println("Altura: " + altura);
        System.out.println("Tem bichinho de estimação: " + temPet);

    }
}
        //revisado em 28/10/2023