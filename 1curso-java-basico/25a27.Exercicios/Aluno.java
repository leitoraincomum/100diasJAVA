public class Aluno {
    String nome, matricula, nomeCurso;
    String[] nomeDisciplinas1; //se eu não for limitar o array 
    String[] nomeDisciplinas = new String[3];
    double[][] notasDisciplinas1; //se eu não for limitar o array 
    double[][] notasDisciplinas = new double[3][4];
    
    void mostrarInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome do curso: " + nomeCurso);
        
        for (int i = 0; i < notasDisciplinas.length; i++){
            System.out.println("Notas da disciplina " + nomeDisciplinas[i]);
            for (int j = 0; j < notasDisciplinas[i].length; j++){
                System.out.print(notasDisciplinas[i][j] + " ");
            }
            System.out.println();
        }
    }//mostrarInfo
    
    boolean verificarAprovado(int indice){
        
        if (obterMedia(indice) >= 7){
            return true;
        } 
        //caso for reprovado
        return false;
    }//verificarAprovado
    
    double obterMedia(int indice){
        
        double soma = 0;
        
        for (int i = 0; i < notasDisciplinas[indice].length; i++){
            soma += notasDisciplinas[indice][i];
        }
        
        double media = soma / 4;
        
        return media;
    }//obterMedia
}//feto 18/11/2023