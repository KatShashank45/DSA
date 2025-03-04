package com.queue;

public class QueueUsingArray {

    private static final int MAX_SIZE = 10;
    private int[] queue = new int[MAX_SIZE];
    private int currentSize = 0;
    private int start = -1, end = -1;

    public static void main(String[] args) {
        QueueUsingArray queue = new QueueUsingArray();
        
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println("Front element: " + queue.peek());
        System.out.println("Removed element: " + queue.poll());
        System.out.println("Queue size: " + queue.size());
        System.out.println("Is queue empty? " + queue.isEmpty());
    }

    // Adds an element to the queue
    private void offer(int x) {
        if (currentSize == MAX_SIZE) {
            System.out.println("Queue is full!");
            return;
        }
        if (start == -1) start = 0;
        queue[++end] = x;
        currentSize++;
    }

    // Removes and returns the front element
    private int poll() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        int removed = queue[start++];
        currentSize--;
        if (currentSize == 0) start = end = -1;
        return removed;
    }

    // Returns the front element without removing it
    private int peek() {
        return isEmpty() ? -1 : queue[start];
    }

    // Returns the number of elements in the queue
    private int size() {
        return currentSize;
    }

    // Checks if the queue is empty
    private boolean isEmpty() {
        return currentSize == 0;
    }
}
