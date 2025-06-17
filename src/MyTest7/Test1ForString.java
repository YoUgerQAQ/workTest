package MyTest7;

public class Test1ForString {
    public static void main(String[] args) {
        //①当对字符串进行修改的时候，需要使用 StringBuffer 和 StringBuilder 类
        //②和 String 类不同的是，StringBuffer 和 StringBuilder类的对象能够被多次的修改，并且不产生新的未使用对象
        //③StringBuilder 类在 Java 5 中被提出，它和 StringBuffer 之间的最大不同在于 StringBuilder 的方法不是线程安全的（不能同步访问）
        //④由于 StringBuilder 相较于 StringBuffer 有速度优势，多数情况下建议使用 StringBuilder类。然而在应用程序要求线程安全的情况下，则必须使用 StringBuffer 类
        //关于StringBuilder的一些方法测试
        String string = "abcdefgfedcba";
        String s = "1234567";
        boolean f = true;
        char c = 97;
        StringBuilder sb = new StringBuilder(s);
//        sb.reverse();                     倒置
//        int abc = sb.lastIndexOf("d");    倒叙查找
//        int abc = sb.indexOf("bc",1);     顺序查找    同上，如果后面跟了具体位置参数只会返回-1或者正确的下标
//        sb.deleteCharAt(1);               删除指定下标字符
//        sb.delete(1,5);                   删除从x-y的字符
//        sb.appendCodePoint(97);           加入ASCII字符
//        sb.insert(1,s);                   在下标处插入字符
//        sb.append(s) ;                    加入字符
    }
}
