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

        while (usuario.equals(senha)) {
            System.out.println("Digite uma senha diferente do usuario");
            senha = scan.next();
        }
    }   
}//revisado 31/10/2023
