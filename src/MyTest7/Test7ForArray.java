package MyTest7;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test7ForArray {
    public static void main(String[] args) {
        int[] a = {5,9,4,6,2,7,3,8,1};
        String[] s = {"a","b","c"};
        Arrays.sort(a);
        //sort the array
        for (int i : a){
//            System.out.print(a[i-1]);
        }
        //enhance for loop
        String string = Arrays.toString(a);
        //return a string representation(表示) of array
        int[] a1 = new int[5];
        Arrays.fill(a1,0);
        //let element fill of the array
        IntStream is = Arrays.stream(a);
    }
}
