public class Arays {
    //VS code estava dando erro com o nome Arrays :/
    public static void main(String[] args) {
        double[] temperaturas = new double[365];
        temperaturas[0] = 31.3;
        temperaturas[1] = 32;
        temperaturas[2] = 33.7;
        temperaturas[3] = 34;
        temperaturas[4] = 33.1;

        System.out.println("** Valores do Array **");
        System.out.println("O valor da temperatura do da 01 eh: " + temperaturas[0]);
        System.out.println("O valor da temperatura do da 02 eh: " + temperaturas[1]);
        System.out.println("O valor da temperatura do da 03 eh: " + temperaturas[2]);
        System.out.println("O valor da temperatura do da 04 eh: " + temperaturas[3]);
        System.out.println("O valor da temperatura do da 05 eh: " + temperaturas[4]);

        System.out.println("Quantidade de elementos do Array **");
        System.out.println("O tamanho do array eh: " + temperaturas.length);

        System.out.println("For Tradicional");
        for (int i = 0; i < temperaturas.length; i++){
            System.out.println("Valor da temperatura do dia " + (i + 1) + " eh : " + temperaturas[i]);
        }

        System.out.println("For melhorado");
        for (double temp : temperaturas){
            System.out.println("Valor da temperatura do dia " + (temp + 1) + " eh : " + temp);
        }

    }       
}
