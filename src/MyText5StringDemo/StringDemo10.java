package MyText5StringDemo;

import java.util.Scanner;

public class StringDemo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String getText = sc.next();
        String sb = new StringBuilder().append(getText).reverse().toString();
        //↑String类型           ← ← ← ← ← ← ← ← ← ←                 ↑变成String
        System.out.println(sb);
        if (getText.equals(sb)){
            System.out.println("当前字符串是对称的");
        }else{
            System.out.println("不对称");
        }
    }
}
