
package JavaCore.OOP;

public class Point {
    double x;
    double y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }  
    
    public void clear(){
        x = 0;
        y = 0;
        System.out.println("Point clear()");
    }
}
