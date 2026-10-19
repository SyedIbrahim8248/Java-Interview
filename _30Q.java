public class _30Q {
    public static void main(String[] args) {
        // search the index of an elements
        int[] arr = {10, 20, 30, 40,35};
        int n = 35;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                System.out.println(i);
                break;
            }
        }

    }
}
