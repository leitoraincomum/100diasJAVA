import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        double tamArquivo, velInternet, tempo;

        System.out.println("Qual o tamanho do arquivo?");
        tamArquivo = scan.nextDouble();
        
        System.out.println("Qual a velocidade da internet?");
        velInternet = scan.nextDouble();
        
        tempo = tamArquivo / velInternet;
        
        System.out.println("O tempo de download eh " + tempo);
    }
    
}
//revisado em 28/10/2023