package RemoteSystemsTempFiles;

//package br.ufrpe.mpoo.helloworld;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class HelloWorld {
	private static final SimpleDateFormat FORMATADOR_HORA = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private String nome;
	private Date nascimento;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	//Metodo para criar objeto idade
	public static Date createDate(String data) {
		Date result = null;
		try {
			result = FORMATADOR_HORA.parse(data);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int getIdade() {
		Calendar calendarAtual = Calendar.getInstance();
		int anoAtual = calendarAtual.get(Calendar.YEAR);
		int mesAtual = calendarAtual.get(Calendar.MONTH);
		int diaAtual = calendarAtual.get(Calendar.DAY_OF_MONTH);
		
		
		
		Calendar calendarNascimento = Calendar.getInstance();
		calendarNascimento.setTime(this.nascimento);
		int idade;
		int anoNascimento = calendarNascimento.get(Calendar.YEAR);
		int mesNascimento = calendarNascimento.get(Calendar.MONTH);
		int diaNascimento = calendarNascimento.get(Calendar.DAY_OF_MONTH);
		
		//Calculando idade
		//int idade = anoAtual-anoNascimento;
		int anosDeVida = anoAtual - anoNascimento;		
		if (mesAtual >= mesNascimento && diaAtual >= diaNascimento){
			idade = anosDeVida;
		} else {
			idade = anosDeVida-1; 
		}	
		
		return idade;
	}
	
	public void imprimir() {
		String sNascimento = FORMATADOR_HORA.format(this.nascimento);
		System.out.println(this.nome + " nasceu em " + sNascimento + " e tem " + this.getIdade() + " anos");
	}
}
