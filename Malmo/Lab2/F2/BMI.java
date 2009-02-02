package f2;
import javax.swing.*;

public class BMI {
    public void bmiMethod() {
        int vikt;
        double längd,bmi;
        String viktStr;
        
        viktStr = JOptionPane.showInputDialog( "Ange din vikt (hela kg)" );
        vikt = Integer.parseInt( viktStr );
        längd = Double.parseDouble( JOptionPane.showInputDialog( "Ange din längd (m)" ) );
        
        bmi = vikt/(längd*längd);
        
        JOptionPane.showMessageDialog( null, "Ditt BodyMassIndex är "+bmi );
    }
}

