public class _37Q {
    public static void main(String[] args) {
        // find the power of No
        int base = 2;
        int power = 3;
        int result = 1;

        for (int i = 1; i <= power; i++) {
            result = result * base;
        }

        System.out.println(result);

        // find the square of No
        int n = 5;
        System.out.println(n * n);
    }
}
