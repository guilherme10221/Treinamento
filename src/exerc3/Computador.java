package exerc3;

/**
 * Esta classe é responsável para armazenar os atributos de Computador - Produto
 * @author gtbrito
 * @since 11/02/2020
 * @version 0.1
 */


public class Computador extends Produto {

	String processador = "I7";
	String memoria = "16gb RAM";
	String tela = " 29'";
	String hd = "2TB";
	String placavideo = "GTX 1050";
	
	public void exibirComputador () {
		if (processador != null) {
			System.out.println(processador);
		} else {
			System.out.println("erro");
		}
		if (memoria != null) {
			System.out.println(memoria);
		} else {
			System.out.println("erro");
		}
		if (tela != null) {
			System.out.println(tela);
		} else {
			System.out.println("erro");
		}
		if (hd != null) {
			System.out.println(hd);
		} else {
			System.out.println("erro");
		}
		if (placavideo != null) {
			System.out.println(placavideo);
		} else {
			System.out.println("erro");
		}
		exibirTudo ();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
