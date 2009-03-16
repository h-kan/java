
/*
 * H�kan Gullstrand
 * 12-03-05
 * Programmet fr�gar anv�ndaren efter 20 tal och visar sedan det h�gsta, l�gsta och medelv�rdet av dessa sammt skriver ut alla talen i 4 rader med 5 tal i var rad
 */



import java.io.*;

public class Lab6_uppgift_A {
	
	public static void main(String[] arg) throws IOException {
		

		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));


		int i=0; //r�knare f�r uppr�kning under inmatning
		int minTal=Integer.MAX_VALUE; //variabel f�r minsta talet som just nu inneh�ller det h�gsta talet en int kan ha och d� blir vilket tal som helt l�gre
		int maxTal=Integer.MIN_VALUE; //variabel f�r h�gsta inmatade talet
		int totalValue=0; // varaibel f�r sammanlagda summan av inmatade tal
		int nums[][] = new int[4][5]; // array
		int intal=0; // variabaler f�r inamated talet
		
		for (int col=0; col<4; col++)
			for (int rad=0; rad<5; rad++) {
				System.out.println("Mata in tal " + (i++) + " : "); // fr�ga efter ett tal och skriv ut i s� vi vet hur m�nga g�nger vi fr�gat
				try 
				{
					intal = Integer.parseInt(stdin.readLine()); // l�ser in anv�ndarens tal
					nums[col][rad]=intal;
				} 
				catch(NumberFormatException e) { // om val inte �r ett giltligt v�rde s� k�r detta
					System.out.println("Inamatningen �r ej ett tal!!!");
				}
			
				if (intal<minTal) // om det inmatade talet �r mindre �n minTal variabeln s� lagra det 
					minTal= intal;
				if (intal> maxTal) // om det inmatade taler �r st�rre �n maxTal variabeln s� lagra det
					maxTal = intal;
				
				totalValue+=intal; // adera det inmatade talet i totalV�rde variabeln
			}
		
		float medelValue = totalValue/20; //lagra medelv�rdet i variabeln

		System.out.println("H�gsta talet var : \t"+maxTal);
		System.out.println("Minsta talet var : \t"+minTal);
		System.out.println("Medel v�rdet var : \t"+medelValue);

		for (int k = 0; k < 4; k++) //s� l�nge k �r mindre �n 4 s� k�r nedanst�ende 
		{
			for (int m=0;m<5;m++) //s� l�nge m �r mindre �n 5 s� skriv ut innehl�llet i v�r array, n�r 5 n�s s� skriv ut en radbrytning
			{
				System.out.print(nums[k][m]+"\t ");
			}
			System.out.print("\n");
			}
		}
}



