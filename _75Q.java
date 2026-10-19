import java.util.Stack;
public class _75Q {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//
//        System.out.println(stack);
//        System.out.println(stack.pop());
//        System.out.println(stack.peek());


//        // insert 10,0,30 and 40 into stack and print it
//        Stack<Integer> stack = new Stack<>();
//
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//        stack.push(40);
//
//        System.out.println(stack);

//        // push three elements and remove the top element
//        Stack<Integer> stack = new Stack<>();
//
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//
//        stack.pop();
//
//        System.out.println(stack);


//        // print the top element without  removing it
//        Stack<Integer> stack = new Stack<>();
//
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//
//        System.out.println(stack.peek());
//


        //check whether  the stack is empty or not
//        Stack<Integer> stack = new Stack<>();
//
//        System.out.println(stack.empty());
//
//        stack.push(10);
//
//        System.out.println(stack.empty());

//
//        // count the element in a stack
//        Stack<Integer> stack = new Stack<>();
//
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//        stack.push(40);
//
//        System.out.println("Size: " + stack.size());



        //Task: Check whether 20 exists in the stack.
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        if (stack.search(20) != -1) {
            System.out.println("Element Found");
        } else {
            System.out.println("Element Not Found");
        }
    }
}
