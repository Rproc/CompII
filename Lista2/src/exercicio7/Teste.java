package exercicio7;

import java.sql.Date;

public class Teste {

	public static void main(String[] args) {
	
			
		Aluno aluno = new Aluno("João", "123456789-01");
		aluno.getNotas().add(new Nota(2, new Date(2013-1900, 2, 1)));
		aluno.getNotas().add(new Nota(5.5, new Date(2013-1900, 3, 5)));
			
		Aluno a = new Aluno("José", "123456789-01");
		a.getNotas().add(new Nota(7, new Date(2013-1900, 2, 1)));
		a.getNotas().add(new Nota(8.5, new Date(2013-1900, 3, 5)));
		
		aluno.printarDados();
		a.printarDados();
		
	}


}


