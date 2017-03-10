package Files;

public class Mochila {

	public void InicializaMochila(int[] Item, int[] valor, int CapMax, int elementos) {

		int NEGATIVE_INFINITY = Integer.MIN_VALUE;
		int[][] m = new int[elementos + 1][CapMax + 1];
		int[][] sol = new int[elementos + 1][CapMax + 1];

		/** Cria vetor solucao e auxiliar **/
		for (int i = 1; i <= elementos; i++) {
			for (int j = 0; j <= CapMax; j++) {
				int m1 = m[i - 1][j];
				int m2 = NEGATIVE_INFINITY;
				if (j >= Item[i])
					m2 = m[i - 1][j - Item[i]] + valor[i];
				/** seleciona  max de m1, m2 **/
				m[i][j] = Math.max(m1, m2);
				sol[i][j] = m2 > m1 ? 1 : 0;
			}
		}
		/** Cria lista de todos os items para selecionar **/
		int[] selected = new int[elementos + 1];
		for (int n = elementos, w = CapMax; n > 0; n--) {
			if (sol[n][w] != 0) {
				/** item selecionado vetor recebe 1 else vetor recebe 0 **/
				selected[n] = 1;	
				w = w - Item[n];
			} else
				selected[n] = 0;
		}

		/** Imprime Item selecionados **/
		System.out.println("\nItems selecionados : ");
		int peso=0,valorr=0;
		for (int i = 1; i < elementos + 1; i++) {
			if (selected[i] == 1) {
				System.out.println("Item " + Item[i] + " " + "Peso " + valor[i]);
				peso +=Item[i];
				valorr += valor[i];
			}
		}
		System.out.println("Peso da mochila " + peso + " ,com valor de " + valorr);
		System.out.println();
	}


}
