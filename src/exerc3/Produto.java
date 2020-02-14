package exerc3;

/**
 * Esta classe � respons�vel para armazenar os atributos de Produto
 * @author gtbrito
 * @since 11/02/2020
 * @version 0.2
 */
 
public class Produto {
		
	 String nome = " ";
	 int quantidade = 100;
	 double custo = 1500;
	 int qtdevend = 5;
	 double percenlucro =  0.6;
	 double valor = 0;
	 double lucro = 0;
	 
	 public void exibirNome () { 
		 if (nome != null) {
        System.out.println("O produto "+nome);
		} 
		 else {
		System.out.println("Nome inv�lido!");
		}
		 
	 }
	 public void exibirValor () {
		 
		 valor = (custo+percenlucro) + custo;
		 if (valor > 0) {
			 System.out.println("de valor "+valor);
		} else {
			System.out.println("Valor inv�lido!");
		}
		 
		 
	 }
	 
	 public void exibirLucro () {
		 
		 lucro = custo*percenlucro;
		 
		 if (lucro > 0) {
			 System.out.println("equivalente em R$: "+lucro);
		} else {
			System.out.println("Valor inv�lido!");
		}
	 
	 }
	 
	 public void exibirTudo () {
	   exibirNome ();
	   exibirValor ();
	   exibirLucro ();
	 
	 }
 
	 
		
		
	}
	
	


