import java.util.Scanner;
public class exercicio05 {
    /*5. Modifique o programa anterior de maneira a guardar os compromissos de todo o ano, 
    organizados por mês, dia e hora (só 8 horas por dia). */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String[][][] compromissos = new String[12][31][8];
        
        boolean sair = false;
        byte opcao;
        while (!sair){
            
            System.out.println("Digite 1 para adicionar compromisso " + 
            "\nDigite 2 para verificar compromisso \nDigite 0 para sair");
            
            opcao = scan.nextByte();
            
            if (opcao == 1){ //adicionar compromisso
                
                boolean mesValido = false;
                int mes = 0;
                while (!mesValido){
                    System.out.println("Entre com o mes: ");
                    mes = scan.nextInt();
                    if (mes > 0 && mes <= 12){
                        mesValido = true;
                    } else {
                        System.out.println("Mes invalido, digite novamente!");
                    }
                }
                
                boolean diaValido = false;
                int dia = 0;
                while (!diaValido){
                    System.out.println("Entre com o dia do mes: ");
                    dia = scan.nextInt();
                    if (dia > 0 && dia <= 31){
                        diaValido = true;
                    } else {
                        System.out.println("Dia invalido, digite novamente!");
                    }
                }
                
                boolean horaValida = false;
                int hora = 0;
                while (!horaValida){
                    System.out.println("Entre com a hora do compromisso: ");
                    hora = scan.nextInt();
                    if (hora >= 0 && hora <= 8){
                        horaValida = true;
                    } else {
                        System.out.println("Hora invalida, digite novamente!");
                    }
                }
                
                mes--;
                dia--;
                System.out.println("Digite o compromisso: ");
                compromissos[mes][dia][hora] = scan.next();
                
            } else if (opcao == 2){ //verificar compromisso
                
                boolean mesValido = false;
                int mes = 0;
                while (!mesValido){
                    System.out.println("Entre com o mes: ");
                    mes = scan.nextInt();
                    if (mes > 0 && mes <= 12){
                        mesValido = true;
                    } else {
                        System.out.println("Mes invalido, digite novamente!");
                    }
                }
                
                boolean diaValido = false;
                int dia = 0;
                while (!diaValido){
                    System.out.println("Entre com o dia do mes: ");
                    dia = scan.nextInt();
                    if (dia > 0 && dia <= 31){
                        diaValido = true;
                    } else {
                        System.out.println("Dia invalido, digite novamente!");
                    }
                }
                
                boolean horaValida = false;
                int hora = 0;
                while (!horaValida){
                    System.out.println("Entre com a hora do compromisso: ");
                    hora = scan.nextInt();
                    if (hora >= 0 && hora <= 24){
                        horaValida = true;
                    } else {
                        System.out.println("Hora invalida, digite novamente!");
                    }
                }
                
                mes--;
                dia--;
                System.out.println("O compromisso agendado eh: ");
                System.out.println(compromissos[mes][dia][hora]);
                
            } else if (opcao == 0){
                sair = true;
            } else {
                System.out.println("Opcao invalida, digite novamente!");
            }
        }

    }
}//feito 08/11/2023