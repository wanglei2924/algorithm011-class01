package leetcode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        deque.offerLast("one");
        deque.offerLast("two");
        deque.offerLast("three");
        deque.offerLast("four");
        System.out.println(deque);

        String polledElement = deque.pollFirst();
        System.out.println(polledElement);
        System.out.println(deque);

        String peekElment = deque.peekFirst();
        System.out.println(peekElment);
        System.out.println(deque);

        while (deque.size() > 0) {
            System.out.println(deque.pollFirst());
        }
    }
}
