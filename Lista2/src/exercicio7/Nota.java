package exercicio7;

import java.sql.Date;

public class Nota {

	private double valor;
	private Date data;
	
	public Nota(double valor, Date date) {
		
		this.setValor(valor);
		this.setData(date);
	}
	
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
		
}
