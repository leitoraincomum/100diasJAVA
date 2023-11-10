public class Exercicio04 {
    public static void main(String[] args) {
        /*4. Supondo que a população de um país 
        A seja da ordem de 80000 habitantes com uma taxa anual de crescimento de 3% 
        e que a população de B seja 200000 habitantes com uma taxa de crescimento de 1.5%. 
        Faça um programa que calcule e escreva o número de anos necessários para que a população 
        do país A ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento.*/
        int popA = 80000, popB = 200000, cont = 0;
        System.out.println("** Populacao A e Populacao B **");

        while(popA <= popB) {
            popA += (popA/100) * 3;
            popB += (popB/100) * 1.5;
            cont++;
        }

        System.out.println("Populacao A: " + popA + "\nPopulacao B: " + popB + "\nEm " + cont + " anos");
    }
    
}//revisado 31/10/2023
