package exercicio3;

import javax.swing.JFrame;

public class Teste {

	public static void main(String[] args) {

		final JFrame janela = new JFrame("Desenho Canvas");
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(300, 300);

		PainelComCanvas painelCanvas1 = new PainelComCanvas();

		janela.getContentPane().add(painelCanvas1);

		janela.setVisible(true);
	}
}
