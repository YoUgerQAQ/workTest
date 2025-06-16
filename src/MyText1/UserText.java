package MyText1;

public class UserText {
    public static void main(String[] args) {
        //访问无参构造
        User u = new User();//类名 对象名 = new 类名()
        System.out.println(u);
        u.username = "someone";//把someone赋值给username
        System.out.println(u.username);//输出在此项目中赋值的username
        /*u.getUsername();
        u.getEmail();*/ //直接写不会输出，只是获取return值
        System.out.println(u.getEmail());//需要借助sout才可以输出
        u.eat();//执行对象的行为
    }
    //有参和无参都是给成员变量赋值的方法
}
