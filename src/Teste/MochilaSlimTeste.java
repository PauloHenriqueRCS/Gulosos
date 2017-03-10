package Teste;

import Files.MochilaSlim;

public class MochilaSlimTeste {

	public static void main(String[] args) {

		System.out.println("Mochila Algorithm Test");

		MochilaSlim mochila = new MochilaSlim();

		int elementos = 4;
		int[] Item = new int[elementos ]; // vetor de indices de elementos
		int[] valor = new int[elementos ];// vetor de peso de elementos

		Item[1] = 10;
		Item[2] = 20;
		Item[3] = 30;

		valor[1] = 60;
		valor[2] = 100;
		valor[3] = 120;

		mochila.InicializarMochila2(Item, valor, 50);
	}
	
}
