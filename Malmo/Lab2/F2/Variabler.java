package f2;

public class Variabler {
  public void variabler() {
    int heltal=10000000;            //-2 miljarder - 2 miljarder
    long mycketStortTal;            //-9*10^18 - 9*10^18
    double decimaltal=285.43 ;      //15 siffrors noggranhet
    char   tecken;                  //ett tecken
    boolean santFalskt=true;        //true eller false
    String  mångaTecken="Hej!";     //Ett antal tecken

    mycketStortTal=252332000000L;   //Går ej utan L
    tecken='w';                     //Tilldelning av char, Obs: 'a'

    System.out.println("int: "+heltal);           //utskrift av String och int
    System.out.println("long: "+mycketStortTal);  //utskrift av String och long
    System.out.println("double: "+decimaltal);    //utskrift av String och double
    System.out.println("char: "+tecken);          //utskrift av String och char
    System.out.println("boolean: "+santFalskt);   //utskrift av String och boolean
    System.out.println("String: "+mångaTecken);   //utskrift av String och String
  }
}
