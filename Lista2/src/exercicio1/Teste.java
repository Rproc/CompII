package exercicio1;

public class Teste {

	public static void main(String[] args) {

		Info pessoa = new Info();
		
		pessoa.setNome("Procópio");
		pessoa.setNomeMae("Geisa");
		pessoa.setNomePai("Wanderley");
		pessoa.setSexo("Masculino");
		pessoa.setDia(1);
		pessoa.setMes(12);
		pessoa.setAno(1993);
		pessoa.setNacionalidade("BR");
		pessoa.setEstadoCivil("Solteiro");
		pessoa.setAltura(170);
		pessoa.setPeso(90);
		
		System.out.println(pessoa.getNacionalidade() + "   " + pessoa.getEstadoCivil());
		
	}

}
