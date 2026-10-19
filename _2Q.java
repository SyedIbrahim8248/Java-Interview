public class _2Q {
    public static void main(String[] args) {
        // find the largest of three numbers
        int a = 30;
        int b = 20;
        int c= 10;
        if(a>=b && b>=c){
            System.out.println(a);
        }else if (b>=c){
            System.out.println(b);
        }else {
            System.out.println(c);
        }

    }
}
