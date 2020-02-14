package exerc3;
/**
 * Esta classe é responsável para armazenar os atributos de Carro - Produto
 * @author gtbrito
 * @since 11/02/2020
 * @version 0.1
 */

public class Carro extends Produto {

	String marca = "Hyundai";
	String modelo = "Hb20S";
	String ano = "2018";
	String cor = "Branco";
	String motor = "1.6";
	
	public void exibirCarro (){
		if (marca != null) {
			System.out.println(marca);
		} else {
			System.out.println("erro");
		}
		
		if (modelo != null) {
			System.out.println(modelo);
		} else {
			System.out.println("erro");
		}
		if (ano != null) {
			System.out.println(ano);
		} else {
			System.out.println("erro");
		}
		if (cor != null) {
			System.out.println(cor);
		} else {
			System.out.println("erro");
		}
		if (motor != null) {
			System.out.println(motor);
		} else {
			System.out.println("erro");
		}
	}





}

