package project5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class CollectionVerification {

    public static void main(String[] args) {
        
        List<String> list = createAndInitializeList();
        printCollection("Initialized List (ArrayList):", list);

        
        Set<Integer> set = createAndInitializeSet();
        printCollection("Initialized Set (HashSet):", set);

        
        Queue<Double> queue = createAndInitializeQueue();
        printCollection("Initialized Queue (LinkedList):", queue);

        
        performCollectionOperations(list, set, queue);
    }

   
    private static List<String> createAndInitializeList() {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        return list;
    }
 
    private static Set<Integer> createAndInitializeSet() {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        return set;
    }

    
    private static Queue<Double> createAndInitializeQueue() {
        Queue<Double> queue = new LinkedList<>();
        queue.add(1.1);
        queue.add(2.2);
        queue.add(3.3);
        return queue;
    }

    private static void performCollectionOperations(List<String> list, Set<Integer> set, Queue<Double> queue) {
        // Add elements to the List
        list.add("Four");
        printCollection("List after Adding 'Four':", list);

        // Remove elements from the Set
        set.remove(20);
        printCollection("Set after Removing 20:", set);

        // Poll elements from the Queue
        Double polledElement = queue.poll();
        System.out.println("Polled Element from Queue: " + polledElement);
        printCollection("Queue after Polling:", queue);
    }

   
    private static <E> void printCollection(String message, Iterable<E> collection) {
        System.out.print(message + " ");
        for (E element : collection) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}


