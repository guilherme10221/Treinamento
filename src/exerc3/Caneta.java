package exerc3;
/**
 * Esta classe é responsável para armazenar os atributos de Caneta - Produto
 * @author gtbrito
 * @since 11/02/2020
 * @version 0.1
 */
public class Caneta extends Produto {

String cor = "Azul";
String formato = "Padrão";
String marca ="Bic";

public void exibirCaneta (){
	
	
	if (cor != null) {
		System.out.println(cor);
	} else {
		System.out.println("erro");
	}
	if (formato != null) {
		System.out.println(formato);
	} else {
		System.out.println("erro");
	}
	if (marca != null) {
		System.out.println(marca);
	} else {
		System.out.println("erro");
	}

}









}
