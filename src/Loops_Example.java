public class Loops_Example {
    public static void main(String[] args) {
        // 1 to 10
        // 1. For Loop
        for(int i=1; i<=10; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i=1; i<=10; i=i+3){
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i=10; i>0; i--){
            System.out.print(i + " ");
        }
        System.out.println();

        // 2. While Loop
        int j = 100;
        while(j <= 110){
            System.out.print(j + " ");
            j++;
        }
        System.out.println();

        // 3. Do While loop
        int k = 100;
        do{
            System.out.print(k + " ");
            k++;
        }while(k <= 110);
        System.out.println();

        // 4. For Each Loop
//        int nums[] = {12,13, 14, 15};   // Warning: C-style array declaration of local variable 'nums'
        int[] nums = {12,13, 14, 15};

        for(int x : nums){
            System.out.println(x);
        }
    }
}
