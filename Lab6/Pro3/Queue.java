package Pro3;

import java.util.Arrays;

public class Queue {
    private int[] element;
    private int size;
    private int capacity;

    public Queue(int capacity) {
        this.capacity = capacity;
        element = new int[capacity];
    }

    public Queue() {
        this(8);
    }

    public void enqueue(int v) {
        if (size >= element.length) {
            int[] temp = new int[size * 2];
            System.arraycopy(element, 0, temp, 0, size);
            element = temp;
        }
        element[size++] = v;
    }

    public int dequeue() {
        int dequeuetemp = element[0];
        size--;
        for (int i = 0; i < size; i++) {
            element[i] = element[i + 1];
        }
        return dequeuetemp;

    }

    public boolean empty() {
        if (element[0] == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}
