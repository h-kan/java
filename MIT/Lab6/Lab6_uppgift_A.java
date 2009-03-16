
/*
 * Håkan Gullstrand
 * 12-03-05
 * Programmet frågar användaren efter 20 tal och visar sedan det högsta, lägsta och medelvärdet av dessa sammt skriver ut alla talen i 4 rader med 5 tal i var rad
 */



import java.io.*;

public class Lab6_uppgift_A {
	
	public static void main(String[] arg) throws IOException {
		

		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));


		int i=0; //räknare för uppräkning under inmatning
		int minTal=Integer.MAX_VALUE; //variabel för minsta talet som just nu innehåller det högsta talet en int kan ha och då blir vilket tal som helt lägre
		int maxTal=Integer.MIN_VALUE; //variabel för högsta inmatade talet
		int totalValue=0; // varaibel för sammanlagda summan av inmatade tal
		int nums[][] = new int[4][5]; // array
		int intal=0; // variabaler för inamated talet
		
		for (int col=0; col<4; col++)
			for (int rad=0; rad<5; rad++) {
				System.out.println("Mata in tal " + (i++) + " : "); // fråga efter ett tal och skriv ut i så vi vet hur många gånger vi frågat
				try 
				{
					intal = Integer.parseInt(stdin.readLine()); // läser in användarens tal
					nums[col][rad]=intal;
				} 
				catch(NumberFormatException e) { // om val inte är ett giltligt värde så kör detta
					System.out.println("Inamatningen är ej ett tal!!!");
				}
			
				if (intal<minTal) // om det inmatade talet är mindre än minTal variabeln så lagra det 
					minTal= intal;
				if (intal> maxTal) // om det inmatade taler är större än maxTal variabeln så lagra det
					maxTal = intal;
				
				totalValue+=intal; // adera det inmatade talet i totalVärde variabeln
			}
		
		float medelValue = totalValue/20; //lagra medelvärdet i variabeln

		System.out.println("Högsta talet var : \t"+maxTal);
		System.out.println("Minsta talet var : \t"+minTal);
		System.out.println("Medel värdet var : \t"+medelValue);

		for (int k = 0; k < 4; k++) //så länge k är mindre än 4 så kör nedanstående 
		{
			for (int m=0;m<5;m++) //så länge m är mindre än 5 så skriv ut innehlållet i vår array, när 5 nås så skriv ut en radbrytning
			{
				System.out.print(nums[k][m]+"\t ");
			}
			System.out.print("\n");
			}
		}
}



