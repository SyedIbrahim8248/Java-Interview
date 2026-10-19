public class _64Q {
    public static void main(String[] args) {
        //Question: Write a Java program to count the even and odd digits in a number.
        int n = 123456;
        int even = 0;
        int odd = 0;

        while (n != 0) {

            int digit = n % 10;

            if (digit % 2 == 0) {
                even++;
            } else {
                odd++;
            }

            n = n / 10;
        }

        System.out.println("Even Digits = " + even);
        System.out.println("Odd Digits = " + odd);
    }
}
