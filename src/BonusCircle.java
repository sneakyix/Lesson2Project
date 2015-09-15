import TurtleGraphics.*;
public class BonusCircle {
    public static void main(String[] args) {
        SketchPadWindow s = new SketchPadWindow(600,600);
        StandardPen p = new StandardPen(s);
        int x;
        x=4;
        for(int i = 1; i<=100; i++){
            p.up();
            p.move(x);
            p.down();
            p.move(x);
            p.turn(3.6);
        }
    }
}
