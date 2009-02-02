package f2;
import javax.swing.*;

public class Sparande {
  public void spara() {
    int belopp,veckor;

    belopp = Integer.parseInt( JOptionPane.showInputDialog( "Hur mycket sparar du var vecka?" ) );
    veckor = Integer.parseInt( JOptionPane.showInputDialog( "Hur många veckor sparar du? ") );
    JOptionPane.showMessageDialog( null, "Efter "+veckor+" veckor har du "+(belopp*veckor)+" kr." );
  }
}
