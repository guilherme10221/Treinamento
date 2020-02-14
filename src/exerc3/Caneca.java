package exerc3;
/**
 * Esta classe é responsável para armazenar os atributos de Caneca - Produto
 * @author gtbrito
 * @since 11/02/2020
 * @version 0.1
 */
public class Caneca extends Produto {
	
	boolean estampa = false;
	String material = "Porcelana";
	String medida = "GG";
	
	public void exibirCaneca () {
		if (estampa == true) {
			System.out.println("Sem Estampa");
		}
		else {
			System.out.println("Com Estampa");
		}
		
		if (material != null) {
			System.out.println(material);
		} else {
			System.out.println("erro");
		}
		if (medida != null) {
			System.out.println (medida);
		} else {
			System.out.println("erro");
		}

	
		






}

	}

