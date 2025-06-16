package MyText5StringDemo;

import java.util.Scanner;

public class StringDemo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入");
        String sc = scanner.next();
        System.out.println(arrTurn(sc));
    }
    public static String arrTurn(String sc){
        String newText = "";
        for (int i = sc.length() - 1; i >= 0; i--) {
            char text = sc.charAt(i);
            newText = newText + text;
        }
        return newText;
    }
}
