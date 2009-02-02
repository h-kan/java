package laboration2;
import java.awt.*;
import java.awt.event.*;

public class Program2c extends Frame {
  Huvud h = new Huvud();

  public Program2c(Color farg) {
    setBackground(farg);
    setSize(170,200);
    setVisible(true);
    addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    });
  }

  public void paint(Graphics g) {
    h.visa(g);
  }

  public static void main(String args[]) {
    Program2c  m = new Program2c(Color.yellow);
  }
}

class Huvud {
  Linje  vänsterÖga = new Linje(50,100,70,70,Color.magenta);
  Linje  högerÖga = new Linje(100,70,120,100,Color.magenta);
  Linje  näsa  = new Linje(85,100,85,120,Color.black);
  Linje  mun  = new Linje(70,130,100,130,Color.red);
  Ellips huvud = new Ellips(85,100,60,60,Color.orange);

  public Huvud() {}

  public void visa(Graphics g) {
    huvud.visa(g);
    vänsterÖga.visa(g);
    högerÖga.visa(g);
    näsa.visa(g);
    mun.visa(g);
  }
}

class Linje {
  private int x1;
  private int y1;
  private int x2;
  private int y2;
  private Color farg;

  public Linje(int x1,int y1,int x2,int y2, Color farg) {
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
    this.farg = farg;
  }

  public void visa(Graphics g) {
    g.setColor(farg);
    g.drawLine(x1,y1,x2,y2);
  }
}

class Ellips {
  private int x;
  private int y;
  private int xradie;
  private int yradie;
  private Color farg;

  public Ellips(int x,int y,int xradie,int yradie,Color farg) {
    this.x = x;
    this.y = y;
    this.xradie = xradie;
    this.yradie = yradie;
    this.farg = farg;
  }

  public void visa(Graphics g) {
    g.setColor(farg);
    g.fillOval(x-xradie,y-yradie,2*xradie,2*yradie);
  }
}
