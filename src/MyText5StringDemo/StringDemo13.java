package MyText5StringDemo;

import java.util.Scanner;

public class StringDemo13 {
    public static void main(String[] args) {
        String str;
        while (true){
            Scanner sc = new Scanner(System.in);
            //键盘录入一个字符串
            System.out.println("请输入数字");
            str = sc.next();
            boolean flag = check(str);
            if (flag){
                break;
            }else {
                continue;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int number = str.charAt(i)-48;
            sb.append(change(number));
        }
        System.out.println(sb);
    }
    public static boolean check(String str){
        //要求1∶长度为小于等于9要求2:只能是数字将内容变成罗马数字
        if (str.length()>9){
            System.out.println("输入的太长了！");
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (48>c||c>57){
                System.out.println("不是纯数字");
                return false;
            }
        }
        return true;
    }
    public static String change(int number){
        //Ⅰ - 1、Ⅱ - 2、Ⅲ- 3、Ⅳ - 4、Ⅴ - 5、Ⅵ- 6、Ⅶ- 7、捌- 8、Ⅸ - 9注意点:
        //罗马数字里面是没有0的,如果键盘录入的数字包含0，可以变成””(长度为0的字符串)
        String[] rn = {"","Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅷ","Ⅸ"};
        return rn[number];
    }
}
