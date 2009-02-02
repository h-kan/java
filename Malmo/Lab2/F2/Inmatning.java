package f2;
import javax.swing.JOptionPane;  // eller  import javax.swing.*;

public class Inmatning {

    public void inmatningExempel() {
        String meddelande, namn; // String   lagrar ett antal tecken
        
        namn = JOptionPane.showInputDialog( "Ange ditt namn" );
        meddelande = "Hej " + namn + "! Vilket vackert namn!!!";
        JOptionPane.showMessageDialog( null, meddelande );
    }

}
