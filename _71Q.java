public class _71Q {
    public static void main(String[] args) {
        // find the power of a number
        int base = 2;
        int exponent = 5;
        long result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Power = " + result);

    }
}
