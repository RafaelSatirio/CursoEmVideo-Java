package resolucaodatela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoDaTela {

	public static void main(String[] args) {
		Toolkit tk = Toolkit.getDefaultToolkit();
	    Dimension d = tk.getScreenSize();
	    System.out.println("Largura da tela = " + d.width);
	    System.out.println("Altura da tela = " + d.height);
	    System.out.println("Resolução da tela = " + d.width + " X " + d.height);
	}

}
