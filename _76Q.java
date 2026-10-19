import java.util.Queue;
import java.util.LinkedList;

public class _76Q {
    public static void main(String[] args) {
//        //Problem: Write a Java program to insert 10, 20, 30, and 40 into a queue and print the queue.
//        Queue<Integer> q = new LinkedList<>();
//
//        q.offer(10);
//        q.offer(20);
//        q.offer(30);
//        q.offer(40);
//
//        System.out.println(q);


//        //Problem: Remove the first element from a queue.
//
//        Queue<Integer> q = new LinkedList<>();
//
//        q.offer(10);
//        q.offer(20);
//        q.offer(30);
//
//        q.poll();
//
//        System.out.println(q);

//        //Problem: Print the first element without removing it.
//        Queue<Integer> q = new LinkedList<>();
//
//        q.offer(10);
//        q.offer(20);
//        q.offer(30);
//
//        System.out.println(q.peek());


//        //Problem: Check whether the queue is empty.
//        Queue<Integer> q = new LinkedList<>();
//
//        System.out.println(q.isEmpty());
//
//        q.offer(10);
//
//        System.out.println(q.isEmpty());

//        //Problem: Count the number of elements in a queue.
//        Queue<Integer> q = new LinkedList<>();
//
//        q.offer(10);
//        q.offer(20);
//        q.offer(30);
//        q.offer(40);
//
//        System.out.println("Queue size: " + q.size());

//
//        //Problem: Print every element of a queue without removing elements from the original queue.
//
//        Queue<Integer> q = new LinkedList<>();
//
//        q.offer(10);
//        q.offer(20);
//        q.offer(30);
//        q.offer(40);
//
//        for (int num : q) {
//            System.out.println(num);


        //Problem: Check whether 30 exists in the queue.
        Queue<Integer> q = new LinkedList<>();

        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);

        if (q.contains(30)) {
            System.out.println("Element Found");
        } else {
            System.out.println("Element Not Found");
        }
        }
    }


