package Challenges.StacksAndQueues;

public class Stack <T> {


    public Node<T> top;

    public Stack() {
        top = null;
    }

    public boolean isEmpty() {
        return this.top == null;
    }

    public void push(T insertVal) {
        Node addToList = new Node(insertVal);
        addToList.next = top;
        this.top = addToList;
    }

    public T pop() {
        if (isEmpty()) {
            throw new NullPointerException("Stack is Empty");
        }
        T poppedVal = top.getData();
        top = top.next;
        return poppedVal;
    }

    public T peek() {
        return top.getData();
    }
}
