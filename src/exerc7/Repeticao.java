package exerc7;

import javax.swing.JOptionPane;

public class Repeticao {

	boolean exit = false;
	
	public Repeticao () {
		while (!exit) {
			processo();
		}
	}
			
			public void processo() {

				int opcao = (Integer.parseInt(JOptionPane.showInputDialog("Digite a opção")));

				switch (opcao) {

				case 1:
					JOptionPane.showInputDialog("Opção 1");
					break;

				case 2:
					JOptionPane.showInputDialog("Opção 2");
					break;

				case 3:
					JOptionPane.showInputDialog("Opção 3");
					break;

				case 9:
					exit = true;

				default:
					JOptionPane.showMessageDialog(null, "Opção inválida!");
					break;
				}

			}
			
			public void testaWhile() {
				int i = 10;
				while (i<10) {
					System.out.println(i + " ao cubo é " + ((i*i) *i));
				    i++;
					
				}
			}
			
			public void testaDoWhile() {
				int i = 10;
				do {
					System.out.println("System.out.println(i + \" ao cubo é \" + ((i*i) *i));");
			      i++;
				} 
				while 
				(i<10);
			
			}
}