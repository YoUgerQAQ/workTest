package topic;

import java.util.Scanner;

public class OR244讨厌鬼的区间 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l1 = in.nextInt();
        int r1 = in.nextInt();
        int l2 = in.nextInt();
        int r2 = in.nextInt();
        int l3 = in.nextInt();
        int r3 = in.nextInt();
        int[][] arr = {{l1, r1}, {l2, r2}, {l3, r3}};
        int max = -1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) continue;
                int lower = Math.max(arr[i][0], arr[j][0]);
                int upper = Math.min(arr[i][1], arr[j][1]);
                if (lower <= upper) {
                    max = Math.max(max, upper * 2);
                }
            }
        }
        System.out.println(max);
    }
}
