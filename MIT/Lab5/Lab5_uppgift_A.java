/*
 * H�kan Gullstrand
 * 12-02-26
 * Programmet fr�gar anv�ndaren efter ett val. Beroende av val ska 3 olika figurer ritas ut. Dessa ska i sin tur buggas up av olika metoder och
 * i ett av fallen kan blir figuren en viss h�jd beroende av anv�ndares val.
 */



import java.io.*;

public class Lab5_uppgift_A {
	
	public static void main(String[] arg) throws IOException {
		

		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		
		
		while(true) {	
		int val1 = 0; // initsierar variabler
		int val2 = 0;
		
		// l�s in anv�ndarens val
		System.out.println("V�lj ett av f�ljande alternativ! Skriv en av siffrorna och tryck p� enter :\n1 : Skriv ut en pojke\n2 : Skriv ut en flicka\n3 : Skriv ut en raket\n4 : Avsluta programmet");
		 try {
			   val1 = Integer.parseInt(stdin.readLine()); // l�ser in anv�ndarens val
			   } 
		 catch(NumberFormatException e) { // om val inte �r ett giltligt v�rde s� k�r detta
			 System.out.println("Felaktigt Val!!!");
			}
		 
		// rita ut en pojke
		if (val1 == 1) {  
			String s1 = draw_boy();
			System.out.printf(s1);
		}
		
		// rita ut en flicka
		else if (val1 == 2) {  // rita ut en flicka 
			String s2 = draw_girl();
			System.out.printf(s2);
		}	
		
		// rita  ut en en raket med den h�jd som l�ses in 
		else if (val1 == 3){  //rita ut en raket och skicka med anv�ndarens tal till metoden f�r att ange hur h�g den skall vara
			System.out.println("Ange hur m�nga steg du vill ha i raketen : "); 
			try {
				   val2= Integer.parseInt(stdin.readLine()); // l�ser in anv�ndarens val
				   String s3 = draw_rocket(val2); //k�r draw_rocket med v�rdet i val2
				   System.out.printf(s3);
				   } 
			 catch(NumberFormatException e) { // om val inte �r ett giltligt v�rde s� k�r detta
				 System.out.println("Felaktigt Val!!!");
			 }
			
		}
		
		// avsluta programmet
		else if(val1 == 4) 
			System.exit(0);
		
		// visa felmedelande
		else if (val1 < 1 || val1 > 4)
			System.out.println("Ditt val �r inte giltligt!");
		}
	}
	
	
	
	//metod f�r att rita ut en pojke
	public static String draw_boy() {
		String s = draw_head()+draw_base()+draw_parallel()+draw_base()+draw_cone();
		return s;
	}
	
	//metod f�r att rita ut en flicka
	public static String draw_girl() {
		String s = draw_head()+draw_cone()+draw_base()+draw_cone();
		return s;
	}
	
	//metod f�r att rita ut en racket med en viss h�jd (int) som anv�ndaren matar in.
	public static String draw_rocket(int i) {
		String s1 = "";
		for (int n=0; n < i;) { // s� l�nge n �r mindre �n i s� ritas en sektion till p� h�jden 
			s1 = s1+draw_parallel()+draw_base();
			n++;}
		String s = draw_cone()+draw_base()+s1+draw_cone();
		return s;
	}
	
	//metod draw_head ritar ut ett huvud
	public static String draw_head() {
		String s = " //\\"+"\n"+"|o,o|"+"\n"+" \\v/"+"\n";
		return s;
	}
	
	//metod draw_cone ritar ut en kon
	public static String draw_cone() {
		String s = "  /\\"+"\n"+" /  \\"+"\n"+"/    \\"+"\n";
		return s;
	}
	
	//metod draw_parallel rittar ut tv� prallela streck
	public static String draw_parallel() {
		String s = "|    |"+"\n"+"|    |"+"\n"+"|    |"+"\n";
		return s;
	}
	
	//metod draw_base rittar ut basen
	public static String draw_base() {
		String s = "======"+"\n";
		return s;
	}

}
