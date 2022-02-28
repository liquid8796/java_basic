
package JavaCore.OOP;

public class Pixel extends Point{
    String color;

    public void clear() {
        super.clear();
        color = null;
        System.out.println("Pixel clear()");
    }
    
}


