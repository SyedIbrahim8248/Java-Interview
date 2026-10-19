public class _31Q {
    public static void main(String[] args) {
        // count zeroes in an array
        int[] arr = {0, 10, 0, 20, 0, 30};
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
