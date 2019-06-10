package Challenges.StacksAndQueues;

public class Stack {


    public Node top;

    public Stack() {
        top = null;
    }

    public boolean isEmpty() {
        return this.top == null;
    }

    public void push(int insertVal) {
        Node addToList = new Node(insertVal);
        addToList.next = top;
        this.top = addToList;
    }

    public int pop() {
        if (isEmpty()) {
            throw new NullPointerException("Stack is Empty");
        }
        int poppedVal = top.getData();
        top = top.next;
        return poppedVal;
    }

    public int peek() {
        return top.getData();
    }
}
