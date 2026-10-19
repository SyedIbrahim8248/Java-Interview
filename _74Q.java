import java.util.Stack;
public class _74Q {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//
//        System.out.println(stack);

        Stack<Integer> s = new Stack<>();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.empty());
    }
}
