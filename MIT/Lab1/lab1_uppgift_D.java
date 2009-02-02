/*
 * Användaren ska ange bredd och höjd så ska vi räkna ut arean
 * Detta exempel ska även klara decimaler så double används istället för int
 */

import javax.swing.*;

public class lab1_uppgift_D {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Programet räknar ut arean på en rektangel");
		String sbredd = JOptionPane.showInputDialog("Ange bredden på rektangeln");
		String slangd = JOptionPane.showInputDialog("Ange längden på rektangeln");
		double dbredd = Double.parseDouble(sbredd);// gör om inputen till double
		double dlangd = Double.parseDouble(slangd);
		double darea = dbredd * dlangd;
		JOptionPane.showMessageDialog(null, "Rektangelns area är : "+darea);
		System.exit(0);

	}

}
