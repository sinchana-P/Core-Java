public class If_Example {
    public static void main(String[] args) {
        int n=17;

        // 1. If Statement
        if(n>0){
            // if body: true block
            System.out.println("Yes It Is Greater than Zero");
        }

        // 2. If-Else Statement
        if(n>0){
             //   true block
            System.out.println("Positive Number");
        }
        else{
            // false block
            System.out.println("Negative Number");
        }

        // 3. Ladder If
        int marks;
        marks = 100;

        if(marks >= 90){
            System.out.println("Grade A");
        }
        else if(marks > 80 && marks < 90) {
            System.out.println("Grade B");
        }
        else {
            System.out.println("Fail");
        }


        // 4. Nested If
        int value = 140;

        if(value > 0){
            if(value % 2 == 0){
                System.out.println("Even & Greater than zero");
            }
            else{
                System.out.println("Odd & Greater than zero");
            }
        }
        else{
            System.out.println("Less than zero");
        }

        // 5. One line statements
        if(true)
            System.out.println("Yes, it is true");
    }
}
