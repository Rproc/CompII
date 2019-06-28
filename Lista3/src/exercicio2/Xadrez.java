package exercicio2;

enum JogadoresXadrez {BRANCO, PRETO}

public class Xadrez {

		JogadoresXadrez jogadorUm = JogadoresXadrez.PRETO;
		JogadoresXadrez jogadorDois = JogadoresXadrez.BRANCO;
		
		public JogadoresXadrez getPrimeiroJogador() {
			
			return JogadoresXadrez.BRANCO;
		}
		
}

