public class TesteCarro {
    public static void main(String[] args) {
		
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println("\nMarca da Van: " + van.marca +
        "\nModelo da Van: " + van.modelo +
        "\nPassageiros: " + van.numPassageiros + 
        "\nCapacidade de Combustível: " + van.capCombustivel +
        "\nConsumo de Combustivel: " + van.consumoCombustivel);
		
		Carro fusca = new Carro();
		fusca.marca = "Volkswagen";
		fusca.modelo = "Fusca";
		fusca.numPassageiros = 4;
		fusca.capCombustivel = 30;
		fusca.consumoCombustivel = 0.15;
		
        System.out.println("\nMarca da carro: " + fusca.marca +
        "\nModelo do carro: " + fusca.modelo +
        "\nPassageiros: " + fusca.numPassageiros + 
        "\nCapacidade de Combustível: " + fusca.capCombustivel +
        "\nConsumo de Combustivel: " + fusca.consumoCombustivel);

		//chamada do método simples sem retorno ou parâmetro
		van.exibirAutonomia();

		//chamada do método com retorno
		double autonomia = van.obterAutonomia();
		System.out.println("Autonomia do carro eh: " + autonomia);

		//chamada de método com retorno e parâmetros
		double qtdCombustivel10 = van.calcularCombustivel(10);
		double qtdCombustivel15 = van.calcularCombustivel(15);

		System.out.println("Quantidade de combustivel necessária para 10 km: " + qtdCombustivel10);
		System.out.println("Quantidade de combustivel necessária para 15 km: " + qtdCombustivel15);
	}
    
}//feito 16/11/2023