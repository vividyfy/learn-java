import java.util.Comparator;
import java.util.PriorityQueue;
//标准库中的优先队列默认是小堆
public class TestPriority {
    static class MyComp implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1 - o2;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new MyComp());
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
