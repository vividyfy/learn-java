import java.util.Comparator;
import java.util.PriorityQueue;

//匿名内部类
public class TestPriority2 {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1, o2) -> o2 - o1);
        priorityQueue.add(9);
        priorityQueue.add(5);
        priorityQueue.add(2);
        priorityQueue.add(7);
        priorityQueue.add(3);
        priorityQueue.add(6);
        priorityQueue.add(8);

        while (!priorityQueue.isEmpty()) {
            Integer cur = priorityQueue.poll();
            System.out.println(cur);
        }
    }
}
