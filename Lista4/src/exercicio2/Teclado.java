package exercicio2;

import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Teclado {

	final JPanel painelTexto = new JPanel();
	final JLabel textoNumeros = new JLabel("5122299");

	final JPanel painelTeclado = new JPanel();

	final JPanel painelBotoes = new JPanel();
	final ArrayList<JButton> botoesTeclado = new ArrayList<JButton>();

	final JButton botaoTra = new JButton("#");
	final JButton botaoSend = new JButton("Send");
	final JButton botaoEnd = new JButton("End");
	
	final JPanel tecladoCompleto = new JPanel();

	public Teclado() {
		
		for (int i = 0; i < 12; i++) {
	
			if (i < 9) {
				
				botoesTeclado.add(new JButton("" + (i+1)));
				continue;
			}			
			
			switch (i) {
			case 9:
				botoesTeclado.add(new JButton("*"));
				break;

			case 10:
				botoesTeclado.add(new JButton("0"));
				break;
				
			case 11:
				botoesTeclado.add(new JButton("#"));
				break;
			}
			
		}
		
		painelTexto.add(textoNumeros);

		painelTeclado.setLayout(new GridLayout(4, 3));
		
		for ( final JButton botaoAdd : botoesTeclado) {
			
			botaoAdd.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					super.mouseClicked(arg0);
					textoNumeros.setText(textoNumeros.getText() + botaoAdd.getText());
				}
			});
			
			painelTeclado.add(botaoAdd);
		
		}

		botaoSend.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				super.mouseClicked(arg0);
				System.out.println(textoNumeros.getText());
			}
		});
		
		botaoEnd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				super.mouseClicked(arg0);
				
			}
		});
		
		painelBotoes.add(botaoSend);
		painelBotoes.add(botaoEnd);
		
		tecladoCompleto.setLayout(new GridLayout(3, 1));
		tecladoCompleto.add(painelTexto);
		tecladoCompleto.add(painelTeclado);
		tecladoCompleto.add(painelBotoes);

	}

}
