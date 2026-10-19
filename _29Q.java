public class _29Q {
    public static void main(String[] args) {
        // count negative numbers
        int[] arr = {10, -5, -20, 30, -2,-4,-6};
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
