public class _63Q {
    public static void main(String[] args) {
        // Question: Write a Java program to find the first and last digits of a positive integer.
        int n = 12345;

        int last = n % 10;
        int first = n;

        while (first >= 10) {
            first = first / 10;
        }

        System.out.println("First Digit = " + first);
        System.out.println("Last Digit = " + last);

    }
}
