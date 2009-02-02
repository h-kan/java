import javax.swing.JOptionPane;


public class lab3_uppgift_A {


	public static void main(String[] args) {
		
		int iraknare = -1;
		int iunder = -1;
		int iover = 0;
		int ihundra = 0;
		int ital = 0;
		
		while (ital >= 0) {
			String stal = JOptionPane.showInputDialog("Skriv in ett tal (avsluta genom att skriva ett negativt tal)");
			ital = Integer.parseInt(stal);
			iraknare = iraknare + 1;
			if (ital > 100)
				iover = iover +1;
			else if (ital < 100)
				iunder = iunder + 1;
			else 
				ihundra = ihundra +1;
		}
		
		JOptionPane.showMessageDialog(null, "Du skrev in totalt "+iraknare+" tal och av dessa var "+iover+" över hundra, "+iunder+" under hundra och slutligen "+ihundra+" exakt hundra");
		System.exit(0);
				
	}

}

