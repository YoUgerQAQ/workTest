import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int people = sc.nextInt();
        int range[] = new int[people];
        int sr = 0;
        int diff;
        int minR = 0;
        for (int i = 0; i < people; i++) {
            range[i] = sc.nextInt();
            sr += range[i];
        }
        int min = sr;
        for (int i = 0; i < people; i++) {
            diff = Math.abs(range[i]*2-sr);
            if (diff<min){
                min = diff;
                minR = range[i];
            }
        }
        System.out.println(minR);
    }
}
