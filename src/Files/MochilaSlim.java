package Files;


	public class MochilaSlim {

		public void InicializarMochila2(int[] peso, int []beneficio, int tamMochila) {
			int v = 0;
			int w = 0;
			int[] resultado = new int[peso.length];

			
			for (int i = 0; i < peso.length; i++) {
				if ((v + peso[i]) <= tamMochila) {
					v += peso[i];
					resultado[i] = 1;
				} else {
					resultado[i] = 0;
				}
			}
			v = 0;
			for (int i = 1; i < resultado.length ; i++) {
				
				if (resultado[i] == 1){
					v += beneficio[i];
					w += peso[i];
					System.out.println("Item " + beneficio[i] + " " + "Peso " + peso[i]);}
			}
			
			System.out.println("Peso da mochila de " + w + " ,com o valor de " + v);
			
			

		}
		
	}


