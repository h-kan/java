/*
 * H�kan Gullstrand
 * 12-02-09
 * Programmet fr�gar efter tal. R�knar hur m�nga tal som matats in sammt hur m�nga under, �ver och exakt 100
 * �ven medelv�rdet av talen under och �ver hundra ska presenteras. Anv�ndaren avbryter genom att ange ett negativt v�rde.
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
		
		
		JOptionPane.showMessageDialog(null, "Du skrev in totalt "+iRaknare+" tal och av dessa var "+iOver+" �ver hundra, "+iUnder+" under hundra och slutligen "+iHundra+" exakt hundra \n"+
				"Medeltalet av talen under hundra var: "+iUnderMedel+"\n Medeltalet f�r talen �ver hundra var: "+iOverMedel);
		System.exit(0);
				
	}

}

