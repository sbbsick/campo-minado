package campominado;

import campominado.modelo.Tabuleiro;
import campominado.visao.TabuleiroTerminal;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		
		Tabuleiro tabuleiro = new Tabuleiro(10, 10, 5);
		new TabuleiroTerminal(tabuleiro);
		
	}

}
