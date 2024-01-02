public class TesteCarro {
    public static void main(String[] args) {

		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		//van.numPassageiros = 10; colocado no corpo principal do projeto o valor
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;

		System.out.println(van.numPassageiros);

        //passando as informações como parâmetro para iniciar a classe
		Carro van2 = new Carro("Fiat", "Ducato", 10, 100, 0.2);

		System.out.println(van2.marca);
		System.out.println(van2.modelo);
		System.out.println(van2.numPassageiros);
		System.out.println(van2.capCombustivel);
		System.out.println(van2.consumoCombustivel);

		Carro2 carro2 = new Carro2();
	}
}//feito 21/11/2023