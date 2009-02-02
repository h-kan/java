package laboration2;
import javax.swing.*;

public class Program2d {
    public void stringTest() {
        String str1 = "födelsedag", str2 = "gratulationer",
                str3 = "på", str4 = "Hjärtliga", str5 = "!";
        String res="";
        int alder = Integer.parseInt( JOptionPane.showInputDialog( "Ange din ålder" ) );
        // res = ...

        JOptionPane.showMessageDialog( null, res );
    }
}
