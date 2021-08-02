import java.util.Scanner;
public class BreakEContinue{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Entre com um numero: ");
        int num = scan.nextInt();

        System.out.print("Entre com um limite: ");
        int max = scan.nextInt();

/**     System.out.println("Break");
        for (int i = 0; i < num; i++){
            System.out.print(i);
            if (i % 7 == 0){
                System.out.println("O valor de i eh: " + i);
                break;
            }
        }*/

        System.out.println("Continue");
        for (int i = 0; i < num; i++){
            System.out.print(i);
            if (i % 7 == 0){
                continue;
            }
            System.out.println("O valor de i eh: " + i);
        }
    }
}