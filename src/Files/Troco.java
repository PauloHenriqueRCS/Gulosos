package Files;

public class Troco {

	public void InicializrTroco(int[] moedas, int troco) {

		int trocoAtual = 0;
		int[] MoedasSelect = new int[moedas.length];

		for (int i = 0; i < moedas.length; i++)
			MoedasSelect[i] = 0;

		int k = 0;
		while (trocoAtual != troco) {
			if (moedas[k] + trocoAtual <= troco) {
				trocoAtual += moedas[k];
				MoedasSelect[k]++;
			} else {
				k++;
			}
		}

		int total = 0;
		for (int i = 0; i < MoedasSelect.length; i++)
			if (MoedasSelect[i] >= 1) {
				System.out.println(MoedasSelect[i] + " moedas " + " de " + moedas[i]);
				total += moedas[i];
			}
		System.out.println("Troco final = " + total);
	}

}
