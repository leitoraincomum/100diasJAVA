import java.util.Scanner;

public class SwithCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escolha o  do dia da semana (1 - 7)");
        int diaSemana = scan.nextInt();
/*
        if(diaSemana == 1){
            System.out.println("Domingo");
        } else if(diaSemana == 2){
            System.out.println("Segunda");
        } else if(diaSemana == 3){
            System.out.println("Terca");
        } else if(diaSemana == 4){
            System.out.println("Quarta");
        } else if(diaSemana == 5){
            System.out.println("Quinta");
        } else if(diaSemana == 6){
            System.out.println("Sexta");
        } else if(diaSemana == 7){
            System.out.println("Sabado");
        } else {
			System.out.println("Não é uma dia da semana válido");
		}*/

        switch(diaSemana){
            case 1: System.out.println("Domingo"); break;       
            case 2: System.out.println("Segunda"); break;
            case 3: System.out.println("Terca"); break;
            case 4: System.out.println("Quarta"); break;
            case 5: System.out.println("Quinta"); break;
            case 6: System.out.println("Sexta"); break;
            case 7: System.out.println("Sabado"); break;
            default: System.out.println("Nao eh um dia da semana valido");
        }

        /* para saber se é dia útil ou fim de semana
        switch(diaSemana){
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: System.out.println("Dia útil"); break;
            case 1: 
            case 7: System.out.println("Fim de semana"); break;
            default: System.out.println("Não é uma dia da semana válido");
            }
        */
    }
    
}//revisado em 29/10/2023