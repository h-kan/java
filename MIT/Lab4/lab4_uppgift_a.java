/*
 * Håkan Gullstrand
 * 12-02-22
 * Programmet frågar efter antal körda km och antalet liter bensin som frörbrukats och räknar sedan ut snittförbrukningen
 * antingen i liter/km eller miles/gallon beroende på användarens val.
 */

import javax.swing.JOptionPane;


public class lab4_uppgift_a {
	
	public static void main(String[] args) {
		
		double km=0;
		double liter=0;
		
		while(true) {
			String s1 = JOptionPane.showInputDialog("BENSINFÖRBUKNING!\n Ange hur många Kilometer du har kört : ");
			km = Double.parseDouble(s1);
			String s2 = JOptionPane.showInputDialog("Ange hur många liter bensin du har förbrukat :  ");
			liter = Double.parseDouble(s2);
			
			String val = JOptionPane.showInputDialog("Snittförbrukning!\n Tryck på ''E'' för at  räkna ut förbrukningen enligt EU mått.\n" +
					"Tryck på ''U'' för att räkna ut förbrukningen enligt US mått.");
			switch(val.charAt(0)) { // kontrollera vilket tecken som befinner sig på index 0 (första tecknet)
			case 'e': case 'E':
				double eu = eu(liter, km); // kalla på eu metoden
				JOptionPane.showMessageDialog(null, "Din snittförbukning är "+eu+" liter per 100 km");
				break;
			case 'u': case 'U':
				double us = us(liter, km); // kalla på us metoden
				JOptionPane.showMessageDialog(null, "Din snittförbrukning är "+us+" miles per gallon");
				break;
			default: // om felaktigt tecken påträffas så visa medelande och gå till början av while loopen
				JOptionPane.showMessageDialog(null, "Du gjorde ett felaktigt val!");
			}
		}		
	}
	
	// Metod för att göra beräking enligt EU standard
	public static double eu (double a, double b) {
		return (b/a);
	}
	
	// Metod för att gör beräkning enligt US standard
	public static double us (double a, double b) {
		a = a / 3.785;
		b = b / 1.609;
		return b/a;
	}
}
