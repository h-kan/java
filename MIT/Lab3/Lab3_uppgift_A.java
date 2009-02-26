/*
 * Håkan Gullstrand
 * 12-02-09
 * Programmet frågar efter tal. Räknar hur många tal som matats in sammt hur många under, över och exakt 100
 * Även medelvärdet av talen under och över hundra ska presenteras. Användaren avbryter genom att ange ett negativt värde.
 */

import javax.swing.JOptionPane;


public class Lab3_uppgift_A {


	public static void main(String[] args) {
		
		int iRaknare = -1;
		int iUnder = 0;
		int iOver = 0;
		int iHundra = 0;
		int iTal = 0;
		int iUnderSumma = 0;
		int iOverSumma = 0;
		double iUnderMedel = 0;
		double  iOverMedel = 0;
		
		while (iTal >= 0) {
			String sTal = JOptionPane.showInputDialog("Skriv in ett tal (avsluta genom att skriva ett negativt tal)");
			iTal = Integer.parseInt(sTal);
			iRaknare = iRaknare + 1;
			if (iTal > 100){
				iOver = iOver +1;
				iOverSumma = iOverSumma + iTal;
				iOverMedel = (double)iOverSumma / iOver;
			}
			else if (iTal >0&&iTal<100){
				iUnder = iUnder + 1;
				iUnderSumma = iUnderSumma + iTal;
				iUnderMedel = (double)iUnderSumma / iUnder;
			}
			else 
				iHundra = iHundra +1;
		}
		
		
		JOptionPane.showMessageDialog(null, "Du skrev in totalt "+iRaknare+" tal och av dessa var "+iOver+" över hundra, "+iUnder+" under hundra och slutligen "+iHundra+" exakt hundra \n"+
				"Medeltalet av talen under hundra var: "+iUnderMedel+"\n Medeltalet för talen över hundra var: "+iOverMedel);
		System.exit(0);
				
	}

}

