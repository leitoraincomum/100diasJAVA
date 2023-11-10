public class LoopFor {
    public static void main(String[] args){

        for (int i = 0; i < 5; i++) {
            System.out.println("i tem valor: " + i);
        }

        for (int i = 5; i > 0; i--) {
            System.out.println("i tem valor: " + i);
        }
        //mais de uma variavel
        for(int i = 0, j = 10; i < j; i++, j--) {
            System.out.println("i = " + i + " e j = " + j);
        }
        //com partes ausentes
        int count = 0;
        for( ;count < 5; ){
            System.out.println("count = " + count);   
            count += 2;         
        }

        for (int cont = 0; cont < 10; cont +=2 ) {
            System.out.println("cont = " + cont);
        }

        //loop infinito
        //for(;;);

        //loop sem corpo
        //exemplo 1
        int soma = 0;
        for( int i = 0; i < 5; soma += i++);
        System.out.println("O valor de soma = " + soma);
        
        //exemplo 2
        for( int i = 0; i < 5; i++)
            System.out.println("i tem valor de soma = " + i);
        
        //loop melhorado utilizado com arrays
    }
    
}//revisão 31/10/2023
