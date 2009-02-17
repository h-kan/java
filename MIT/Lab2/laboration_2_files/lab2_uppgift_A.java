/*
 * Håkan Gullstrand
 * 04-02-09
 * Programmet frågar efter köp belopp och summa användaren betalde med
 * sedan räknar vi ut hur mycket växel och i vilka valörer dessa ska betalas
 * tillbaka med.
 */

import javax.swing.*;

public class lab2_uppgift_A {

	public static void main(String[] args) {
		
		int hundra, femtio, tjugo, tio, fem, en = 0; //deklarerar och initsierar variabler
		
		//Ta reda på hur mycket användaren handlat för
		String sTal1 = JOptionPane.showInputDialog("Ange vilket belopp du handlat för (max 999)");
		int iTal1 = Integer.parseInt(sTal1);
		
		//Ta reda på hur mycket avändaren betalade till kassören
		String sTal2 = JOptionPane.showInputDialog("Ange vilket belopp du betalar med (max 999)");
		int iTal2 = Integer.parseInt(sTal2);
		
		//Räkna ut och berätta hur mycket användaren ska få tillbaka
		int iSumma = iTal2 - iTal1;
		JOptionPane.showMessageDialog(null, "Din växel ska bli : "+iSumma+"\nTryck på ok så får du se vilka valörer du ska få tillbaka");
		
		//Kollar hur många gånger vart värde går i den nya summan och sparar det i respektvie variabel och presenterar det sedan
		hundra = iSumma/ 100;
		iSumma = iSumma  % 100;
		femtio = iSumma / 50;
		iSumma = iSumma % 50;
		tjugo = iSumma / 20;
		iSumma = iSumma % 20;
		tio = iSumma / 10;
		iSumma = iSumma % 10;
		fem = iSumma / 5;
		iSumma = iSumma % 5;
		en = iSumma / 1;
		
		//Visa vilka valörer för användaren
		JOptionPane.showMessageDialog(null, "\nHundra : "+hundra+ "\nFemtio : "+femtio+"\nTjugo : "+tjugo+"\nTio : "+tio+"\nFem : "+fem+"\nEn : "+en);
		System.exit(0);
	}

}