package Pro3;

import java.util.Arrays;
import java.util.Scanner;

import org.w3c.dom.css.Counter;

public class Lab6_Pro3 {
    public static void main(String[] args) {
        Queue queue = new Queue();
        for (int i = 0; i < 20; i++) {
            queue.enqueue(i);
        }
        System.out.println("size equal" + queue.getSize());

        queue.getCapacity();
        for (int i = 0; i < 20; i++) {
            System.out.printf("%2d ", queue.dequeue());
            
        }

    }
}
