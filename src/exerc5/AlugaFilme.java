package exerc5;

/**
 * Esta classe � respons�vel pelo sistema de aluguel de filmes
 * @author gtbrito
 * @since 12/02/2020
 * @version 0.1
 */

import javax.swing.JOptionPane;

public class AlugaFilme {

	double valdiario = 10;
	boolean inception1 = true;
	boolean stolen2 = true;
	double troco = 0;
	double total = 0;

	public boolean verificar() {

		int filme = Integer.parseInt(JOptionPane.showInputDialog("Alugar 1- inception ou 2 - stolen?: "));

		if (filme == 1) {
			if (inception1) {
				JOptionPane.showMessageDialog(null, "Filme Inception dispon�vel");
				return true;
			} else {
				JOptionPane.showMessageDialog(null, "Filme n�o dispon�vel!");
				return false;

			}
		} 
		
		else 
			if (filme == 2) {

			JOptionPane.showMessageDialog(null, "Filme Stolen dispon�vel");
			return true;

		} else {
			JOptionPane.showMessageDialog(null, "Filme n�o dispon�vel!");
			return false;
		   
		}		
		
	}

	public void calcular() {

		int qtdedias = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos dias voc� quer alugar:  "));
		double valpago = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor pago: ").replace(',', '.'));

		total = valdiario * qtdedias;
		troco = valpago - total;

		if (valpago < total) {
			JOptionPane.showMessageDialog(null, "O valor pago � insuficiente!");
		}
		if (valpago == total) {
			JOptionPane.showMessageDialog(null, "Filme alugado com sucesso!");
		}
		if (valpago > total) {
			JOptionPane.showMessageDialog(null, "Filme alugado com sucesso, o seu troco �: " + troco);
		}

	}

	public static void main(String[] args) {
		AlugaFilme a = new AlugaFilme();
		a.verificar();
		a.calcular();

	}

}
