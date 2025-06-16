package MyText5StringDemo;

public class StringDemo17 {
    public static void main(String[] args) {
        String s = "Hello World And Have Fun";
        s.lastIndexOf(" ");
        System.out.println(s.substring(s.lastIndexOf(" ")+1));
        System.out.println(s.substring(s.lastIndexOf(" ")+1).length());
    }
}
