package MyTest7;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        int[] a1 = new int[]{1,2,3,4,5,6};
      //int[] a1 = {1,2,3,4,5,6}
        int[] a2 = new int[10];
        for (int i = 0; i < a1.length; i++) {
            System.out.println(a1[i]);
        }
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a2.length; i++) {
            a2[i] = sc.nextInt();
        }
    }
}
