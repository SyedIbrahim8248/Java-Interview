public class _59Q {
    public static void main(String[] args) {
        // Write a java program to swap two numbers without using a third variable
        int a = 10;
        int b = 20;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
