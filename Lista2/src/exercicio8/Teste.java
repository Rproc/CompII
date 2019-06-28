package exercicio8;

import java.util.Date;

public class Teste {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Aluno alunoUm = new Aluno("Joao", "123456789-01");
		alunoUm.addNota(2, new Date(2013-1900, 2, 1));
		alunoUm.addNota(5.5, new Date(2013-1900, 3, 5));
		
		Aluno alunoDois = new Aluno("Jose", "123456789-01");
		alunoDois.addNota(7, new Date(2013-1900, 2, 1));
		alunoDois.addNota(8.5, new Date(2013-1900, 3, 5));
		
		alunoUm.printarDados();
		alunoDois.printarDados();
	}
}
