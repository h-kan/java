package laboration2;
import javax.swing.*;

public class Program2e {
    public void resultat() {
        String namn, res="";
        int tal1,tal2,summa;
        
        namn = JOptionPane.showInputDialog( "Ange ditt namn" );
        tal1 = Integer.parseInt( JOptionPane.showInputDialog( "Ange ett tal" ) );
        tal2 = Integer.parseInt( JOptionPane.showInputDialog( "Ange ett tal till" ) );
        summa = tal1 + tal2;
        res = namn + " så här blir det:\n";
        res += tal1 + "+" + tal2 + "=" + summa + "\n";

        JOptionPane.showMessageDialog( null, res );
    }
}