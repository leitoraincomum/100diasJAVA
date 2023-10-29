import java.util.Scanner;

public class ifElse {
    public static void main(String[] args){
      Scanner scan = new Scanner(System.in); 
      
      System.out.println("Entre com sua idade: ");

      int idade = scan.nextInt();

      if (idade >=18){
          System.out.println("Eh maior de idade.");
      } else{
          System.out.println("Nao eh menor de idade.");
      }

      /*produto: barato se for <= 10
      10 < valor <  15 - pedir desconto
      15 <= valor 17 - pesquisar mais 
      >= 17 - muito caro
      */

      System.out.println("Entre com o preco do item");
      double valor = scan.nextDouble();

      if (valor <=10){
          System.out.println("Esta barato, pode comprar");
      } else if(valor > 10 && valor < 15){
          System.out.println("Voce pode pedir um desconto");
      } else if(valor >= 15 && valor < 17){
          System.out.println("Você pode pesquisar mais");          
      }
      else{// valor >= 17
          System.out.println("Muito caro");
      }
    }
    
}//revisado em 29/10/2023