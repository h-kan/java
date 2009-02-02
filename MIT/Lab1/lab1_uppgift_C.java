/*
 * Fårga användaren efter hur mycket de har handlat för och dra bort rabbaten från summan 
 * Rabbaten är satt till 5 och summan måste vara mer än 10 
 */

import javax.swing.*;

public class lab1_uppgift_C {

	public static void main(String[] args) {
		int irabbat = 5;
		String skopesumma = JOptionPane.showInputDialog("Din köpesumma minskas med rabatten: "+irabbat+ "\nAnge din köpesumma vilket måste vara över 10");
		int ikopesumma = Integer.parseInt(skopesumma);
		int islutsumma = ikopesumma - irabbat;
		JOptionPane.showMessageDialog(null, "Den slutgiltliga summan efter rabbaten är: "+islutsumma);
		System.exit(0);

	}

}
