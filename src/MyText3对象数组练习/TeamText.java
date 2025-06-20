package MyText3对象数组练习;

public class TeamText {
    public static void main(String[] args) {
        //创建数组
        Team[] arr = new Team[3];
        //创建三个数组
        //在小括号里按ctrl+p显示属性
        Team items1 = new Team("001", "华为", 9999.0, 10);
        Team items2 = new Team("002", "Apple", 7999.0, 50);
        Team items3 = new Team("rmb", "MyLover", 9999999.0, 1);

        //把商品添加到数组中
        arr[0] = items1;
        arr[1] = items2;
        arr[2] = items3;

        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            //Team t的Team是指类名叫team,t是指由Team里新建的一个量来储存arr[i]的，就像是int t一样
            Team t = arr[i];
            System.out.println(t.getId() + "," + t.getName() + "," + t.getPrice() + "," + t.getCount());
        }
    }
}
