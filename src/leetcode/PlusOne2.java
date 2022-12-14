package leetcode;

import java.util.Arrays;

public class PlusOne2 {
    public static int[] plusOne(int[] x) {
        int size = x.length -1;

        for (int i=size; i>=0; i--){
            if (x[i] < 9){
                x[i]++;
                return x;
            }
            else {
                x[i] = 0;
            }
        }
        int[] newnum = new int[x.length];
//        newnum[0] = 1;
        return newnum;
    }
    public static void main(String[] args) {
        int[] x = {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
        int[] y = {2,3,4};

        System.out.println(Arrays.toString(plusOne(y)));
//        System.out.println(Arrays.toString(x));
    }
}
