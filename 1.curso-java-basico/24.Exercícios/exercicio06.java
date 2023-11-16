public class exercicio06 {
    /*6. Crie uma classe que represente um 
    contato da agenda do seu celular. */
    public static void main(String[] args) {
        Contato contatos = new Contato();
        //String nome, email, endereco;
        contatos.nome = "Fernanda";
        contatos.email = "fernanda@leitoraincomum.com.br";
        contatos.endereco = "Ferraz de Vasconcelos";

        //definição da capacidade de telefones para 5
        contatos.telefones = new String[5];
        contatos.telefones[0] = "11 912345678";
        contatos.telefones[1] = "11 956781234";
        contatos.telefones[2] = "11 987654321";

        System.out.println("** Exibição de dados inseridos **" + 
        "\nNome: " + contatos.nome + 
        "\nEmail: " + contatos.email +
        "\nEndereco: " + contatos.endereco +
        "\nTelefone 1: " + contatos.telefones[0] +
        "\nTelefone 2: " + contatos.telefones[1] +
        "\nTelefone 3: " + contatos.telefones[2]);

    }
    
}//feito 16/11/2023