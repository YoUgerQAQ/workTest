package MyText5StringDemo;

public class StringDemo6 {
    public static void main(String[] args) {
        //String substring(int beginIndex,int endIndex)截取
        //包头不包尾，包左不包右
        //String substring(int beginIndex)
        //截取到末尾
        //只有返回值是截取的小串
        String phone = "13283815826";
        String p = phone.substring(0,3);
        String p1 = phone.substring(7);
        System.out.println(p+","+p1);
        //隐私电话号码
        System.out.println(p+"******"+p1);
    }
}