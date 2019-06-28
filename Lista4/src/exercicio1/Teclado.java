package exercicio1;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Teclado {

	final JPanel painelTexto = new JPanel();
	final JLabel textoNumeros = new JLabel("5122299");

	final JPanel painelTeclado = new JPanel();

	final JPanel painelBotoes = new JPanel();
	final JButton botaoSend = new JButton("Send");
	final JButton botaoEnd = new JButton("End");
	
	final JPanel tecladoCompleto = new JPanel();

	public Teclado() {
		painelTexto.add(textoNumeros);

		painelTeclado.setLayout(new GridLayout(4, 3));
		for (int i = 0; i < 12; i++) {

			if (i < 9) {
				painelTeclado.add(new JButton("" + (i + 1)));
		}

			switch (i) {
			case 9:
				painelTeclado.add(new JButton("*"));
				break;
			case 10:
				painelTeclado.add(new JButton("0"));
				break;
			case 11:
				painelTeclado.add(new JButton("#"));
				break;

			}

		}

		painelBotoes.add(botaoSend);
		painelBotoes.add(botaoEnd);
		
		tecladoCompleto.setLayout(new GridLayout(3, 1));
		tecladoCompleto.add(painelTexto);
		tecladoCompleto.add(painelTeclado);
		tecladoCompleto.add(painelBotoes);

	}
}
