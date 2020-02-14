package exerc6;

import java.time.Year;
import java.util.Calendar;
import java.util.Date;

/**
 * Esta classe é responsável pelo sistema de alunos.
 * 
 * @author gtbrito
 * @since 12/02/2020
 * @version 0.1
 */

public class Aluno {

	String nome;
	int anoNasc;
	String curso;
	String cidade;
	int idade;
	String data;
	String dataNasc;

	public Aluno() {

	}

	public Aluno(String nome, int anoNasc, String curso, String cidade) {
		this.nome = nome;
		this.anoNasc = anoNasc;
		this.curso = curso;
		this.cidade = cidade;

	}

	public int CalculoAno() {
		Year y = Year.now();
		int ano = y.getValue();
		idade = ano - anoNasc;
		return idade;
	}

	public void exibirTudo() {
		System.out.println("O aluno de nome " + nome + " do curso " + curso + " residente na Cidade " + cidade + " tem "
				+ CalculoAno() + " anos de idade.");
	}

	public int pegardataatual() {

		String data = (new java.text.SimpleDateFormat("yyyyMMdd").format(new java.util.Date(System.currentTimeMillis())));
		return Integer.parseInt(data);
	}
	
	
	
		public int pegardatanascimento () {
			
			String dataNascimento = (new java.text.SimpleDateFormat("yyyyMMdd")
				.format(new java.util.Date(dataNasc)));
		return Integer.parseInt(dataNascimento);

		}
		
	 
		
	

	
	
		
		
		
		
		
	}
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	


