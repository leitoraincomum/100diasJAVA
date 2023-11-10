public class BreakComRotulos {
    public static void main(String[] args) {
        //rotulos ou labels
        for (int i = 0; i < 5; i++) {
            rotulo1: {
                rotulo2: {
                    rotulo3: {
                        if (i == 1) break rotulo1;
                        if (i == 2) break rotulo2;
                        if (i == 3) break rotulo3;
                        System.out.println("rotulo3");
                    }
                    System.out.println("rotulo2");
                }
                System.out.println("rotulo1");
            }
            System.out.println("valor de i: " + i);
        }
        System.out.println("Saiu do loop!");
    }    
}//revisado 02/11/2023
