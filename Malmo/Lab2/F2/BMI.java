package f2;
import javax.swing.*;

public class BMI {
    public void bmiMethod() {
        int vikt;
        double l�ngd,bmi;
        String viktStr;
        
        viktStr = JOptionPane.showInputDialog( "Ange din vikt (hela kg)" );
        vikt = Integer.parseInt( viktStr );
        l�ngd = Double.parseDouble( JOptionPane.showInputDialog( "Ange din l�ngd (m)" ) );
        
        bmi = vikt/(l�ngd*l�ngd);
        
        JOptionPane.showMessageDialog( null, "Ditt BodyMassIndex �r "+bmi );
    }
}

