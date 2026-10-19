public class _8Q {
    public static void main(String[] args) {
        // fibonacci series
        int a = 0;
        int b = 1;
        for(int i = 1; i<=10 ;i++){
            System.out.println(a + " ");
            int  c = a + b;
             a = b;
             b = c;
        }
    }
}
