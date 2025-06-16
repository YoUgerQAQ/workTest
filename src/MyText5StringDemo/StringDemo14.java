package MyText5StringDemo;

public class StringDemo14 {
    public static void main(String[] args) {
        String A = "abcde";
        String B = "cdeab";
        //将A最左边的字符移动到右边最后和B一样
        System.out.println(check(A,B));
        //System.out.println(ArrayF(A));
    }

    public static boolean check(String A, String B) {
        for (int i = 0; i < A.length(); i++) {
            A = turn(A);
            if (A.equals(B)) {
                return true;
            }
        }
        return false;
    }
    public static String turn (String str){
        char stWord = str.charAt(0);
        String more = str.substring(1);
        return more + stWord;
    }
    /*public static String ArrayF(String str){
        char[] c =  str.toCharArray();
        char first = c[0];
        for (int i = 1; i < c.length; i++) {
            c[i - 1] = c[i];
        }
        c[c.length-1] = first;
        String arr = new String(c);//强制转换
        return arr;
    }*/
}
