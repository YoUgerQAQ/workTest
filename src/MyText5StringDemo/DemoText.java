package MyText5StringDemo;

import java.util.Scanner;

public class DemoText {
    public static void main(String[] args) {
        System.out.println("创建你的账号");
        Scanner sc = new Scanner(System.in);
        String TureName;
        String TureKey;
        System.out.println("请输入你的用户名");
        TureName = sc.next();
        System.out.println("请输入你的密码");
        TureKey = sc.next();
        String UserName;
        String Key;
        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入用户名");
            UserName = sc.next();
            System.out.println("请输入密码");
            Key = sc.next();
            boolean r1 = TureName.equals(UserName);
            boolean r2 = TureKey.equals(Key);
            if (r1){
                if (r2){
                    System.out.println("登陆成功");
                    break;
                }else {
                    System.out.println("密码错误请重试,还有"+(3-i)+"次机会");
                    System.out.println("----------------");
                }
            }else {
                System.out.println("用户名错误请重试,还有"+(3-i)+"次机会");
                System.out.println("----------------");
            }
        }
    }
}
