package exercicio1;

public class Pedido {

	private String data;
	private double hora;
	private ItemPedido item;
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public double getHora() {
		return hora;
	}
	public void setHora(double hora) {
		if (hora >= 0.0)
			this.hora = hora;
	}
	public ItemPedido getItem() {
		return item;
	}
	public void setItem(ItemPedido item) {
		this.item = item;
	}
	
}
