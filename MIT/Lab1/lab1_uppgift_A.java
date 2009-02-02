/* Laboration 1 uppgift A
 * Fråga efter två heltal och addera dessa. Visa sedan summan för användaren
 */

import javax.swing.*;	//importera swing så jag kan få lite gui

public class lab1_uppgift_A {

	public static void main(String[] args) {
		String stal1 = JOptionPane.showInputDialog("Ange ett heltal");
		int ital1 = Integer.parseInt(stal1); //gör om string till int
		String stal2 = JOptionPane.showInputDialog("Ange ett  till heltal");
		int ital2 = Integer.parseInt(stal2); //gör om string till int
		int isumma = ital1 + ital2; //nu när vi har två int'ar kan vi addera dessa och spara resultatet i integern summa
		JOptionPane.showMessageDialog(null,  "När dina två tal adderas blir summan : " +isumma);
		System.exit(0);

	}

}
