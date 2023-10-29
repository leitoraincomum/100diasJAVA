import java.util.Scanner;
public class Exercicio15 {
    public static void main(String[] args) {
        /*15. Faça um Programa que peça os 3 lados de um triângulo. 
        O programa deverá informar se os valores podem ser um triângulo. 
        Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno.
        Dicas:
        - Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro;
        - Triângulo Equilátero: três lados iguais;
        - Triângulo Isósceles: quaisquer dois lados iguais;
        - Triângulo Escaleno: três lados diferentes; */
        Scanner scan = new Scanner(System.in);
        System.out.println("** Tipos de triangulo **\nDigite os tres lados do triangulo:");
        double lado1 = scan.nextDouble();
        double lado2 = scan.nextDouble();
        double lado3 = scan.nextDouble();

        if (((lado1 + lado2) > lado3) && ((lado1 + lado3) > lado2) && ((lado3 + lado2) > lado1)){
            if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3){
                System.out.println("Triangulo escaleno");
            }else if(lado1 == lado2 && lado2 == lado3){
                System.out.println("Triangulo equilatero");
            }else if(lado1 == lado2 || lado2 == lado3 || lado1 == lado3){
                System.out.println("Triangulo isoceles");
            }    
        } else {
            System.out.println(" Nao eh um triangulo");
        }
        /*
          if (((lado1 + lado2) > lado3) || 
                ((lado1 + lado3) > lado2) || 
                ((lado2 + lado3) > lado1)){
            
            if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3){
                System.out.println("Triângulo Equilátero");
            } else if (lado1 != lado2 && lado1 != lado3 && lado3 != lado2){
                System.out.println("Triângulo Escaleno");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
                System.out.println("Triângulo Isóceles");
            }
            
        } else {
            System.out.println("não forma um triângulo");
        }
         */

    }
    
}
