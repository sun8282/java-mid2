package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeQueueMain {

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.offer(1);
        deque.offer(1);
        deque.offer(1);
        System.out.println("deque = " + deque);

        System.out.println("deque.peek() = " + deque.peek());

        deque.poll();
        deque.poll();
        deque.poll();
        System.out.println("deque = " + deque);
    }
}
