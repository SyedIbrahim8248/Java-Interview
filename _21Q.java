public class _21Q {
    public static void main(String[] args) {
        // find the largest element in an array
        int[] arr = {10, 50, 30, 20, 40};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Largest = " + max);
    }
}
