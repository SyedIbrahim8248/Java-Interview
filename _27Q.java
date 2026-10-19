public class _27Q {
    public static void main(String[] args) {
        // find the average of array elements
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        System.out.println("Average = " + (sum / arr.length));
    }
}
