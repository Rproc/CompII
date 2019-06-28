package exercicio8;

public class FuncaoAgregadora extends Funcao{
	
	Funcao [] func;
	private double result = 0;
	
	public double fx (Funcao [] func){
		
		for (int i = 0; i < func.length; i++) {
			
			result = result + fx(i);
		}
		
		return result;
	}

	public double getResult(){
		
		return result;
	}
}
