package MyTest7;

public class Test3 {
    public static void main(String[] args) {
        int[] arr = {8,9,3,1,7,8,3,8,5};
        String s = "";
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length-1){
//                sb.append(arr[i]).append(",");
//                s = s + arr[i] + ",";
            }else {
                sb.append(arr[i]);
//                s = s + arr[i];
            }
        }
        System.out.println(sb);
//        System.out.println(s);
    }
}
