import hsa.*;
import TurtleGraphics.*;

public class BarGraph {
    public static void main(String[] args) {
        Console c = new Console();
        int num1, num2, num3, num4;
        c.print("Enter number 1 (from 1-200): ");
        num1 = c.readInt();
        c.print("Enter number 2 (from 1-200): ");
        num2 = c.readInt();
        c.print("Enter number 3 (from 1-200): ");
        num3 = c.readInt();
        c.print("Enter number 4 (from 1-200): ");
        num4 = c.readInt();
        SketchPadWindow s = new SketchPadWindow(400,400);
        StandardPen p = new StandardPen(s);
        
        p.setWidth(25);
        
        p.up();
        p.move(-150, -200);
        p.down();
        p.move(-150, (-200 + num1));
        p.up();
        p.move(-150, (-200 + num1 + 25));
        p.down();
        p.drawString("" + num1);
        
        p.up();
        p.move(-100, -200);
        p.down();
        p.move(-100, (-200 + num2));
        p.up();
        p.move(-100, (-200 + num2 + 25));
        p.down();
        p.drawString("" + num2);
        
        p.up();
        p.move(-50, -200);
        p.down();
        p.move(-50, (-200 + num3));
        p.up();
        p.move(-50, (-200 + num3 + 25));
        p.down();
        p.drawString("" + num3);
        
        p.up();
        p.move(0, -200);
        p.down();
        p.move(0, (-200 + num4));
        p.up();
        p.move(0, (-200 + num4 + 25));
        p.down();
        p.drawString("" + num4);
    }
    
}
