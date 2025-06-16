package MyText5StringDemo;

public class StringDemo1 {
    public static void main(String[] args) {
        //1.直接赋值的方式获取字符串对象
        String s1 = "大家好啊";
        System.out.println(s1);

        //2.使用new的方式获取一个字符串对象
        //空参构造：可以获取一个空白字符串
        String s2 = new String();
        System.out.println("我是"+s2);
        //传递一个字符串，根据传递的内容生成字符串
        String s3 = new String("说的道理");
        System.out.println(s3);
        //创建一个字符数组，根据数组里的内容生成字符串
        char[] some = {'a','b'};
        String s4 = new String(some);
        System.out.println(s4);
        byte[] bytes = {114,110};
        String s5 = new String(bytes);
        System.out.println(s5);//输出r，n(ascii码)
        System.out.println("-----------------------分界线-----------------------");


        //字符串比较
        System.out.println('a' == 'b');//比较的的数据值
        System.out.println(s1 == s2);//比较的是地址值

        //boolean equals 和 boolean equalsIgnorecase
        //第二个忽略大小写
        String t1 = "woc";
        String t2 = new String("Woc");
        boolean result = t1.equals(t2);
        System.out.println(result);
        boolean r2 =  t1.equalsIgnoreCase(t2);
        System.out.println(r2);
    }
}
