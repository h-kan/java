/* 
TestProgP1.java
Testprogram för metoderna i Programmeringsuppgift 1
Rolf Axelsson
*/
package p1;
import javax.swing.*;

public class TestProgP1 {
    public void testUppA(Prog1 prog1) {
//        System.out.println("TEST AV: biljettpris");
//        prog1.biljettpris();
//        System.out.println();
    }
    
    public void testUppB(Prog1 prog1) {
//        System.out.println("TEST AV: datum");
//        prog1.datum();
//        System.out.println();
    }
    
    public void testUppC(Prog1 prog1) {
//        System.out.println("TEST AV: udda");
//        prog1.udda();
//        System.out.println();
    }
    
    public void testUppD(Prog1 prog1) {
//        System.out.println("TEST AV: positivNegativ");
//        prog1.positivNegativ();
//        System.out.println();
    }
    
    public void testUppE(Prog1 prog1) {
//        System.out.println("TEST AV: serie7");
//        prog1.serie7(26, 112);
//        prog1.serie7(11, 25);
//        System.out.println();
    }
    
    public void testUppF(Prog1 prog1) {
//        System.out.println("TEST AV: multiplikationstabell");
//        prog1.multiplikationstabell(13,8,12);
//        prog1.multiplikationstabell(5,10,18);
//        System.out.println();
    }
    
    public void testUppG(Prog1 prog1) {
//        System.out.println("TEST AV: saldo");
//        prog1.saldo(1000, 0.04, 9);
//        System.out.println();
//        prog1.saldo(10000, 0.08, 12);
//        System.out.println();
    }
        
    public void programLoop() {
        Prog1 prog1 = new Prog1();
        String meny = "Välj den metod som ska anropas:\n\n" + 
                "1. biljettpris\n" +
                "2. datum\n" +
                "3. udda\n" +
                "4. positivNegativ\n" +
                "5. serie7\n" +
                "6. multiplikationstabell\n" +
                "7. saldo\n" +
                "0. Avsluta programmet\n\n" +
                "Ange ditt val";
        int val = Integer.parseInt( JOptionPane.showInputDialog( meny ) );
        while(val!=0) {
            switch(val) {
                case 1 : testUppA(prog1); break;
                case 2 : testUppB(prog1); break;
                case 3 : testUppC(prog1); break;
                case 4 : testUppD(prog1); break;
                case 5 : testUppE(prog1); break;
                case 6 : testUppF(prog1); break;
                case 7 : testUppG(prog1); break;
            }
            val = Integer.parseInt( JOptionPane.showInputDialog( meny ) );
        }
    }
    
    public static void main(String[] args) {
        TestProgP1 prog = new TestProgP1();
        prog.programLoop();
    }
}
