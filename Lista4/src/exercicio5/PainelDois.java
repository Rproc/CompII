package exercicio5;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PainelDois {

	final JLabel salariBaseLabel = new JLabel("Salario Base: ");
	final JTextField salarioBaseText = new JTextField(6);
	final JPanel painelSalarioBase = new JPanel();
	
	final JCheckBox vendedorCheckBox = new JCheckBox();
	final JLabel vendedorLabel = new JLabel("Vendedor");
	final JTextField comissaoText = new JTextField(6);
	final JLabel comissaoLabel = new JLabel("% Comissão");
	final JPanel painelVendedor = new JPanel();
	
	final JButton calcBotao = new JButton("Calcular");
	final JLabel valorSalarioBaseLabel = new JLabel("R$ 00,00");
	final JPanel painelCalcValor = new JPanel();
	
	private final JPanel painelCompleto = new JPanel();
	
	public PainelDois() {

		painelSalarioBase.add(salariBaseLabel); 
		painelSalarioBase.add(salarioBaseText);
		
		painelVendedor.add(vendedorCheckBox);
		painelVendedor.add(vendedorLabel);
		painelVendedor.add(comissaoText);
		painelVendedor.add(comissaoLabel);
		comissaoText.setVisible(false);
		comissaoLabel.setVisible(false);
		
		painelCalcValor.add(calcBotao);
		painelCalcValor.add(valorSalarioBaseLabel);
		
		painelCompleto.setLayout(new GridLayout(3, 1));
		painelCompleto.add(painelSalarioBase);
		painelCompleto.add(painelVendedor);
		painelCompleto.add(painelCalcValor);
	
		vendedorCheckBox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				if (vendedorCheckBox.isSelected()){
					comissaoText.setVisible(true);
					comissaoLabel.setVisible(true);
				}
				if (!vendedorCheckBox.isSelected()){
					comissaoText.setVisible(false);
					comissaoLabel.setVisible(false);
				}
				
			}
		});
		
		calcBotao.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				super.mouseClicked(arg0);
				
				Funcionario funcionario;
				
				if (vendedorCheckBox.isSelected()){
					funcionario = new Vendedor(new Porcentagem( (double) new Integer(comissaoText.getText()) ));
					funcionario.setSalarioBase(new Moeda("real", (double) new Integer(salarioBaseText.getText()) ) );

					valorSalarioBaseLabel.setText("R$ " + funcionario.obterPagamento().getValor());
					
				}else {
					funcionario = new Funcionario();
					funcionario.setSalarioBase(new Moeda("real", (double) new Integer(salarioBaseText.getText()) ) );
					
					valorSalarioBaseLabel.setText("R$ " + funcionario.obterPagamento().getValor());
					
				}
				
				
				
			}
		});
	}

	public JPanel getPainelCompleto() {
		return painelCompleto;
	}
	
}
