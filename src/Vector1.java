package Unit3;

import java.util.Vector;

public class Vector1 {
    public static void main(String[] args) {
        Vector<String> v=new Vector<>(3,5);
        v.add("First");
        v.add("Second");
        v.add("Third");
        v.add("Fourth");
        System.out.println(v.capacity());
        System.out.println(v.size());

    }
}