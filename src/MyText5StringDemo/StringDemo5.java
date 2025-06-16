package MyText5StringDemo;

import java.util.Scanner;

public class StringDemo5 {
    public static void main(String[] args) {
        System.out.println("请输入需要转换的数字");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        //转中文
        String money = "";
        while (true) {
            int ge = num % 10;
            String number = turnBig(ge);
            money = number + money;
            num = num / 10;
            if (num == 0) {
                break;
            }
        }
        System.out.print(money);
        System.out.println();

        //补零
        int count = 7 - money.length();
        for (int i = 0; i < count; i++) {
            money = "零" + money;
        }
        System.out.println(money);

        //插入单位
        String newMoney = "";
        String[] arr = {"佰","拾","万","仟","佰","拾","元"};
        for (int i = 0; i < 7; i++) {
            char c = money.charAt(i);
            newMoney = newMoney + c + arr[i];
        }
        System.out.println(newMoney);
    }


    public static String turnBig(int num) {
        String[] arr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        return arr[num];
    }
}
