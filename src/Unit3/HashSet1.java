package Unit3;
import java.util.Scanner;
import java.util.HashSet;


public class HashSet1 {
    public static void main(String[] args) {
        HashSet<String> hs1=new HashSet<>();
        HashSet<String> hs2=new HashSet<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter range of set1: ");
        int m=sc.nextInt();
        System.out.println("Enter range of set2: ");

        int n=sc.nextInt();
        System.out.println("Enter elements of set1: ");

        for(int i=0;i<m;i++){
            hs1.add(sc.next());
        }
        System.out.println("Enter elements of set2: ");

        for(int i=0;i<n;i++){
            hs2.add(sc.next());

        }
        System.out.println(hs1);
        System.out.println(hs2);
        hs2.removeAll(hs1);
        System.out.println(hs2);
        hs1.removeIf( str->str.contains("a"));
        System.out.println(hs1);



    }
}
