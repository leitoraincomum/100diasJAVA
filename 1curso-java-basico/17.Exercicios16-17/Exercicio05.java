import java.util.Scanner;
public class Exercicio05 {
    public static void main(String[] args) {
        /*5. Altere o programa anterior permitindo ao usuário informar as populações 
        e as taxas de crescimento iniciais. Valide a entrada e permita repetir a operação. */
        Scanner scan = new Scanner(System.in);
        double popA, popB, taxaA, taxaB;
        boolean valido = false;
        System.out.println("** Populacao A e Populacao B - digitando valores**");

        do{
           System.out.println("Entre com a populacao A: ");
           popA = scan.nextDouble();
           
           if (popA > 0) {
               valido = true;
           } else {
               System.out.println("Populacao A precisa ser maior que 0.");
           }
        }while(!valido);

        valido = false;
        do{
            System.out.println("Entre com a taxa da populacao A: ");
            taxaA = scan.nextDouble();
            
            if (taxaA > 0) {
                valido = true;
            } else {
                System.out.println("Taxa da populacao A precisa ser maior que 0.");
            }
        }while(!valido);

        valido = false;
        do{
            System.out.println("Entre com a populacao B: ");
            popB = scan.nextDouble();
            
            if (popB > 0) {
                valido = true;
            } else {
                System.out.println("Populacao B precisa ser maior que 0.");
            }
        }while(!valido);

        valido = false;
        do{
            System.out.println("Entre com a taxa da populacao B: ");
            taxaB = scan.nextDouble();
            
            if (taxaB > 0) {
                valido = true;
            } else {
                System.out.println("Taxa da populacao B precisa ser maior que 0.");
            }
        }while(!valido);

        int cont = 0;
        while(popA <= popB) {
            popA += (popA/100) * taxaA;
            popB += (popB/100) * taxaB;
            cont++;
        }

        System.out.println("Populacao A: " + popA + "\nPopulacao B: " + popB + "\nEm " + cont + " anos");
    }    
}//revisado 31/10/2023
