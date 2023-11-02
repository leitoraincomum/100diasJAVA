import java.util.Scanner;
public class Exercicio33 {
    public static void main(String[] args) {
        /**33. O Departamento Estadual de Meteorologia lhe contratou para desenvolver um 
         * programa que leia as um conjunto indeterminado de temperaturas, e informe ao 
         * final a menor e a maior temperaturas informadas, bem como a média das temperaturas. */
        Scanner scan = new Scanner(System.in);
        System.out.println("** Conjunto de temperaturas **");
        System.out.print("Quantas temperaturas deseja digitar? ");
        int qtdTemperaturas = scan.nextInt();
        
        double temp, soma = 0, menor = Double.MAX_VALUE, maior = Double.MIN_VALUE;
        
        for (int i = 1; i <= qtdTemperaturas; i++){
            
            System.out.print("Entre com a temperatura " + i + ": ");
            temp = scan.nextDouble();
            
            soma += temp;
            
            if (temp > maior){
                maior = temp;
            }
            
            if (temp < menor){
                menor = temp;
            }
        }
        double mediaTemperaturas = soma/qtdTemperaturas;
        System.out.println("A menor temperatura digitada foi: " + menor + 
        "\nA maior temperatura digitada foi: " + maior + 
        "\nA media das temperaturas eh: " + mediaTemperaturas);
    }    
}//revisado 01/11/2023
