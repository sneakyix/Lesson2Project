import hsa.*;
public class PizzaCost {
    public static void main(String[] args) {
        Console c = new Console();
        double size, total;
        int top;
        c.print("Enter pizza diameter (inches): ");
        size = c.readDouble();
        c.print("Enter number of toppings: ");
        top = c.readInt();
        total = 1.5 + .75 + (top * .75) + (.5 * size);
        c.print("Your total will be: $" + total);
    }
    
}
