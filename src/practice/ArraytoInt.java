package practice1;

public class ArraytoInt {
    public static void main(String[] args) {
        int[] nums = {2,4,6,7};

        int numsconverted = 0;
        for (int num: nums){
          numsconverted = 10*numsconverted + num;
        }
        System.out.println(numsconverted);
    }
}
