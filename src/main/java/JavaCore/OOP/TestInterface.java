
package JavaCore.OOP;

public class TestInterface {
    public static void processValues(String[] names, Lookup<?> table){
        for (int i = 0; i < names.length; i++) {
            Object value = table.find(names[i]);
            if(value != null)
                System.err.println(value);
        }
    }
    public static void main(String[] args){
        Lookup<Integer> l = new IntegerLookup();
        String[] names = {"nam", "man", "ha"};
        processValues(names, l);
    }
}
