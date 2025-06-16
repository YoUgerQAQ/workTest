package MyText5StringDemo;

import java.util.Locale;
import java.util.Random;

public class StringDemo16 {
    public static void main(String[] args) {
        String num = "1234567890";
        String eng = "abcdefghijklmnopqrstuvwxyz";
        String aeng = eng+eng.toUpperCase(Locale.ROOT);
        Random r1 = new Random();
        int nr = r1.nextInt(10);
        String[] code = new String[5];
        int setNum = r1.nextInt(code.length);
        String ns = String.valueOf(num.charAt(nr));
        code[setNum] = ns;
        for (int i = 0; i < 5; i++) {
            if (code[i]!=null){
                continue;
            }else {
                int re = r1.nextInt(52);
                String e = String.valueOf(aeng.charAt(re));
                code[i] = e;
            }
        }
        for (int i = 0; i < code.length; i++) {
            System.out.print(code[i]);
        }
        System.out.println();




        //字符串转换成数字进行运算
        String n1 = "12345";
        String n2 = "4321";
        int c = change(n1) + change(n2);
        System.out.println(c);



    }
    public static int change (String num){
        int s = 0;
        for (int i = 0; i < num.length(); i++) {
            int x = num.charAt(i);
            int x1 = (x - 48);
            s = s*10+x1;
        }
        return s;
    }
}
