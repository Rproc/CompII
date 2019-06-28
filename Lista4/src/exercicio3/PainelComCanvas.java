package exercicio3;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PainelComCanvas extends Canvas {

private static final long serialVersionUID = 1L;
	
	
	public PainelComCanvas() {

				class MousePressListener implements MouseListener {

					@Override
					public void mouseClicked(MouseEvent e) {

					}

					@Override
					public void mousePressed(MouseEvent e) {
						x = e.getX();
						y = e.getY();
						repaint();

					}

					@Override
					public void mouseReleased(MouseEvent e) {
						
					}

					@Override
					public void mouseEntered(MouseEvent e) {

					}

					@Override
					public void mouseExited(MouseEvent e) {

					}

				}
				
				MouseListener listener = new MousePressListener();
				addMouseListener(listener);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.fillOval(x, y, 20, 20);
	}
	
	int x = 0;
	int y = 0;

}

