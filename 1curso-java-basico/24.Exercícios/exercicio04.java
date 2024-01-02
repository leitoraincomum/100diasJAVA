import java.util.Date;

public class exercicio04 {
    /*4. Usando o resultado do modelo “Livro” como base, crie
    uma classe “LivroDeBiblioteca” que represente os dados básicos 
    de um livro de uma biblioteca, que pode ser emprestado a leitores. */
    public static void main(String[] args) {
        
        LivroDeBiblioteca livro = new LivroDeBiblioteca();
        livro.nome = "Mastering ExtJS";
        livro.autor = "Loiane Groner";
        livro.anoLancamento = 2015;
        livro.qtdPaginas = 450;
        livro.emprestado = true;
        livro.dataEntrega = new Date();
        livro.emprestadoTexto = "Fernanda";
        
        System.out.println("** Exibição dos dados inseridos **" +
        "\nNome do livro: " + livro.nome +
        "\nNome do autor: " + livro.autor +
        "\nAno de lancamento do livro: " + livro.anoLancamento + 
        "\nQuantidade de paginas: " + livro.qtdPaginas +
        "\nLivro Emprestado: " + livro.emprestado + 
        "\nLivro Emprestado para: " + livro.emprestadoTexto + 
        "\nData de entrega: " + livro.dataEntrega);
    }
    
}//feito 15/11/2023