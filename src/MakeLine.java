import hsa.*;
import TurtleGraphics.*;

public class MakeLine {
    public static void main(String[] args) {
        Console c = new Console();
        int x1, x2, y1, y2;
        c.print("Enter the x co-ordinate of the 1st point: ");
        x1 = c.readInt();
        c.print("Enter the y co-ordinate of the 1st point: ");
        y1 = c.readInt();
        c.print("Enter the x co-ordinate of the 2nd point: ");
        x2 = c.readInt();
        c.print("Enter the y co-ordinate of the 2nd point: ");
        y2 = c.readInt();
        SketchPadWindow s = new SketchPadWindow(400,400);
        StandardPen p = new StandardPen(s);
        p.up();
        p.move(x1, y1);
        p.down();
        p.drawString("(" + x1 + "," + y1 + ")");
        p.move(x2, y2);
        p.drawString("(" + x2 + "," + y2 + ")");
        
    }
    
}
