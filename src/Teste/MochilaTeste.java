package Teste;

import Files.Mochila;

public class MochilaTeste {

	public static void main(String[] args) {

		System.out.print("\n Algoritmos Gulosos");
		System.out.print("\n Algoritmo da Mochila\n");
		
		Mochila mochila = new Mochila();

		int elementos = 4;
		int CapMax = 50;
		int[] Item = new int[elementos + 1]; // vetor de indices de elementos
		int[] valor = new int[elementos + 1];// vetor de peso de elementos

		Item[1] = 10;
		Item[2] = 20;
		Item[3] = 30;

		valor[1] = 60;
		valor[2] = 100;
		valor[3] = 120;
	

		mochila.InicializaMochila(Item, valor, CapMax, elementos);
	}
}
