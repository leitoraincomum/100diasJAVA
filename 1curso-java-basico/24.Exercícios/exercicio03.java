public class exercicio03 {
    /*3. Usando o resultado do exercício anterior como base, 
    crie uma classe 'LivroDeLivraria' que represente os dados 
    básicos de um livro que está à venda em uma livraria. */
    public static void main(String[] args) {
        LivroDeLivraria livroDeLivraria = new LivroDeLivraria();
        livroDeLivraria.nome = "Mastering ExtJS";
        livroDeLivraria.autor = "Loiane Grone";
        livroDeLivraria.anoLancamento = 2015;
        livroDeLivraria.qtdPaginas = 450;
        livroDeLivraria.preco = 89.90;

        System.out.println("** Exibição dos dados inseridos **" +
        "\nNome do livro: " + livroDeLivraria.nome +
        "\nNome do autor: " + livroDeLivraria.autor +
        "\nAno de lancamento do livro: " + livroDeLivraria.anoLancamento + 
        "\nQuantidade de paginas: " + livroDeLivraria.qtdPaginas +
        "\nPreco do livro: " + livroDeLivraria.preco);
        
    }
}//feito 14/11/2023