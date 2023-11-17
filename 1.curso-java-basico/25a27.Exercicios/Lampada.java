public class Lampada {
    String modelo, tensao, cor, tipoLuz;
    int potencia, garantiaMeses;
    String[] tipos;
    boolean tipoAbajur, ligada;

    void ligar(){
        ligada = true;
    }

    void desligar(){
        ligada = false;
    }
    
    void mostrarEstado(){
        if (ligada){
            System.out.println("Lâmpada está ligada");
        } else {
            System.out.println("Lâmpada está desligada");
        }
    }//mostrar estado
    
    void mudarEstado(){
        if (ligada){
            desligar();
        } else {
            ligar();
        }
    }//mudar estado
}//feito 17/11/2023