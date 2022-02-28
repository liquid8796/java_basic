
package JavaCore;

public class TypeCasting {
    public static void main(String[] args){
        String name = "Hello";
        Object obj = name;
        name = (String) obj;
        System.err.println(name);
    }
        
}
