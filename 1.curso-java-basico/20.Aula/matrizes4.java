import java.util.Scanner;
public class matrizes4 {
    //Matriz Irregular
    public static void main(String[] args) {Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o numero de pessoas que serao entrevistadas: ");
		int numEntrevistados = scan.nextInt();
		
		String[][] nomesFilhos = new String[numEntrevistados][];
		
		for (int i = 0; i < nomesFilhos.length; i++){
			
			System.out.println("Entre com a quantidade de filhos da pessoa: " + (i + 1) + ": ");
			int qtdFilhos = scan.nextInt();
			
			nomesFilhos[i] = new String[qtdFilhos];
			
			for (int j = 0; j < nomesFilhos[i].length; j++){
				
				System.out.println("Digite o nome do filho " + (j + 1));
				
				nomesFilhos[i][j] = scan.next();
			}
		}

		for (int i = 0; i < nomesFilhos.length; i++){
			System.out.println("\nPessoa " + (i + 1) + " tem " + nomesFilhos[i].length + " filho(s): ");
			for (int j = 0; j < nomesFilhos[i].length; j++){
				System.out.print(nomesFilhos[i][j] + " ");
			}
		}
	}

}//Revisado 06/11/2023