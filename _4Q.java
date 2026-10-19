public class _4Q {
    public static void main(String[] args) {
        //check positive or negative or zero
//        int n = -5;
//        if (n > 0) {
//            System.out.println("Positive");
//        } else if (n < 0) {
//            System.out.println("Negative");
//        } else {
//            System.out.println("Zero");

            // check leap year
            int year = 2024;

            if (year % 400 == 0 ||
                    (year % 4 == 0 && year % 100 != 0)) {

                System.out.println("leap Year");
            } else {
                System.out.println("Not Leap year");
            }
        }
    }


