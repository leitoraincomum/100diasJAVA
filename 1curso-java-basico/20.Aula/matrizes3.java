public class matrizes3 {
    public static void main(String[] args) {

        int[][][] matrizTridimensional = new int[3][3][3];
        // primeira dimensão
        for (int i = 0; i < matrizTridimensional.length; i++ ){
            //primeiro for aninhado - segunda dimensão
            for (int j = 0; j < matrizTridimensional.length; j++ ){
                //segundo for aninhado - terceira dimensão
                for (int k = 0; k < matrizTridimensional.length; k++ ){
                    System.out.println("i = " + i + ", j = " + j + " e  k = " + k);
                    matrizTridimensional[i][j][k] = i + j + k;            
                }
            }
        }

        int soma = 0, somaPares = 0, somaImpares = 0;

        // primeira dimensão
        for (int i = 0; i < matrizTridimensional.length; i++ ){
            //primeiro for aninhado - segunda dimensão
            for (int j = 0; j < matrizTridimensional.length; j++ ){
                //segundo for aninhado - terceira dimensão
                for (int k = 0; k < matrizTridimensional.length; k++ ){
                    soma += matrizTridimensional[i][j][k];            

                    if (matrizTridimensional[i][j][k] % 2 == 0){
                        somaPares += matrizTridimensional[i][j][k];            
                    } else {
                        somaImpares += matrizTridimensional[i][j][k];            
                    }
                }
            }
        
    }
    
    System.out.println("Soma total dos indices = " +  soma);
    System.out.println("Soma dos pares = " +  somaPares);
    System.out.println("Soma dos  impares = " +  somaImpares);
}
}//Revisado 06/11/2023