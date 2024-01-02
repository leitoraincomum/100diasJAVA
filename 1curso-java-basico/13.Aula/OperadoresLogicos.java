public class OperadoresLogicos {
    public static void main(String[] args) {
        int valor1 = 1;
        int valor2 = 2;
    
        boolean resultado1 = (valor1 == 1) && (valor2 == 2);
        System.out.println("valor1 eh 1 AND valor2 eh 2 - resultado: " + resultado1);
        
        boolean resultado2 = (valor1 == 1) || (valor2 == 2);
        System.out.println("valor1 eh 1 OR valor2 eh 2 - resultado: " +  resultado2);

        boolean verdadeiro = true;
        boolean falso = false;
        System.out.println("Tabela Verdade");
        System.out.println("Verdadeiro E Falso: " + (verdadeiro && falso));
        System.out.println("Verdadeiro OU Falso: " + (verdadeiro || falso));
        System.out.println("Verdadeiro XOR Falso: " + (verdadeiro ^ falso));
        System.out.println("!(Verdadeiro e Falso): " + (!verdadeiro && falso));

    }
}
        //revisado em 28/10/2023
