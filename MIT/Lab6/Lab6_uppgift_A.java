/*
 * Håkan Gullstrand
 * 12-03-05
 * Programmet frågar användaren efter 20 tal och visar sedan det högsta, lägsta och medelvärdet av dessa sammt skriver ut alla talen i 4 rader med 5 tal i var rad
 */



import java.io.*;

public class Lab6_uppgift_A {
	
	public static void main(String[] arg) throws IOException {
		

		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));


		int i=0; //räknare för while loopen
		int j=0; //räknare för arrayn
		int maxTal=0; 
		int minTal=0;
		int totalValue=0;
		int [] nummer = new int [20]; //Skappa en array med 20 indexeringar
		int intal=0;
		while(i<20)
		{	
			System.out.println("Mata in ett tal : ");

			try {
				intal = Integer.parseInt(stdin.readLine()); // läser in användarens tal
				nummer[j] = intal;  //lagrar användarens tal i arrayn
				j++; //stegar upp ett index i arrayn
				} 
			catch(NumberFormatException e) { // om val inte är ett giltligt värde så kör detta
				System.out.println("Inamatningen är ej ett tal!!!");
				}
			
			if(i==0)
			{
				minTal=intal;
				maxTal=intal;
			}
			else
			{
				if (intal<minTal) // om det inmatade talet är mindre än minTal variabeln så lagra det 
					minTal= intal;
				if (intal> maxTal) // om det inmatade taler är större än maxTal variabeln så lagra det
					maxTal = intal;
			}
			totalValue=intal; // lägg till det inmatade talet i totalVärde variabeln
			i++; //räkna upp vår räknare med 1
		}
		int medelValue = totalValue/20; //lagra medelvärdet i variabeln

		System.out.println("Högsta talet var : \t"+maxTal);
		System.out.println("Minsta talet var : \t"+minTal);
		System.out.println("Medel värdet var : \t"+medelValue);

		for (int k = 0; k < nummer.length;)  //så länge k är mindre än längden på vår array så loopa igenom nedanstående
		      System.out.print(nummer[k]+ ((++k%5)==0?"\n":"\t ") );
		    
		  }
	}


