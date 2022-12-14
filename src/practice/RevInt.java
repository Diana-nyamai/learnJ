package practice1;

public class RevInt {
    public static void main(String[] args) {
        int x = 123;
        int reversed = 0;
        while(x>0){
            int remainder = x%10;
            reversed = 10*reversed + remainder;
            x=x/10;
        }
        System.out.println(reversed);
    }
}
