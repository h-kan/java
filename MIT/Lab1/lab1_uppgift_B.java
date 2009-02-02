/* Laboration 1 uppgift B
 * Fråga användaren efter deras ålder och ge till baka talet igen
 */

import javax.swing.*;

public class lab1_uppgift_B {

	public static void main(String[] args) {
		String salder = JOptionPane.showInputDialog("Ange din ålder");
		short ialder = Short.parseShort(salder);
		JOptionPane.showMessageDialog(null, "Du är "+ialder+ " år gammal eller ung" );
		System.exit(0);

	}

}
