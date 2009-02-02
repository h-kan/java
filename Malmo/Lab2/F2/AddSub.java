package f2;
import javax.swing.*;

public class AddSub {

  public void addSub1() {
    int tal1,tal2;
    String str;
    int addition1;

    str = JOptionPane.showInputDialog( "Ange tal 1");
    tal1 = Integer.parseInt( str );
    str = JOptionPane.showInputDialog( "Ange tal 2");
    tal2 = Integer.parseInt( str );

    addition1 = tal1+tal2;
    System.out.println(tal1+"+"+tal2+"="+addition1);
    System.out.println(tal2+"+"+tal1+"="+(tal2+tal1));
    System.out.println(tal1+"-"+tal2+"="+(tal1-tal2));
    System.out.println(tal2+"-"+tal1+"="+(tal2-tal1));
  }
}
