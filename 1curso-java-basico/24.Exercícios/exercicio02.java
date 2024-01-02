public class exercicio02 {
    /*2. Crie uma classe Livro que represente os dados básicos 
    de um livro, sem se preocupar com a sua finalidade. */
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.nome = "Mastering ExtJS";
        livro.autor = "Loiane Grone";
        livro.anoLancamento = 2015;
        livro.qtdPaginas = 450;

        System.out.println("** Exibição dos dados inseridos **" +
        "\nNome do livro: " + livro.nome +
        "\nNome do autor: " + livro.autor +
        "\nAno de lancamento do livro: " + livro.anoLancamento + 
        "\nQuantidade de páginas: " + livro.qtdPaginas);
    }   
}//feito 14/11/2003