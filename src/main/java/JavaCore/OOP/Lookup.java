
package JavaCore.OOP;

interface Lookup<T> {
    T find(String name);
}

class IntegerLookup implements Lookup<Integer>{
    private String[] names = {"nam", "trung", "ha"};
    private Integer[] values = {1 ,2 ,3};

    public Integer find(String name) {
        for (int i = 0; i < names.length; i++) {
            if(names[i].equals(name))
                return values[i];
        }
        return null;
    }
    
}
