package MyText5StringDemo;

public class StringDemo9 {
    public static void main(String[] args) {
        //public StringBuilder()  创建一个空白可变字符串对象，不含有任何内容
        StringBuilder sb = new StringBuilder();
        //public StringBuilder(String str)   根据字符串的内容，来创建可变字符串对象
        StringBuilder sc = new StringBuilder("abc");
        //public StringBuilder append(任意类型)   添加数据并返回对象本身

        /*sb.append(1);
        sb.append(2.3);
        sb.append(true);*///可以用链式编程简化成 ↓↓↓
        sb.append(1).append(2.3).append(true);

        System.out.println(sb);
        //public StringBuilder reverse()  反转容器中的内容
        sc.reverse();
        System.out.println(sc);
        //public int length()  返回长度
        //public String toString()  通过toString()就可以实现把StringBuilder转换为String
        sb.toString();
    }
}