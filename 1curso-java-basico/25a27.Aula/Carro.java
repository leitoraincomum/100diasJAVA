public class Carro {
    String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;

	//método simples sem retorno e/ou parâmetro
	void exibirAutonomia(){
		System.out.println("A autonomia do carro eh: " + 
		capCombustivel * consumoCombustivel + " km");
	}

	//método  com retorno
	double obterAutonomia(){
		System.out.println("/Metodo obterAutonomia foi chamado./");
		return capCombustivel * consumoCombustivel;
	}

	//método com parâmetro
	double calcularCombustivel(double km){
		double qtdCombustivel = km/consumoCombustivel;
		return qtdCombustivel;
	}

}//feito 16/11/2023