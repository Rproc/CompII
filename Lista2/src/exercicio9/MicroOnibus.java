package exercicio9;

import java.util.ArrayList;

public class MicroOnibus {

	private int lotacaoMaxima;
	private double kg;
	ArrayList<Pessoa> pessoas = new ArrayList <Pessoa>();
	
	public MicroOnibus(int n, double k){
		lotacaoMaxima = n;
		kg = k;	
	}
	
	public void addPessoas(String nome, double peso){
		Pessoa pessoa1 = new Pessoa(peso, nome);
		pessoas.add(pessoa1);
	}
	
	public void verificarPeso(){
		double pesoTotal = 0;
		
		for(int i = 0; i<pessoas.size(); i++){
			pesoTotal = pesoTotal + pessoas.get(i).getPeso();
		}
		if(pesoTotal < kg){
			System.out.println("PESO DENTRO DO PERMITIDO");
		}else{
			System.out.println("PESO ULTRAPASSADO");
		}
	}
}
