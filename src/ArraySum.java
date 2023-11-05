public class ArraySum {
    public static void main(String[] args) {
//        int nums[] = {12, 13, 14, 15};
        int[] nums = {12, 13, 14, 15};
        int sum=0;

        for(int x : nums){
            sum = sum + x;
        }
        System.out.println("Sum of array is " + sum);
    }
}
