package Challenges.StacksAndQueues;

public class Queue {
    public Node front;
    public Node rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public boolean isEmpty() {
        return this.front == null;
    }

    public void enqueue (int dataInsert) {
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

    public int dequeue () {
        if (isEmpty()) {
            throw new NullPointerException("The Queue is Empty");
        }
        int result = this.peek();
        Node tempNode = this.front;
        this.front = this.front.next;
        tempNode.next = null;
        return result;
    }

    public Integer peek() {
        return front.getData();
    }

    public Integer peekRear() {
        return rear.getData();
    }
}
