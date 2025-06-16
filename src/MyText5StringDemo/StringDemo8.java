package MyText5StringDemo;

public class StringDemo8 {
    public static void main(String[] args) {
        String talk = "你玩的真tmd好,sb";
        //替换
        String result = talk.replace("tmd","***");
        System.out.println(result);
        //定义一个敏感词词库
        String[] arr = {"tmd","TMD","sb"};
        for (int i = 0; i < arr.length; i++) {
            talk = talk.replace(arr[i],"***");
        }
        System.out.println(talk);
    }
}
