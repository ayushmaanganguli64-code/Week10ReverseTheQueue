
import java.util.*;

public class Reverse {

    public static void reverseQueue(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();

        // Move all queue elements into stack
        while (!q.isEmpty()) {
            s.push(q.poll());
        }

        // Move elements back into queue
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        System.out.println("Original Queue: " + q);

        reverseQueue(q);

        System.out.println("Reversed Queue: " + q);
    }
}
