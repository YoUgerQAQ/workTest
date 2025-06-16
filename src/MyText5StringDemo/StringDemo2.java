package MyText5StringDemo;

import java.util.Scanner;

public class StringDemo2 {
    public static void main(String[] args) {
        String s1 = "大家好啊，我是说的尤格";
        //字符串长度:字符串名.length()
        System.out.println(s1.length());//输出字符串这个数组的长度(视为数组)
        for (int i = 0; i < s1.length(); i++) {
            //char是字符类型,对应的是ASCII字符表
            //charAt是用来返回在这个字符串数组中索引到的字符的ASCII码
            char s = s1.charAt(i);
            System.out.print(s + " ");
        }
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.println("输入");
        String s2 = sc.next();
        int big = 0;
        int small = 0;
        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            if (c >= 'a' && c <= 'z') {
                small++;
            } else if (c >= 'A' && c <= 'Z') {
                big++;
            }
        }
        System.out.println("大写有" + big + "个，小写有" + small + "个");
    }
}
