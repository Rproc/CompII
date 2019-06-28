package exercicio5;

import javax.swing.JFrame;

public class Teste {

	public static void main(String[] args) {
		
		JFrame janela = new JFrame("Window");
		janela.setSize(300, 300);
		
		PainelDois a = new PainelDois();
		
		janela.getContentPane().add(a.getPainelCompleto());
		
		janela.setVisible(true);
		
		
	}
}
