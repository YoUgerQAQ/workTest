package topic;
import java.util.Scanner;

public class 小红的函数最大值 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double lnA = Math.log(a);
        double lnBLnA = Math.log(b * lnA);
        double maxValue = -(lnBLnA + 1) / lnA;

        System.out.printf("%.10f\n", maxValue);
    }
}
