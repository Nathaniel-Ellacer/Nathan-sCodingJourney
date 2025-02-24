package Algorithm;
import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Camellya");
        queue.add("Roccia");
        queue.add("Shorekeeper");

        System.out.println(queue.poll());  
        System.out.println(queue.peek());   
    }
}