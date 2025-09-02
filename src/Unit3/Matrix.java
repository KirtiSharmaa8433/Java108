package Unit3;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        int a[][]=new int[2][3];
        int b[][]=new int[2][3];
        int c[][]=new int[2][3];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter matrix -1 elements");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter matrix -2 elements");

        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("Addition Matrix-");

        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                c[i][j]=a[i][j]+b[i][j];
                System.out.println(c[i][j]+" ");
            }
        }
        System.out.println(" ");


    }
}
