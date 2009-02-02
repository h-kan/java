import javax.swing.*;
import java.awt.*;

public class lab2_uppgift_A {

	public static void main(String[] args) {
		
		int hundra, femtio, tjugo, tio, fem, en = 0; //deklarerar och initsierar variabler
		
		//Fårgar efter belopp och och subtraherar detta ifrån beloppet som betals in för att få ut vad personen ska få tillbaka
		String stal1 = JOptionPane.showInputDialog("Ange vilket belopp du handlat för (max 999)");
		int ital1 = Integer.parseInt(stal1);
		String stal2 = JOptionPane.showInputDialog("Ange vilket belopp du betalar med (max 999)");
		int ital2 = Integer.parseInt(stal2);
		int isumma = ital2 - ital1;
		JOptionPane.showMessageDialog(null, "Din växel ska bli : "+isumma+"\nTryck på ok så får du se vilka valörer du ska få tillbaka");
		
		//Kollar hur många gånger vart värde går i den nya summan och sparar det i respektvie variabel och presenterar det sedan
		hundra = isumma/ 100;
		isumma = isumma  % 100;
		femtio = isumma / 50;
		isumma = isumma % 50;
		tjugo = isumma / 20;
		isumma = isumma % 20;
		tio = isumma / 10;
		isumma = isumma % 10;
		fem = isumma / 5;
		isumma = isumma % 5;
		en = isumma / 1;
		JOptionPane.showMessageDialog(null, "\nHundra : "+hundra+ "\nFemtio : "+femtio+"\nTjugo : "+tjugo+"\nTio : "+tio+"\nFem : "+fem+"\nEn : "+en);
		System.exit(0);
	}

}