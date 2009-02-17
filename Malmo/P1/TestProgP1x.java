/* 
TestProgP1.java
Testprogram för metoderna i Programmeringsuppgift 1
Rolf Axelsson
*/
package p1;
import javax.swing.*;

public class TestProgP1x {
    public void testUppX1(Prog1 prog1) {
//        System.out.println("TEST AV: siffersumma");
//        prog1.siffersumma(1827);
//        prog1.siffersumma(2005);
//        System.out.println();
    }
    
    public void testUppX2(Prog1 prog1) {
//        System.out.println("TEST AV: summaN");
//        prog1.summaN(20,100,210);
//        prog1.summaN(7,1,100);
//        prog1.summaN(7,100,1);
//        System.out.println();
    }
    
    public void testUppX3(Prog1 prog1) {
//        System.out.println("TEST AV: fakultet");
//        prog1.fakultet(4);
//        prog1.fakultet(7);
//        System.out.println();
    }
        
    public void programLoop() {
        Prog1 prog1 = new Prog1();
        TestProgP1 tp1 = new TestProgP1();
        String meny = "Välj den metod som ska anropas:\n\n" + 
                "  1. biljettpris\n" +
                "  2. datum\n" +
                "  3. udda\n" +
                "  4. positivNegativ\n" +
                "  5. serie7\n" +
                "  6. multiplikationstabell\n" +
                "  7. saldo\n" +
                "-------------------------\n" +
                "  8. siffersumma\n" +
                "  9. summaN\n" +
                " 10. fakultet\n" +
                "-------------------------\n" +
                "  0. Avsluta programmet\n\n" +
                "Ange ditt val";
        int val = Integer.parseInt( JOptionPane.showInputDialog( meny ) );
        while(val!=0) {
            switch(val) {
                case 1 : tp1.testUppA(prog1); break;
                case 2 : tp1.testUppB(prog1); break;
                case 3 : tp1.testUppC(prog1); break;
                case 4 : tp1.testUppD(prog1); break;
                case 5 : tp1.testUppE(prog1); break;
                case 6 : tp1.testUppF(prog1); break;
                case 7 : tp1.testUppG(prog1); break;
                case 8 : testUppX1(prog1); break;
                case 9 : testUppX2(prog1); break;
                case 10: testUppX3(prog1); break;
            }
            val = Integer.parseInt( JOptionPane.showInputDialog( meny ) );
        }
    }
    
    public static void main(String[] args) {
        TestProgP1x prog = new TestProgP1x();
        prog.programLoop();
    }
}
