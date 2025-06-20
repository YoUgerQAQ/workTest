package MyTest7;

public class Test8 {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 2;
        sum(n1,n2);
        sum(n1);
    }
    //void means no return
    //First in, last out
    public static void sum(int a, int b){
        System.out.println("a="+a+",b="+b);
    }
    static void sum(int a){
        System.out.println("a="+a);
    }
}
