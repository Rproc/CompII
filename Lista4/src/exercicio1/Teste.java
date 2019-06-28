package exercicio1;

import javax.swing.JFrame;

public class Teste {

	public static void main(String[] args) {
		
		final JFrame janela = new JFrame("L1");
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(300, 300);
		
		Teclado tecladoUm = new Teclado();
		
		
		
		janela.getContentPane().add(tecladoUm.tecladoCompleto);
		
		
		janela.setVisible(true);
	}
}
