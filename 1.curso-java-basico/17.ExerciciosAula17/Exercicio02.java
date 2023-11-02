import java.util.Scanner;
public class Exercicio02 {
    public static void main(String[] args) {
        /*2. Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha 
        igual ao nome do usuário, mostrando uma mensagem de erro e voltando a pedir as informações.*/
        Scanner scan = new Scanner(System.in);
        String usuario, senha;
        
        System.out.println("**Nome de usuario e senha** \nDigite o nome de usuario: ");
        usuario = scan.next();

        System.out.println("Digite a senha: ");
        senha = scan.next();

        while (usuario.equalsIgnoreCase(senha)) {
            System.out.println("Digite uma senha diferente do usuario");
            senha = scan.next();
        }
        
        /*Exemplo Loiane
         foValidas = false;
        String nomeUser;
        String senha;
        
        do {
            
            System.out.println("Entre com o nome do usuário:");
            nomeUser = scan.next();
            
            System.out.println("Entre com a senha:");
            senha = scan.next();
            
            if (nomeUser.equalsIgnoreCase(senha)){
                //infoValidas = false;
                System.out.println("Senha igual a usuário, digite novamente.");
            } else {
                infoValidas = true;
                System.out.println("Senha e usuários válidos.");
            }
            
        } while (!infoValidas);

         */
    }   
}//revisado 31/10/2023
