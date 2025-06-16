package MyText5StringDemo;

public class StringDemo7 {
    //身份证信息查看
    //2位：省份
    //4位：城市
    //6位：区县
    //7-14位：出生年月日
    //15，16：所在地派出所
    //17位：性别（奇男偶女）
    //18位：随机码
    public static void main(String[] args) {
        String human = "410105201002171234";
        //要求：输出人物信息和出生年月日以及性别
        id(human);
    }
    public static String id(String human){
        String birthday_year = human.substring(6,10);
        String birthday_month = human.substring(10,12);
        String birthday_day = human.substring(12,14);
        char gender = human.charAt(16);
        //用ASCII表转换
        int num = (gender-48)%2;
        System.out.println("人物信息为：");
        System.out.println("生日为："+birthday_year+"年"+birthday_month+"月"+birthday_day+"日");
        System.out.print("性别为：");
        if (num == 0){
            System.out.println("女");
        }else {
            System.out.println("男");
        }
        return "";
    }
}

