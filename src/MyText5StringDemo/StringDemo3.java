package MyText5StringDemo;

public class StringDemo3 {
    public static void main(String[] args) {
        int[] arr = {8,9,3,1,7,8,3,8,5};

        System.out.println(arrSetting(arr));
    }
    public static String arrSetting(int[] arr){
        if (arr == null){
            return "error";
        }if (arr.length == 0){
            return "[ ]";
        }
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1){
                result = result + arr[i];
            }else {
                result = result + arr[i] + ",";
            }
        }
        result = result + "]";
        return result;
    }
}
