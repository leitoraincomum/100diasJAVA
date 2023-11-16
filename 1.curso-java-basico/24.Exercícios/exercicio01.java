public class exercicio01{
    /*1. Escreva uma classe para representar uma lâmpada 
    que está à venda em um supermercado. */
    public static void main(String[] args){

        Lampada lampada = new Lampada();
        lampada.modelo = "A60";
        lampada.tensao = "Bivolt";
        lampada.garantiaMeses = 36;
        lampada.potencia = 7;
        lampada.cor = "Amarela";
        lampada.tipoLuz = "Amarela";
        lampada.tipoAbajur = true;
        
        //instanciar vetor tipos
        lampada.tipos = new String[5];
        lampada.tipos[0] = "Abajur";
        lampada.tipos[1] = "Lampeões";

        System.out.println("** Exemplo de exibição de dados inseridos **" + 
        "\nModelo: " + lampada.modelo +
        "\nTensão: " + lampada.tensao +
        "\nQuantos meses de garantia: " + lampada.garantiaMeses + 
        "\nQual a potencia: " + lampada.potencia + 
        "\nCor: " + lampada.cor + 
        "\nTipo de Luz: " + lampada.tipoLuz + 
        "\nServe no abajur: " + lampada.tipoAbajur);

    }
}//feito 13/11/2023