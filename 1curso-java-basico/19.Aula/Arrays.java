public class Arrays {
    public static void main(String[] args) {

        double[] temperaturas = new double[365];
        temperaturas[0] = 31.3;
        temperaturas[1] = 32;
        temperaturas[2] = 33.7;
        temperaturas[3] = 34;
        temperaturas[4] = 33.1;

        System.out.println("** Valores do Array **");
        System.out.println("O valor da temperatura do dia 01 eh: " + temperaturas[0]);
        System.out.println("O valor da temperatura do dia 02 eh: " + temperaturas[1]);
        System.out.println("O valor da temperatura do dia 03 eh: " + temperaturas[2]);
        System.out.println("O valor da temperatura do dia 04 eh: " + temperaturas[3]);
        System.out.println("O valor da temperatura do dia 05 eh: " + temperaturas[4]);

        System.out.println("\nQuantidade de elementos do Array **");
        System.out.println("O tamanho do array eh: " + temperaturas.length);

        System.out.println("\nFor Tradicional");
        for (int i = 0; i < temperaturas.length; i++){
            System.out.println("Valor da temperatura do dia " + (i + 1) + " eh : " + temperaturas[i]);
        }

        System.out.println("\nFor melhorado");
        for (double temp : temperaturas){
            //não consegue acessar o indice pois ele não é parâmetro passado, só os valores inseridos
            System.out.println("Valor da temperatura do dia eh: " + temp);
        }

    }       
}//revisado 02/11/2023
