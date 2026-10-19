public class _60Q {
    public static void main(String[] args) {
        // Question: Write a Java program to calculate the sum of squares of the first 5 natural numbers.

        int n = 5;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + (i * i);
        }

        System.out.println("Sum = " + sum);
    }
}



