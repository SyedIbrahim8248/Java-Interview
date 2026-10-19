public class _24Q {
    public static void main(String[] args) {
        // count even and odd numbers in array
        int[] arr = {1, 2, 3, 4, 5, 6};
        int even = 0;
        int odd = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);

    }
}
