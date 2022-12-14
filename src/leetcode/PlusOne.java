package leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int [] x = {7,2};
       int converted = 0;
        for(int num : x){
            converted = 10*converted + num;
        }
        int plus1 = converted + 1;

        String cts = String.valueOf(plus1);
        int[] arr = new int[cts.length()];
        for (int i=0; i<cts.length(); i++){
            arr[i] = Character.getNumericValue(cts.charAt(i));
        }
        System.out.println(Arrays.toString(arr));
    }
}
