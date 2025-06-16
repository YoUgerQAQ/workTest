package Note;

import java.util.Random;

public class 随机数 {
    public static void main(String[] args) {

        int[] arr = new int[10];
        for (int x = 0;x < 100;x++){
            Random r = new Random();
            int a = r.nextInt(100)+1;
            System.out.print(a+" ");
        }
    }
}
