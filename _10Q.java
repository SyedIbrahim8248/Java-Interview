public class _10Q {
    public static void main(String[] args) {
        // count digits i a number
        int n = 12345;
        int count = 0;
        do {
            count++;
            n /= 10;
        } while (n != 0);
        System.out.println("Digits = " + count);
    }
}
