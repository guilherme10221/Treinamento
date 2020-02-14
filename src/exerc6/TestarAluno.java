package exerc6;

import java.time.Month;
import java.time.Year;

import javax.swing.JOptionPane;

import org.joda.time.DateTime;
import org.joda.time.Days;

/**
 * Esta classe é responsável pelo teste do sistema de alunos.
 * @author gtbrito
 * @since 12/02/2020
 * @version 0.2
 */

public class TestarAluno {

	
	public static void main(String[] args) {
		
		String dataCompleta = JOptionPane.showInputDialog("Informe a data de Nascimento:");
		String data [] = dataCompleta.split ("/");
		int ano = Integer.parseInt(data[2]);
		int mes = Integer.parseInt(data[1]);
		int dia = Integer.parseInt(data[0]);
		
		String anoA = (new java.text.SimpleDateFormat("yyyy").format(new java.util.Date(System.currentTimeMillis())));	
		String mesA = (new java.text.SimpleDateFormat("MM").format(new java.util.Date(System.currentTimeMillis())));
		String dataA = (new java.text.SimpleDateFormat("dd").format(new java.util.Date(System.currentTimeMillis())));
		
		int anoAt = Integer.parseInt(anoA);
		int mesAt = Integer.parseInt(mesA);
		int diaAt = Integer.parseInt(dataA);
		
		
		
		DateTime dataInicial = new DateTime (ano,mes,dia,0,0);
		DateTime dataFinal = new DateTime (anoAt,mesAt,diaAt,0,0);
		
		int dias = Days.daysBetween(dataInicial, dataFinal).getDays();
		
		System.out.println("Você tem "+dias+ " dias de vida!");

	}
}




