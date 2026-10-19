public class _11Q {
    public static void main(String[] args) {
        // check Armstrong number  153 = one power 3 + 5 power three +3 power three
        int n = 153;
        int original = n;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit * digit;
            n /= 10;
        }

        if (sum == original) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }
}


