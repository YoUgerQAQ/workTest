package MyText3键盘录入对象数组;

import MyText3对象数组练习.Team;

import java.util.Scanner;

public class CarText {
    public static void main(String[] args) {
        //创建数组
        Scanner sc = new Scanner(System.in);
        Car[] arr = new Car[3];
        //创建汽车对象
        for (int i = 0; i < arr.length; i++) {
            Car item = new Car();
            //输入汽车的属性
            System.out.println("请输入汽车的品牌");
            String brand = sc.next();
            item.setBrand(brand);
            System.out.println("请输入汽车的价格");
            int price = sc.nextInt();
            item.setPrice(price);
            System.out.println("请输入汽车的颜色");
            String color = sc.next();
            item.setColor(color);
            //把汽车对象添加到数组里面
            arr[i] = item;
        }

        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            Car show = arr[i];
            System.out.println("该车是:"+ show.getBrand()+"牌子的售价为:"+ show.getPrice()+"元的"+ show.getColor()+"色汽车");
        }
    }
}
