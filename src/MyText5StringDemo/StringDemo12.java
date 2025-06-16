package MyText5StringDemo;

import java.util.StringJoiner;

public class StringDemo12 {
    public static void main(String[] args) {
        //StringJoiner
        //StringJoiner(间隔符号)
        //StringJoiner(间隔符号,起始符号,结束符号)
        StringJoiner sj1 = new StringJoiner("--");
        StringJoiner sj2 = new StringJoiner(",","[","]");
        int[] arr = {1,2,3,4};
        //StringJoiner add(添加的内容)  添加数据并且返回对象本身
        //int length()    返回长度（字符出现的个数）
        //String toString    返回一个字符串（该字符串就是拼接之后的结果）
        for (int i = 0; i < arr.length; i++) {
            sj1.add(arr[i]+"");//sj不能跟int类型，需要在后面加上“”来强制转换成字符串类型
            sj2.add(arr[i]+"");
        }
        int l = sj2.length();
        System.out.println(sj1);
        System.out.println(sj2);
        System.out.println(l);
    }
}
