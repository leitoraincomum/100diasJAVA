import java.util.Scanner;
public class Exercicio24 {
    public static void main(String[] args) {
        /*24. Faça um Programa que leia 2 números e em seguida pergunte ao 
        usuário qual operação ele deseja realizar. 
        O resultado da operação deve ser acompanhado de uma frase que diga se o número é:
        a. par ou ímpar;
        b. positivo ou negativo;*/
        Scanner scan = new Scanner(System.in);
        double num1, num2, resultado;
        System.out.println("Digite o primeiro numero: ");
        num1 = scan.nextDouble();
        System.out.println("Digite o segundo numero: ");
        num2 = scan.nextDouble();

        System.out.println("Escolha a operacao desejada \n + adicao"+
        "\n - subtracao \n / divisao \n * multiplicacao");
        String operacao = scan.next();

        switch (operacao){
            case "+": 
            resultado = num1 + num2;
            if (resultado >= 0){
                if (resultado%2 == 0){
                    System.out.println("A soma dos numeros eh "+ resultado + " um numero par e positivo");
                }else{
                    System.out.println("A soma dos numeros eh "+ resultado + " um numero impar e positivo");
                }
            }else{
                if (resultado%2 == 0){
                    System.out.println("A soma dos numeros eh "+ resultado + " um numero par e negativo");
                }else{
                    System.out.println("A soma dos numeros eh "+ resultado + " um numero impar e negativo");
                }
            }
            break;
            case "-":
            resultado = num1 - num2;
            if (resultado >= 0){
                if (resultado%2 == 0){
                    System.out.println("A subtracao dos numeros eh "+ resultado + " um numero par e positivo");
                }else{
                    System.out.println("A subtracao dos numeros eh "+ resultado + " um numero impar e positivo");
                }
            }else{
                if (resultado%2 == 0){
                    System.out.println("A subtracao dos numeros eh "+ resultado + " um numero par e negativo");
                }else{
                    System.out.println("A subtracao dos numeros eh "+ resultado + " um numero impar e negativo");
                }
            }
            break;
            case "/":
            resultado = num1 / num2;
            if (resultado >= 0){
                if (resultado%2 == 0){
                    System.out.println("A divisao dos numeros eh "+ resultado + " um numero par e positivo");
                }else{
                    System.out.println("A divisao dos numeros eh "+ resultado + " um numero impar e positivo");
                }
            }else{
                if (resultado%2 == 0){
                    System.out.println("A divisao dos numeros eh "+ resultado + " um numero par e negativo");
                }else{
                    System.out.println("A divisao dos numeros eh "+ resultado + " um numero impar e negativo");
                }
            }
            break;
            case "*":
            resultado = num1 * num2;
            if (resultado >= 0){
                if (resultado%2 == 0){
                    System.out.println("A multiplicacao dos numeros eh "+ resultado + " um numero par e positivo");
                }else{
                    System.out.println("A multiplicacao dos numeros eh "+ resultado + " um numero impar e positivo");
                }
            }else{
                if (resultado%2 == 0){
                    System.out.println("A multiplicacao dos numeros eh "+ resultado + " um numero par e negativo");
                }else{
                    System.out.println("A multiplicacao dos numeros eh "+ resultado + " um numero impar e negativo");
                }
            }
            break;
            default: System.out.println("Operacao invalida");
        }
    }    
}
