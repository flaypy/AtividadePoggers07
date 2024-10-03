package br.edu.fatecpg.sobrescrita.view;

import br.edu.fatecpg.sobrescrita.model.Bicicleta;
import br.edu.fatecpg.sobrescrita.model.Carro;
import br.edu.fatecpg.sobrescrita.model.Veiculo;

public class Main {

	public static void main(String[] args) {

		Carro carro = new Carro("Bolinha", "Logan");
		Bicicleta bicicleta = new Bicicleta("Caloi", "Rosa");
		
		carro.mover();
		bicicleta.mover();
		
	}

}
