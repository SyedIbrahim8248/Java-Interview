public class _62Q {
    public static void main(String[] args) {
        //Question: Write a Java program to calculate the product of all digits of a number.
        int n = 234;
        int product = 1;

        while (n != 0) {

            int digit = n % 10;
            product = product * digit;
            n = n / 10;
        }

        System.out.println("Product = " + product);

    }
}
