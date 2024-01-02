public class exercicio01{
    /*1. Escreva uma classe para representar uma lâmpada. 
    Desenvolva métodos para ligar, desligar a lâmpada. */
    public static void main(String[] args){
        Lampada lampada = new Lampada();

        lampada.ligar();
        
        lampada.mostrarEstado();
        
        lampada.desligar();
        
        lampada.mostrarEstado();
        
        lampada.mudarEstado();
        
        lampada.mostrarEstado();

    }
}//feito 17/11/2023