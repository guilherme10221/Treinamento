package exerc7;

import javax.swing.JOptionPane;

/**
 * Esta classe é responsável pelo teste do sistema de pesquisa de carros na
 * locadora.
 * 
 * @author gtbrito
 * @since 13/02/2020
 * @version 0.1
 */

public class Locadora {

	static Carro vetorCarro[];
    boolean exit = false;
	public Locadora() {
		processar();
	}
	
	public void Repeticao() {
		while (!exit) {
			processar();
		}
	}
	
	public void processar() {
		int buscador = (Integer.parseInt(JOptionPane.showInputDialog(
				"Busque seu carro! \n 1 - para buscar por modelo. \n 2 - para buscar por velocidade. \n 3 - para buscar por combustivel  \n 4 - para ver todos os modelos disponíveis. \n 5 - para buscar por cor \n 6 - para efetuar uma compra \n 9 - para encerrar!")));

		switch (buscador) {

		case 1:
			buscarModelo();
			break;

		case 2:
			buscarVelocidade();
			break;

		case 3:
			buscarCombustivel();
			break;

		case 4:
			buscarTodos();
			break;

		case 5:
			buscarCor();
			break;

		case 6:
			comprarCarro();
			break;

		case 9:
			break;

		default:
			JOptionPane.showMessageDialog(null, "Opção inválida!");
			break;
		}

	}

	public void buscarModelo() {
		boolean achei = false;
        
		String buscarModelo = JOptionPane.showInputDialog("Digite o modelo do carro: ").toUpperCase();
		String message = "";
		for (int i = 0; i < vetorCarro.length; i++) {
			if (vetorCarro[i].modelo.equals(buscarModelo)) {
				message = message + "\n Modelo: " + vetorCarro[i].modelo + "\n" + "\n Combustível: "
						+ vetorCarro[i].combustivel + "\n" + "\n Placa:  " + vetorCarro[i].placa + "\n"
						+ "\n Valor do carro: " + vetorCarro[i].valor + "\n" + "\n Velocidade máxima: "
						+ vetorCarro[i].velmax + "\n" + "\n Cor: " + vetorCarro[i].cor + "\n";
				achei = true;
			}
		}

		if (!achei) {
			JOptionPane.showMessageDialog(null, "Não temos esse modelo em estoque!");
			Repeticao();
		} else {
			JOptionPane.showMessageDialog(null, message);
			Repeticao();
		}

	}

	public void buscarVelocidade() {
		boolean achei = false;
		
		int buscarVelocidade = (Integer
				.parseInt(JOptionPane.showInputDialog("Digite a velocidade do carro: ").toUpperCase()));
		String message = "";
		for (int i = 0; i < vetorCarro.length; i++) {
			if (vetorCarro[i].velmax == (buscarVelocidade)) {

				message = message + "\n Modelo: " + vetorCarro[i].modelo + "\n" + "\n Combustível: "
						+ vetorCarro[i].combustivel + "\n" + "\n Placa:  " + vetorCarro[i].placa + "\n"
						+ "\n Valor do carro: " + vetorCarro[i].valor + "\n" + "\n Velocidade máxima: "
						+ vetorCarro[i].velmax + "\n" + "\n Cor: " + vetorCarro[i].cor + "\n";
				achei = true;
				exit = true;
			}

		}
		if (!achei) {
			JOptionPane.showMessageDialog(null, "Não temos esse modelo em estoque!");
			exit = true;
		} 
		else {
			JOptionPane.showMessageDialog(null, message);
			Repeticao();
		}

	}

	public void buscarCombustivel() {
		boolean achei = false;
		String buscarCombustivel = JOptionPane.showInputDialog("Digite o Combustivel do carro: ").toUpperCase();
		String message = "";
		for (int i = 0; i < vetorCarro.length; i++) {
			if (vetorCarro[i].combustivel.equals(buscarCombustivel)) {

				message = message + "\n Modelo: " + vetorCarro[i].modelo + "\n" + "\n Combustível: "
						+ vetorCarro[i].combustivel + "\n" + "\n Placa:  " + vetorCarro[i].placa + "\n"
						+ "\n Valor do carro: " + vetorCarro[i].valor + "\n" + "\n Velocidade máxima: "
						+ vetorCarro[i].velmax + "\n" + "\n Cor: " + vetorCarro[i].cor + "\n";
				achei = true;
			
			}

		}
		if (!achei) {
			JOptionPane.showMessageDialog(null, "Não temos esse modelo em estoque!");
			Repeticao();
		} else {
			JOptionPane.showMessageDialog(null, message);
			Repeticao();
		}

	}

	public void buscarTodos() {
		for (int i = 1; i < vetorCarro.length; i++) {
			for (int j = 0; j < i; j++) {
				if (vetorCarro[i].valor > vetorCarro[j].valor) {
					Carro temp = new Carro();
					temp = vetorCarro[i];
					vetorCarro[i] = vetorCarro[j];
					vetorCarro[j] = temp;
				}
			}

		}
		String message = "";
		for (int i = 0; i < vetorCarro.length; i++) {

			message = message + "\n Modelo: " + vetorCarro[i].modelo + "\n" + "\n Combustível: "
					+ vetorCarro[i].combustivel + "\n" + "\n Placa:  " + vetorCarro[i].placa + "\n"
					+ "\n Valor do carro: " + vetorCarro[i].valor + "\n" + "\n Velocidade máxima: "
					+ vetorCarro[i].velmax + "\n" + "\n Cor: " + vetorCarro[i].cor + "\n";
		}
	}

	public void buscarCor() {
		boolean achei = false;
		String buscarCor = JOptionPane.showInputDialog("Digite a cor do carro que você busca: ").toUpperCase();
		String message = "";
		for (int i = 0; i < vetorCarro.length; i++) {
			if (vetorCarro[i].cor.equals(buscarCor)) {

				message = message + "\n Modelo: " + vetorCarro[i].modelo + "\n" + "\n Combustível: "
						+ vetorCarro[i].combustivel + "\n" + "\n Placa:  " + vetorCarro[i].placa + "\n"
						+ "\n Valor do carro: " + vetorCarro[i].valor + "\n" + "\n Velocidade máxima: "
						+ vetorCarro[i].velmax + "\n" + "\n Cor: " + vetorCarro[i].cor + "\n";
				achei = true;
			}

		}
		if (!achei) {
			JOptionPane.showMessageDialog(null, "Não temos esse modelo em estoque!");
			Repeticao();
		} else {
			JOptionPane.showMessageDialog(null, message);
			Repeticao();
		}

	}

	public void comprarCarro() {
		boolean achei = false;
		
		String comprarModelo = JOptionPane.showInputDialog("Digite o modelo do carro que você procura").toUpperCase();
		String comprarCor = JOptionPane.showInputDialog("Digite a cor do carro que você procura").toUpperCase();

		for (int I = 1; I < vetorCarro.length; I++) {
			for (int j = 0; j < I; j++) {
				if (vetorCarro[I].valor < vetorCarro[j].valor) {
					Carro temp = new Carro();
					temp = vetorCarro[I];
					vetorCarro[I] = vetorCarro[j];
					vetorCarro[j] = temp;

				}
			}
		}
		String message = "";
		for (int i = 0; i < vetorCarro.length; i++) {

			if (vetorCarro[i].modelo.equals(comprarModelo) && (vetorCarro[i].cor.equals(comprarCor))) {

				message = message + "\n Modelo: " + vetorCarro[i].modelo + "\n" + "\n Combustível: "
						+ vetorCarro[i].combustivel + "\n" + "\n Placa:  " + vetorCarro[i].placa + "\n"
						+ "\n Valor do carro: " + vetorCarro[i].valor + "\n" + "\n Velocidade máxima: "
						+ vetorCarro[i].velmax + "\n" + "\n Cor: " + vetorCarro[i].cor + "\n";
				achei = true;
			}

		}
		if (!achei) {
			JOptionPane.showMessageDialog(null, "Não temos esse modelo em estoque!");
			Repeticao();
		} else {
			JOptionPane.showMessageDialog(null, message);
			Repeticao();
		}

	}

	public static void main(String[] args) {

		vetorCarro = new Carro[10];
		Carro carro1 = new Carro("HB20", "NUM-0000", 190, "FLEX", 38.900, "BRANCO");
		Carro carro2 = new Carro("GOL", "NUM-1111", 200, "FLEX", 41.900, "VERMELHO");
		Carro carro3 = new Carro("AMAROK", "NUM-2222", 220, "DIESEL", 101.900, "PRETO");
		Carro carro4 = new Carro("CELTA", "NUM-3333", 120, "ALCOOL", 18.900, "LARANJA");
		Carro carro5 = new Carro("CIVIC", "NUM-4444", 250, "GASOLINA", 40.900, "PRATA");
		Carro carro6 = new Carro("UP", "NUM-5555", 180, "FLEX", 44.900, "MARROM");
		Carro carro7 = new Carro("COROLLA", "NUM-6666", 260, "FLEX", 61.900, "BRANCO");
		Carro carro8 = new Carro("SIENA", "NUM-7777", 140, "ALCOOL", 26.900, "AZUL");
		Carro carro9 = new Carro("FOX", "NUM-8888", 140, "FLEX", 26.900, "AZUL");
		Carro carro10 = new Carro("COROLLA", "NUM-1010", 320, "GASOLINA", 45.900, "BRANCO");

		vetorCarro[0] = carro1;
		vetorCarro[1] = carro2;
		vetorCarro[2] = carro3;
		vetorCarro[3] = carro4;
		vetorCarro[4] = carro5;
		vetorCarro[5] = carro6;
		vetorCarro[6] = carro7;
		vetorCarro[7] = carro8;
		vetorCarro[8] = carro9;
		vetorCarro[9] = carro10;

		new Locadora();

	}

}
