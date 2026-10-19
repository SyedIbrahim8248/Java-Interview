public class _22Q {
    public static void main(String[] args) {
        // find the smallest elements in an array
        int[] arr = {10, 5, 30, 20, 40};
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Smallest = " + min);
    }
}
