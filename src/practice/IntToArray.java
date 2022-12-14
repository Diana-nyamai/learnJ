package practice1;

import java.util.Arrays;

public class IntToArray {
    public static void main(String[] args) {
        int x = 2345;
        String s = Integer.toString(x);
        int[] arr = new int[s.length()];

        for (int i=0; i<s.length(); i++){
            arr[i] = Character.getNumericValue(s.charAt(i));
        }
        System.out.println(Arrays.toString(arr));
    }
}
