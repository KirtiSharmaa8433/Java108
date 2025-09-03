package Unit3;
import org.w3c.dom.html.HTMLAppletElement;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Collections;
public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> products=new ArrayList<>();
        System.out.println("Enter the number of products");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter products details");
        for(int i=0;i<n;i++){
            products.add(sc.next());
        }

        Collections.sort(products);
        Iterator it=products.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
        products.add(1,"Apple");
        products.addLast("Banana");
        products.addFirst("Orange");
        System.out.println(products.get(1));
    }
}
