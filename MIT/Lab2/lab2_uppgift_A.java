/*
 * H�kan Gullstrand
 * 04-02-09
 * Programmet fr�gar efter k�p belopp och summa anv�ndaren betalde med
 * sedan r�knar vi ut hur mycket v�xel och i vilka val�rer dessa ska betalas
 * tillbaka med.
 */

import javax.swing.*;

public class lab2_uppgift_A {

	public static void main(String[] args) {
		
		int hundra, femtio, tjugo, tio, fem, en = 0; //deklarerar och initsierar variabler
		
		//Ta reda p� hur mycket anv�ndaren handlat f�r
		String sTal1 = JOptionPane.showInputDialog("Ange vilket belopp du handlat f�r (max 999)");
		int iTal1 = Integer.parseInt(sTal1);
		
		//Ta reda p� hur mycket av�ndaren betalade till kass�ren
		String sTal2 = JOptionPane.showInputDialog("Ange vilket belopp du betalar med (max 999)");
		int iTal2 = Integer.parseInt(sTal2);
		
		//R�kna ut och ber�tta hur mycket anv�ndaren ska f� tillbaka
		int iSumma = iTal2 - iTal1;
		JOptionPane.showMessageDialog(null, "Din v�xel ska bli : "+iSumma+"\nTryck p� ok s� f�r du se vilka val�rer du ska f� tillbaka");
		
		//Kollar hur m�nga g�nger vart v�rde g�r i den nya summan och sparar det i respektvie variabel och presenterar det sedan
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
		
		//Visa vilka val�rer f�r anv�ndaren
		JOptionPane.showMessageDialog(null, "\nHundra : "+hundra+ "\nFemtio : "+femtio+"\nTjugo : "+tjugo+"\nTio : "+tio+"\nFem : "+fem+"\nEn : "+en);
		System.exit(0);
	}

}