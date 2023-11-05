public class Switch_Example {
    public static void main(String[] args) {
        String day = "MON";

        switch(day) {
            case "MON":
                System.out.println("It is monday");
                break;
            case "TUE":
                System.out.println("It is tuesday");
                break;
            case "WED":
                System.out.println("It is wednesday");

            default:
                System.out.println("Invalid day");
                break;
        }
    }
}
