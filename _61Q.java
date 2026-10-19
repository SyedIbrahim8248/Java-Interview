public class _61Q {
    public static void main(String[] args) {
        //Question: Write a Java program to find the Greatest Common Divisor (GCD) of two numbers.
        int a = 12;
        int b = 18;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("GCD = " + a);

    }
}
