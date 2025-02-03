import java.util.*;
import java.util.concurrent.*;

public class QueueUsingCollections {
    public static void main(String[] args) {
        System.out.println("Using LinkedList as a Queue:");
        Queue<Integer> linkedListQueue = new LinkedList<>();
        performQueueOperations(linkedListQueue);

        System.out.println("\nUsing ArrayDeque as a Queue:");
        Queue<Integer> arrayDequeQueue = new ArrayDeque<>();
        performQueueOperations(arrayDequeQueue);

        System.out.println("\nUsing PriorityQueue:");
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        performQueueOperations(priorityQueue);

        System.out.println("\nUsing ConcurrentLinkedQueue:");
        Queue<Integer> concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
        performQueueOperations(concurrentLinkedQueue);

        System.out.println("\nUsing LinkedBlockingQueue:");
        BlockingQueue<Integer> linkedBlockingQueue = new LinkedBlockingQueue<>(10);
        performQueueOperations(linkedBlockingQueue);

        System.out.println("\nUsing Deque Interface with ArrayDeque:");
        Deque<Integer> deque = new ArrayDeque<>();
        performDequeOperations(deque);
    }

    private static void performQueueOperations(Queue<Integer> queue) {
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        System.out.println("Queue contents:");
        while (!queue.isEmpty()) {
            System.out.println(queue.peek());
            queue.poll();
        }
    }

    private static void performDequeOperations(Deque<Integer> deque) {
        deque.offerLast(1);  // Add to the end
        deque.offerLast(2);
        deque.offerLast(3);

        System.out.println("Deque contents:");
        while (!deque.isEmpty()) {
            System.out.println(deque.peekFirst());  // Check the front
            deque.pollFirst();  // Remove from the front
        }

        // Demonstrating deque's ability to act as both stack and queue
        deque.offerFirst(4);  // Add to the front
        deque.offerLast(5);   // Add to the end
        deque.offerFirst(6);  // Add to the front

        System.out.println("\nDeque after adding elements to both ends:");
        while (!deque.isEmpty()) {
            System.out.println(deque.peekFirst());
            deque.pollFirst();
        }
    }
}
