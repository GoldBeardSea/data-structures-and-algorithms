package Challenges.StacksAndQueues;

public class Queue <T> {
    public Node <T> front;
    public Node <T> rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public boolean isEmpty() {
        return this.front == null;
    }

    public void enqueue (T dataInsert) {
        Node inserted = new Node(dataInsert);
        if (this.front == null) {
            inserted.next = null;
            this.front = inserted;
            this.rear = inserted;
        } else {
            this.rear.next = inserted;
            this.rear = inserted;
        }
    }

    public T dequeue () {
        if (isEmpty()) {
            throw new NullPointerException("The Queue is Empty");
        }
        T result = this.peek();
        Node tempNode = this.front;
        this.front = this.front.next;
        tempNode.next = null;
        return result;
    }

    public T peek() {
        return front.getData();
    }

    public T peekRear() {
        return rear.getData();
    }
}
