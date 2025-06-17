package MyTest7;

import java.util.Random;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[] arr = new int[5];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
        int[] arr = new int[]{5, 1, 9, 4, 3};
        Random r = new Random();
        int box = 0;
        for (int i = 0; i < arr.length; i++) {
            int ran = r.nextInt(6);
            box = arr[i];
            arr[i] = arr[ran];
            arr[ran] = box;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
