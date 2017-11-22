//Uma solução para o cálculo da idade levando em conta o dia e o mês de nascimento;

package RemoteSystemsTempFiles;

import java.util.Date;

public class Application {
	public static void main(String[] args) {
		HelloWorld h1 = new HelloWorld();
		h1.setNome("Gabriel");
		Date nascimentoH1 = HelloWorld.createDate("04/12/1980 12:00:00");
		h1.setNascimento(nascimentoH1);
		h1.imprimir();
		
		HelloWorld h2 = new HelloWorld();
		h2.setNome("Manoel");
		Date nascimentoH2 = HelloWorld.createDate("04/04/1980 12:00:00");
		h2.setNascimento(nascimentoH2);
		h2.imprimir();
	
		
		HelloWorld h3 = new HelloWorld();
		h3.setNome("Pedro");
		h3.setNascimento(new Date());
		h3.imprimir();
	}
}