/*
 * H�kan Gullstrand
 * 12-03-05
 * Programmet fr�gar anv�ndaren efter 20 tal och visar sedan det h�gsta, l�gsta och medelv�rdet av dessa sammt skriver ut alla talen i 4 rader med 5 tal i var rad
 */



import java.io.*;

public class Lab6_uppgift_A {
	
	public static void main(String[] arg) throws IOException {
		

		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));


		int i=0; //r�knare f�r while loopen
		int j=0; //r�knare f�r arrayn
		int maxTal=0; 
		int minTal=0;
		int totalValue=0;
		int [] nummer = new int [20]; //Skappa en array med 20 indexeringar
		int intal=0;
		while(i<20)
		{	
			System.out.println("Mata in ett tal : ");

			try {
				intal = Integer.parseInt(stdin.readLine()); // l�ser in anv�ndarens tal
				nummer[j] = intal;  //lagrar anv�ndarens tal i arrayn
				j++; //stegar upp ett index i arrayn
				} 
			catch(NumberFormatException e) { // om val inte �r ett giltligt v�rde s� k�r detta
				System.out.println("Inamatningen �r ej ett tal!!!");
				}
			
			if(i==0)
			{
				minTal=intal;
				maxTal=intal;
			}
			else
			{
				if (intal<minTal) // om det inmatade talet �r mindre �n minTal variabeln s� lagra det 
					minTal= intal;
				if (intal> maxTal) // om det inmatade taler �r st�rre �n maxTal variabeln s� lagra det
					maxTal = intal;
			}
			totalValue=intal; // l�gg till det inmatade talet i totalV�rde variabeln
			i++; //r�kna upp v�r r�knare med 1
		}
		int medelValue = totalValue/20; //lagra medelv�rdet i variabeln

		System.out.println("H�gsta talet var : \t"+maxTal);
		System.out.println("Minsta talet var : \t"+minTal);
		System.out.println("Medel v�rdet var : \t"+medelValue);

		for (int k = 0; k < nummer.length;)  //s� l�nge k �r mindre �n l�ngden p� v�r array s� loopa igenom nedanst�ende
		      System.out.print(nummer[k]+ ((++k%5)==0?"\n":"\t ") );
		    
		  }
	}


