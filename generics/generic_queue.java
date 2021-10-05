package generics;

import java.util.ArrayList;

class queue<T> {
    int front = -1;
    int rear = -1;
    int size = 5;
    ArrayList<T> a = new ArrayList<>();

    T front() {
        if (front == -1)
            return null;
        else {
            return a.get(front);
        }
    }

    T rear() {
        if (rear == -1)
            return null;
        else {
            return a.get(rear);
        }
    }

    void enqueue(T enter) {
        if (front == -1 && rear == -1) {
            front = 0;
            rear = 0;
            a.add(enter);
            return;
        }
        if (rear == size) {
            System.out.println("queue is full");
            System.out.println("increasing size");
            size += 1;
            rear++;
            a.add(enter);
        } else {
            rear++;
            a.add(enter);
        }
    }

    void dequeue() {
        if (front == -1 && rear == -1) {
            System.out.println("queue is empty");
            return;
        } else if (front == rear) {

            front = -1;
            rear = -1;
        } else {
            front++;
        }
    }

    boolean isEmpty() {
        if (front == -1 && rear == -1)
            return true;
        else
            return false;
    }

    String display() {
        if (front == -1 && rear == -1) {
            return "queue is empty";
        } else {
            String ans = "";
            for (int i = front; i < rear; i++) {
                ans += String.valueOf(a.get(i)) + "->";
            }
            ans += String.valueOf(a.get(rear));
            return ans;
        }
    }
}

public class generic_queue {
    public static void main(String args[]) {
        queue<Integer> q1 = new queue<>();
        System.out.println("enqueuing 3 elements");
        q1.enqueue(1);
        q1.enqueue(2);
        q1.enqueue(3);
        System.out.println("deleting 1 element");
        q1.dequeue();
        System.out.println("displaying the queue elements");
        System.out.println(q1.display());
        queue<String> q2 = new queue<>();
        System.out.println("enqueuing 3 elements");
        q2.enqueue("greetings");
        q2.enqueue("hello");
        q2.enqueue("world");
        System.out.println("deleting 1 element");
        q2.dequeue();
        System.out.println("displaying the queue elements");
        System.out.println(q2.display());
    }
}
