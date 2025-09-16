package Unit3;

import java.util.*;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkedHashSet1 {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>(10);
        lhs.add("one");
        lhs.add("two");
        lhs.add("three");
        lhs.add("two");
        System.out.println(lhs);
}
}