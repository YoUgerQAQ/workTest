package MyText5StringDemo;

import java.util.Random;

public class StringDemo15 {
    public static void main(String[] args) {
        String give = "abcdefg";
        for (int i = 0; i < 10; i++) {
            give = change(give);
        }
        System.out.println(give);
    }

    public static String change(String str) {
        char[] arr = str.toCharArray();
        Random r1 = new Random();
        Random r2 = new Random();
        int num1 = r1.nextInt(str.length());
        int num2 = r2.nextInt(str.length());
        char space = arr[num1];
            arr[num1] = arr[num2];
            arr[num2] = space;
        String ca = new String(arr);
        return ca;
    }
}
