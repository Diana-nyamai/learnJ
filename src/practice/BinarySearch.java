package practice;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 2;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start+end)/2;
            if (target == arr[mid]) {
                System.out.println(mid);
                break;
            } else if (target < arr[mid]) {
                end = mid - 1;

            } else {
                start = mid + 1;
            }
        }
//        return -1;
    }
}
