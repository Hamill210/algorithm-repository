package main.java;

import java.util.LinkedList;
import java.util.Queue;

public class ExampleQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(5);
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        print(queue);
        System.out.println(String.format("poll: %d", queue.poll()));
        System.out.println(String.format("poll: %d", queue.poll()));
        System.out.println(String.format("poll: %d", queue.poll()));
        System.out.println(String.format("poll: %d", queue.poll()));
        System.out.println(String.format("poll: %d", queue.poll()));

    }

    private static void print(Queue<Integer> queue) {
        System.out.print("data: ");
        queue.forEach(System.out::print);
        System.out.println(String.format("\nsize: %d", queue.size()));
    }
}
