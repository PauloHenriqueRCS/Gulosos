package Teste;

import Files.Troco;

public class TrocoTeste {

	public static void main(String[] args) {

		System.out.println("Algoritmo do Troco");
		System.out.println("Moedas selecionadas");
		int[] moedas = { 100, 50, 24, 12, 5, 1 };
		Troco troco = new Troco();
		troco.InicializrTroco(moedas, 20);
	}
}
